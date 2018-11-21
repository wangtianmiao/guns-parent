package com.stylefeng.guns.api.user;

/**
 * @author: 磊大大
 * @date: 2018/11/2 9:48
 */
public interface UserAPI {

    int login(String username, String password);

    boolean register(UserModel userModel);

    boolean checkUsername(String username);

    UserInfoModel getUserInfo(int uuid);

    UserInfoModel updateUserInfo(UserInfoModel userInfoModel);

}
