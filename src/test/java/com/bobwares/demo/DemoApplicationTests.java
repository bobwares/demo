package com.bobwares.demo;

import com.bobwares.Registry;
import com.bobwares.demo.app.common.registry.model.ResourceDefinition;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

  Registry<ResourceDefinition> registry;

  @Test
  public void contextLoads() {
  }

}
