package com.arturs.tasks.bank;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("AssessRisk")
public class AssessRisk implements JavaDelegate {
    private final Logger LOGGER = Logger.getLogger(AssessRisk.class.getName());

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        LOGGER.info("AssessRisk Invoked");
        execution.setVariable("AssessRisk", "Invoked");
    }

}