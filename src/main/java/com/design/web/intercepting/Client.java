package com.design.web.intercepting;

import com.design.web.intercepting.filter.AuthenticationFilter;
import com.design.web.intercepting.filter.DebugFilter;
import com.design.web.intercepting.filter.FilterChainManager;
import com.design.web.intercepting.filter.TargetExecution;

/**
 * client执行类，可以根据具体的业务在做一层封装
 *
 * @author by zhangneng
 */
public class Client {

    public static void main(String[] args) {
        // filterManager
        TargetExecution targetExecution = new TargetExecution();
        FilterChainManager filterChainManager = new FilterChainManager(targetExecution);
        // filter
        filterChainManager.addFilter(new DebugFilter());
        filterChainManager.addFilter(new AuthenticationFilter());
        // execute
        filterChainManager.execute("request");

    }

}
