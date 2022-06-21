package com.lppage.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lppage.blog.entity.ChatRecord;
import org.springframework.stereotype.Repository;

/**
 * 聊天记录
 *
 * @author liangpeng
 * @date 2022/02/14
 */
@Repository
public interface ChatRecordDao extends BaseMapper<ChatRecord> {
}
