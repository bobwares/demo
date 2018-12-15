package com.bobwares.demo.app.common.registry.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.List;
import lombok.Builder;
import lombok.Value;

@JsonDeserialize(builder = ResourceDefinition.ResourceDefinitionBuilder.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
@Value
public class ResourceDefinition {
  private final String key;
  private final String uri;
  private final String operation;
  private final List<String> dataTypeSupportedList;
  private final String transformer;

  @JsonPOJOBuilder(withPrefix = "")
  public static final class ResourceDefinitionBuilder {
  }

}


