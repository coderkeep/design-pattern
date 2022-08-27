package com.design.web.intercepting.filter;

/**
 * debug拦截器
 *
 * @author zhangneng
 */
public class DebugFilter implements IFilter {

    @Override
    public void filter(String request) {
        System.out.println("request log : " + request);
    }
}
