package com.bobwares.demo.app.common.registry.mapper;

import com.bobwares.common.registry.ResourceMapper;
import java.io.File;
import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ApiDescriptionMapper implements ResourceMapper {

  @Override
  public <T> Optional<T> resourceToObject(Resource resource, Class<T> registryType) {
    StringBuilder result = new StringBuilder();

    try {
      File file = resource.getFile();

      Scanner scanner = new Scanner(file);

      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        result.append(line).append("\n");
      }

      return Optional.of((T)result.toString());
    }
    catch (IOException e) {
      log.error("Failed to load configuration for {}", resource.getFilename(), e);
      return Optional.empty();
    }
  }

}

