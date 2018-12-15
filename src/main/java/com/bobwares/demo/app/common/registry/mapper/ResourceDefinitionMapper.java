package com.bobwares.demo.app.common.registry.mapper;

import com.bobwares.common.mapper.ObjectMappingUtils;
import com.bobwares.common.registry.ResourceMapper;
import java.io.InputStream;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ResourceDefinitionMapper implements ResourceMapper {

  private final ObjectMappingUtils objectMappingUtils;

  @Autowired
  public ResourceDefinitionMapper(ObjectMappingUtils objectMappingUtils) {
    this.objectMappingUtils = objectMappingUtils;
  }

  @Override
  public <T> Optional<T> resourceToObject(Resource resource, Class<T> registryType) {
    try {
      InputStream inputStream = resource.getInputStream();
      T entry = objectMappingUtils.jsonToObject(inputStream, registryType);
      return Optional.of(entry);
    }
    catch (Exception e) {
      log.error("Failed to load configuration for {}", resource, e);
      return Optional.empty();
    }
  }
}
