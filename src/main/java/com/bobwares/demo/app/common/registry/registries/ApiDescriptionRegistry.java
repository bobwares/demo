package com.bobwares.demo.app.common.registry.registries;

import com.bobwares.common.registry.Registry;
import com.bobwares.common.registry.RegistryBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ApiDescriptionRegistry implements Registry<String>, RegistryBuilder<String> {

  private Map<String, String> itemMap = new HashMap<>();

  @Override
  public Optional<String> get(String key) {
    String item = itemMap.get(key);
    if (item != null) {
      return Optional.of(item);
    }
    return Optional.empty();
  }

  @Override
  public <T> void put(String key, T value) {
    itemMap.put(key, (String) value);
  }
}
