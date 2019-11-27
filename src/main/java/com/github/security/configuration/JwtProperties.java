package com.github.security.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "jwt.security")
public class JwtProperties {

	private String permitUrls; //请求白名单 以逗号分隔

	private int tokenRefreshInterval; // token刷新时间

	public String getPermitUrls() {
		return permitUrls;
	}

	public void setPermitUrls(String permitUrls) {
		this.permitUrls = permitUrls;
	}

	public int getTokenRefreshInterval() {
		return tokenRefreshInterval;
	}

	public void setTokenRefreshInterval(int tokenRefreshInterval) {
		this.tokenRefreshInterval = tokenRefreshInterval;
	}

}
