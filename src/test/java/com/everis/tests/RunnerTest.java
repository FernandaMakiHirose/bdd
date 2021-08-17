package com.everis.tests;

import org.junit.ClassRule;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import com.everis.util.Hooks;

@RunWith(Cucumber.class)

// vai rodar esse teste pela tag que é adicionada na feature
@CucumberOptions(features = "classpath:features", tags = "@test", glue = {""}, 
	monochrome = true, dryRun = false, plugin = { "json:target/cucumber.json", "rerun:target/rerun.txt" })
public class RunnerTest {

	@ClassRule
	public static Hooks hooks = new Hooks();
}