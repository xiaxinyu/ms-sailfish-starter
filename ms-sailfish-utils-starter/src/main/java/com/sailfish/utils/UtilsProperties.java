package com.sailfish.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(prefix = "utils")
@Data
public class UtilsProperties {
	private String name;
}