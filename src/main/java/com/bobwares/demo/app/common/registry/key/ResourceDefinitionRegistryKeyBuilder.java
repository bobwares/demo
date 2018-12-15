package com.bobwares.demo.app.common.registry.key;

import com.bobwares.demo.app.common.registry.model.ResourceDefinition;
import com.bobwares.common.registry.RegistryKeyBuilder;
import org.springframework.stereotype.Service;

@Service
public class ResourceDefinitionRegistryKeyBuilder implements RegistryKeyBuilder<ResourceDefinition> {

  @Override
  public <T> String build(String resourceName, T item) {
    return ((ResourceDefinition) item).getKey();
  }
}
