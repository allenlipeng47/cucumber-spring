package com.pengli;

import cucumber.api.java.Before;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import com.pengli.configs.MyConfig;

@SpringBootTest(classes = RunCukesTest.class)   // this can be any class. But it needs one.
@Import({MyConfig.class})
public class CucumberContextConfiguration {
    @Before
    public void setup_cucumber_spring_context() {
        // Dummy method so cucumber will recognize this class as glue
        // and use its context configuration.
    }
}
