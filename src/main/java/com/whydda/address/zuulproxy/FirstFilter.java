package com.whydda.address.zuulproxy;

import org.springframework.beans.factory.annotation.Value;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;

public class FirstFilter implements Filter {
	@Value("${whydda.address.confmkey}")
	private String ConfmKey;

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		if (servletRequest instanceof HttpServletRequest) {
			HttpServletRequest request = (HttpServletRequest) servletRequest;
			HttpRequestWithModifiableParameters tempRequest = new HttpRequestWithModifiableParameters(request); //요렇게 생성해서
			tempRequest.setParameter("confmKey", ConfmKey); //요렇게 값 넣고
			request = (HttpServletRequest)tempRequest; //req로 받으면 됩니다.
			filterChain.doFilter(new HttpServletRequestWrapper(request), servletResponse);
		}
	}
}
