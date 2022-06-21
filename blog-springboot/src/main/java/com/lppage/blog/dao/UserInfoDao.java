package com.lppage.blog.dao;

import com.lppage.blog.entity.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;


/**
 * 用户信息
 *
 * @author liangpeng
 * @date 2022/02/14
 */
@Repository
public interface UserInfoDao extends BaseMapper<UserInfo> {

}
