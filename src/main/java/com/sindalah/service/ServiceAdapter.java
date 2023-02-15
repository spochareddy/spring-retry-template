package com.sindalah.service;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;

import com.sindalah.exception.RemoteServiceNotAvailableException;

public interface ServiceAdapter {

	@Retryable(value = { RemoteServiceNotAvailableException.class }, maxAttempts = 3, backoff = @Backoff(delay = 1000))
	public String getBackendResponse();

	@Recover
	public String getBackendResponseFallback();

}
