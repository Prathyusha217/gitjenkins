package com.App.TestCases;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features", glue= {"com.App.TestCases"})
public class testrunner extends AbstractTestNGCucumberTests
{
  @Test
  public void f() {
  }
}
