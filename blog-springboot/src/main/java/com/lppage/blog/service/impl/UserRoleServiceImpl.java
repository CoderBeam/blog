package com.lppage.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lppage.blog.dao.UserInfoDao;
import com.lppage.blog.dao.UserRoleDao;
import com.lppage.blog.entity.UserRole;
import com.lppage.blog.enums.RoleEnum;
import com.lppage.blog.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


/**
 * 用户角色服务
 *
 * @author liangpeng
 * @date 2022/02/14
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleDao, UserRole> implements UserRoleService {


}
