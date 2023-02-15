package com.sindalah.service.impl;

import org.springframework.stereotype.Service;

import com.sindalah.exception.RemoteServiceNotAvailableException;
import com.sindalah.service.ServiceAdapter;

@Service
public class ServiceAdapterImpl implements ServiceAdapter {

	@Override
	public String getBackendResponse() {

		throw new RemoteServiceNotAvailableException("Throw custom exception");
	}

	@Override
	public String getBackendResponseFallback() {
		return "Hello from fallback method!!!";
	}

}
