package com.design.facade;

/**
 * 门面类
 *
 * @author zhangneng
 */
public class MoudleFacade {

    public void execute() {

        MoudleA moudleA = new MoudleAImpl();
        moudleA.executeA();

        MoudleBImpl moudleB = new MoudleBImpl();
        moudleB.executeB();

    }
}
