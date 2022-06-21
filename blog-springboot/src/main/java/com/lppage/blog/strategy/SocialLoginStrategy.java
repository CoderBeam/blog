package com.lppage.blog.strategy;

import com.lppage.blog.dto.UserInfoDTO;

/**
 * 第三方登录策略
 *
 * @author liangpeng
 * @date 2022/02/14
 */
public interface SocialLoginStrategy {

    /**
     * 登录
     *
     * @param data 数据
     * @return {@link UserInfoDTO} 用户信息
     */
    UserInfoDTO login(String data);

}
