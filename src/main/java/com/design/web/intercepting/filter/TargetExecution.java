package com.design.web.intercepting.filter;

/**
 * 类描述
 *
 * @author by zhangneng
 */
public class TargetExecution {

    public void execute(String request) {
        System.out.println("target execute:" + request);
    }

}
