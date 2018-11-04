package com;

import com.passport.SingForThirdService;

/**
 * Created by sc on 2018/11/4.
 */
public class Test {

    public static void main(String[] args) {

        SingForThirdService service = new SingForThirdService();

        //不改变原来的代码，也要能够兼容新的需求
        //还可以再加一层策略模式
        service.loginForQQ("sdfgdgfwresdf9123sdf");


    }

}
