package com.design.web.intercepting.filter;

/**
 * 拦截器context类，用来操作具体的 FilterChain
 *
 * @author by zhangneng
 */
public class FilterChainManager {

    private FilterChain filterChain;

    public FilterChainManager(TargetExecution execution) {
        this.filterChain = new FilterChain();
        filterChain.setTarget(execution);
    }

    public void addFilter(IFilter filter){
        this.filterChain.addFilter(filter);
    }

    public void execute(String request){
        filterChain.execute(request);
    }

}
