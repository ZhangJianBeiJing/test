/**
 * Project:      CommonEvent
 * FileName:     IEventFinishedCallback.java
 * @Description: TODO
 * @author:      ligh4
 * @version      V1.0 
 * Createdate:   2015年3月16日 下午4:34:04
 * Copyright:    Copyright(C) 2014-2015
 * Company       Lenovo LTD.
 * All rights Reserved, Designed By Lenovo CIC.
 */
package com.xxxx.fengine.eventUtils;

/**
 * 回调接口
 * @author ligh4 2015年3月16日下午4:34:04
 */
public interface IEventConsumedCallback {
    /**
     * 事件结束
     * @param event
     * @param result
     */
    public void onEventFinished(Event event, Object result);
}
