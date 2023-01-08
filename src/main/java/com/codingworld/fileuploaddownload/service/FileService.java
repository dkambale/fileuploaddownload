package com.codingworld.fileuploaddownload.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {

  String storeLocation = "/store";

  public void uploadFile(MultipartFile file) throws IOException {
    // Get the filename and build the local file path
    String filename = file.getOriginalFilename();
    String filepath = Paths.get(storeLocation, filename).toString();

    // Save the file locally
    BufferedOutputStream stream =
        new BufferedOutputStream(new FileOutputStream(new File(filepath)));
    stream.write(file.getBytes());
    stream.close();
  }

  public Resource downloadFile(String fileName) throws Exception {
    try {
      Path filePath = Paths.get(storeLocation + fileName).toAbsolutePath().normalize();
      Resource resource = new UrlResource(filePath.toUri());
      if (resource.exists()) {
        return resource;
      } else {
        throw new Exception("File not found " + fileName);
      }
    } catch (MalformedURLException ex) {
      throw new MalformedURLException("File not found " + fileName);
    }
  }
}
