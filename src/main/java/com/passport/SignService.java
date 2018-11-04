package com.passport;


import com.Member;
import com.ResultMsg;

/**
 * Created by sc on 2018/11/4.
 */
public class SignService {

    /**
    * Author: sc
    * Since: 2018/11/4
    * Describe:注册
    * Update: [变更日期YYYY-MM-DD][更改人姓名][变更描述]
    */
    public ResultMsg regist(String username, String passport){
        return new ResultMsg("200","成功",new Member());
    }

    /**
    * Author: sc
    * Since: 2018/11/4
    * Describe:登录
    * Update: [变更日期YYYY-MM-DD][更改人姓名][变更描述]
    */
    public ResultMsg login(String username,String passport){
        return null;
    }
}
