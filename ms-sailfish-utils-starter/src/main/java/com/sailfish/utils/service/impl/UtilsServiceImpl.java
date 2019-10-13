package com.sailfish.utils.service.impl;

import com.sailfish.utils.UtilsProperties;
import com.sailfish.utils.service.UtilsService;

public class UtilsServiceImpl implements UtilsService {
	@Override
	public String sayHello(UtilsProperties utilsProperties) {
		return "Hello," + utilsProperties.getName();
	}
}
