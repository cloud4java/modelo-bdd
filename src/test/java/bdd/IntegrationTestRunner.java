package bdd;

import hello.Application;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"},
glue = {"bdd.steps"}, features = "src/test/resources/bdd/features")


@ContextConfiguration
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IntegrationTestRunner {

}
