package com.arturs.tasks.bank;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("PrepareSpecialTerms")
public class PrepareSpecialTerms implements JavaDelegate {
    private final Logger LOGGER = Logger.getLogger(PrepareSpecialTerms.class.getName());

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        LOGGER.info("PrepareSpecialTerms Invoked");

        execution.setVariable("PrepareSpecialTerms", "Invoked");
    }

}