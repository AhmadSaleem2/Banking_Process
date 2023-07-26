package com.arturs.tasks.bank;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("CalculateTerms")
public class CalculateTerms implements JavaDelegate {
    private final Logger LOGGER = Logger.getLogger(CalculateTerms.class.getName());

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        LOGGER.info("CalculateTerms Invoked");

        execution.setVariable("CalculateTerms", "Invoked");
    }

}