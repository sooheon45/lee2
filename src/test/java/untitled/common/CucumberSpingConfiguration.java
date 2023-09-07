package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.BoundedContext353Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext353Application.class })
public class CucumberSpingConfiguration {}
