package com.bobwares.demo.app.common.registry.registries;

import com.bobwares.demo.app.common.registry.model.ResourceDefinition;
import com.bobwares.common.registry.Registry;
import com.bobwares.common.registry.RegistryBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ResourceDefinitionRegistry implements Registry<ResourceDefinition>, RegistryBuilder<ResourceDefinition> {

  private Map<String,ResourceDefinition> objectMap = new HashMap<>();

  @Override
  public Optional<ResourceDefinition> get(final String key) {
    ResourceDefinition resourceDefinition = objectMap.get(key);
    if (resourceDefinition == null) {
      return Optional.empty();
    }
    return Optional.of(resourceDefinition);
  }

  @Override
  public <T> void put(String key, T value) {
    objectMap.put(key, (ResourceDefinition) value);
  }
}