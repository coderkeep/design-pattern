package com.design.web.intercepting.filter;

/**
 * 拦截器类
 *
 * @author zhangneng
 */
public interface IFilter {

    /**
     * 拦截方法
     *
     * @param request
     */
    void filter(String request);
}
