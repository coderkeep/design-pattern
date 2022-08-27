package com.design.web.intercepting.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 拦截器链
 *
 * @author by zhangneng
 */
public class FilterChain {

    private List<IFilter> filterList = new ArrayList<>();

    private TargetExecution target;

    public void setFilterList(IFilter filter) {
        this.filterList.add(filter);
    }

    public void setTarget(TargetExecution target) {
        this.target = target;
    }

    public void addFilter(IFilter filter){
        this.filterList.add(filter);
    }

    public void execute(String request) {
        for (IFilter filter : filterList) {
            filter.filter(request);
        }
        target.execute(request);
    }
}
