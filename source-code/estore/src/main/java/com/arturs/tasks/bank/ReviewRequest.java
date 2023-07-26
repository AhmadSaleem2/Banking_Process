package com.arturs.tasks.bank;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("ReviewRequest")
public class ReviewRequest implements JavaDelegate {
    private final Logger LOGGER = Logger.getLogger(ReviewRequest.class.getName());

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        LOGGER.info("ReviewRequest Invoked");

        execution.setVariable("ReviewRequest", "Invoked");

        if (execution.hasVariable("passStandardTermsApplicable")) {

            boolean sta = (boolean) execution.getVariable("passStandardTermsApplicable");

            execution.setVariable("passStandardTermsApplicable", sta);
        }
    }

}