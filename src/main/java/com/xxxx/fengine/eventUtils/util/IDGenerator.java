/**
 * FileName:     IDGenerator.java
 * @Description: this class is used to generate ids in db.
 * @author:      liguanghui
 * @version      V1.0 
 * Createdate:   2014年11月17日 下午03:43:20
 * Copyright:    Copyright(C) 2014-2015
 * Company       Lenovo LTD.
 * All rights Reserved, Designed By Lenovo CIC
 */
package com.xxxx.fengine.eventUtils.util;

import java.text.DateFormat;
import java.util.Date;

public class IDGenerator {

    private static Integer    _count  = 0;
    private static Date       _time   = new Date();
    private static DateFormat _format = new java.text.SimpleDateFormat("yyyyMMddHHmmssSSS");

    public synchronized static String gen() {

        Date now = new Date();
        if (now.getTime() != _time.getTime()) {
            _time = now;
            _count = 0;
        }
        return String.format("%s_%010d", _format.format(_time), _count++);
    }

    public static void main(String args[]) {

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new Runnable() {

                @Override
                public void run() {
                    while (true)
                        System.out.println(IDGenerator.gen());
                }
            });
            thread.start();
        }
    }
}
