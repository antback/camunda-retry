package com.dchavez.camunda.adapter;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CancelCarAdapter implements JavaDelegate {
	
	private static final Logger logger = LoggerFactory.getLogger(CancelCarAdapter.class);

	@Override
	public void execute(DelegateExecution execution) throws Exception {

		logger.debug("cancel car for '" + execution.getVariable("name") + "'");

	}

}
