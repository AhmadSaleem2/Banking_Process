package com.arturs.tasks.customer;

import camundajar.impl.com.google.gson.Gson;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.logging.Logger;

@Component("ProcessCustomerOutput")
public class ProcessCustomerOutput implements JavaDelegate {

    @Autowired
    private Gson gsonParser;
    private final Logger LOGGER = Logger.getLogger(ProcessCustomerOutput.class.getName());

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        LOGGER.info("ProcessCustomerOutput Invoked");
        execution.setVariable("ProcessCustomerOutput", "Invoked");

        LOGGER.info("Final Execution Variables :" + gsonParser.toJson(execution.getVariables(), Map.class));


    }
}