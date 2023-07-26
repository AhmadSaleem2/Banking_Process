package com.arturs.tasks.bank;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("PrepareContract")
public class PrepareContract implements JavaDelegate {
    private final Logger LOGGER = Logger.getLogger(PrepareContract.class.getName());

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        LOGGER.info("PrepareContract Invoked");

        execution.setVariable("PrepareContract", "Invoked");
    }

}