/**
 * Project:      CommonEvent
 * FileName:     Event.java
 * @Description: TODO
 * @author:      ligh4
 * @version      V1.0 
 * Createdate:   2015年3月16日 下午4:28:45
 * Copyright:    Copyright(C) 2014-2015
 * Company       Lenovo LTD.
 * All rights Reserved, Designed By Lenovo CIC.
 */
package com.xxxx.fengine.eventUtils;

import com.xxxx.fengine.eventUtils.util.IDGenerator;

/**
 * 事件类
 */
public class Event {
    private String id;
    private String type;
    private Object param;

    public Event(String type) {
        this.id = IDGenerator.gen();
        this.type = type;
    }

    public Event(String type, Object param) {
        this.id = IDGenerator.gen();
        this.type = type;
        this.param = param;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Object getParam() {
        return param;
    }
}
