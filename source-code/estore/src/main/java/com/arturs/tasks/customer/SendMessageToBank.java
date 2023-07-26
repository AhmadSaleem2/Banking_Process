package com.arturs.tasks.customer;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component("SendMessageToBank")
public class SendMessageToBank implements JavaDelegate {
    private final Logger LOGGER = Logger.getLogger(SendMessageToBank.class.getName());

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        LOGGER.info("SendMessageToBank Invoked");

        RuntimeService runtimeService = execution.getProcessEngineServices().getRuntimeService();

        runtimeService.startProcessInstanceByMessage("customerMessage", execution.getProcessBusinessKey(), execution.getVariables());

        execution.setVariable("SendMessageToBank", "Successful");

    }

}