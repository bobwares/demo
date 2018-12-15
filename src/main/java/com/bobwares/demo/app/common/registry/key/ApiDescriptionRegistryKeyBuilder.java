package com.bobwares.demo.app.common.registry.key;

import com.bobwares.common.registry.RegistryKeyBuilder;
import org.springframework.stereotype.Service;

@Service
public class ApiDescriptionRegistryKeyBuilder implements RegistryKeyBuilder<String> {

  @Override
  public <T> String build(String resourceName, T item) {
    return resourceName;
  }
}
