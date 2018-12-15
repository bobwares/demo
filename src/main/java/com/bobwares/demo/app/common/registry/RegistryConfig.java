package com.bobwares.demo.app.common.registry;

import com.bobwares.demo.app.common.registry.model.ResourceDefinition;
import com.bobwares.common.registry.RegistryBuilder;
import com.bobwares.common.registry.RegistryKeyBuilder;
import com.bobwares.common.registry.RegistryLoader;
import com.bobwares.common.registry.ResourceLoader;
import com.bobwares.common.registry.ResourceMapper;
import com.bobwares.common.registry.ResourceReader;
import com.bobwares.common.registry.impl.RegistryLoaderImpl;
import com.bobwares.common.registry.impl.ResourceReaderImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RegistryConfig {

  @Bean
  public ResourceReader apiDescriptionResourceReader(
      ResourceMapper apiDescriptionMapper,
      RegistryBuilder apiDescriptionRegistry,
      RegistryKeyBuilder apiDescriptionRegistryKeyBuilder) {
    return new ResourceReaderImpl<String>(apiDescriptionMapper, apiDescriptionRegistry, apiDescriptionRegistryKeyBuilder);
  }

  @Bean
  public RegistryLoader apiDescriptionRegistryLoader(ResourceLoader resourceLoader,ResourceReader apiDescriptionResourceReader) {
    return new RegistryLoaderImpl<>(resourceLoader, apiDescriptionResourceReader, "swagger", "md", String.class );
  }

  @Bean
  public ResourceReader resourceDefinitionResourceReader(
      ResourceMapper resourceDefinitionMapper,
      RegistryBuilder resourceDefinitionRegistry,
      RegistryKeyBuilder resourceDefinitionRegistryKeyBuilder) {
    return new ResourceReaderImpl<String>(resourceDefinitionMapper, resourceDefinitionRegistry, resourceDefinitionRegistryKeyBuilder);
  }

  @Bean
  public RegistryLoader resourceDefinitionRegistryLoader(ResourceLoader resourceLoader,ResourceReader resourceDefinitionResourceReader) {
    return new RegistryLoaderImpl<>(resourceLoader, resourceDefinitionResourceReader, "resourceDefinitions", "json", ResourceDefinition.class );
  }




}
