package com.lppage.blog.dao;

import com.lppage.blog.entity.Message;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;


/**
 * 留言
 *
 * @author liangpeng
 * @date 2022/02/14
 */
@Repository
public interface MessageDao extends BaseMapper<Message> {

}
