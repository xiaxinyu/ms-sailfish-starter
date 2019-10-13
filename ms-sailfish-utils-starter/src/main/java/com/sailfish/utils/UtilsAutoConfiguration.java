package com.sailfish.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sailfish.utils.service.impl.UtilsServiceImpl;

@Configuration
@EnableConfigurationProperties(UtilsProperties.class)
@ConditionalOnClass(UtilsServiceImpl.class)
@ConditionalOnProperty(prefix = "utils", value = "enable", matchIfMissing = true)
public class UtilsAutoConfiguration {

	@Autowired
	private UtilsProperties utilsProperties;

	/**
	 * 给bean注入参数，同时返回一个bean实例 同时注解表名，返回是一个bean实例
	 * 当容器中没有这个bean实例的时候，就返回一个自动注入好参数的bean实例回去
	 * 
	 * @return HelloService
	 */
	@Bean
	@ConditionalOnMissingBean(UtilsServiceImpl.class)
	public UtilsServiceImpl utilsServiceImpl() {
		UtilsServiceImpl utilsService = new UtilsServiceImpl();
		return utilsService;
	}
}
