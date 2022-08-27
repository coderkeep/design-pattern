package com.design.web.intercepting.filter;

/**
 * 授权拦截器
 *
 * @author zhangneng
 */
public class AuthenticationFilter implements IFilter {

    @Override
    public void filter(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
