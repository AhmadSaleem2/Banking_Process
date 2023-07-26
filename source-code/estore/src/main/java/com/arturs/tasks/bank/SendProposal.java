package com.arturs.tasks.bank;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("SendProposal")
public class SendProposal implements JavaDelegate {
    private final Logger LOGGER = Logger.getLogger(SendProposal.class.getName());

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        LOGGER.info("SendProposal Invoked");

        execution.setVariable("SendProposal", "Invoked");
        execution.setVariable("isProposalSent", true);

        execution.getProcessEngineServices().getRuntimeService()
                .createMessageCorrelation("proposalMessage")
                .processInstanceBusinessKey(execution.getProcessBusinessKey())
                .setVariables(execution.getVariables())
                .correlate();

    }

}