package com.bobwares.demo.app.common.registry;

import static org.junit.Assert.assertNotNull;

import com.bobwares.common.registry.Registry;
import com.bobwares.demo.app.common.registry.model.ResourceDefinition;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommonApplicationTests {

  @Autowired
  Registry<String> apiDescriptionRegistry;

  @Autowired
  Registry<ResourceDefinition> resourceDefinitionRegistry;

  @Test
  public void builder() {
    assertNotNull(apiDescriptionRegistry);
    assertNotNull(resourceDefinitionRegistry);

  }

}
