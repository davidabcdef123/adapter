package com.passport;

import com.ResultMsg;

/**
 * Created by sc on 2018/11/4.
 */
public class SingForThirdService extends SignService {

    public ResultMsg loginForQQ(String openid){
        return loginForRegist(openid,null);
    }


    public ResultMsg loginForWechat(String openId){
        return null;
    }

    public ResultMsg loginForToken(String token){
        //通过token拿到用户信息，然后再重新登陆了一次
        return  null;
    }

    public ResultMsg loginForTelphone(String telphone,String code){
        return null;
    }


    private ResultMsg loginForRegist(String openid, String passport) {
        super.regist(openid, passport);
        return super.login(openid, passport);
    }
}
