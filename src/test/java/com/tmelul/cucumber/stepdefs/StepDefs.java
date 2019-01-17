package com.tmelul.cucumber.stepdefs;

import com.tmelul.FeiTristApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = FeiTristApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
