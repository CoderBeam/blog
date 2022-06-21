package com.lppage.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lppage.blog.entity.Menu;
import com.lppage.blog.entity.OperationLog;
import org.springframework.stereotype.Repository;


/**
 * 操作日志
 *
 * @author liangpeng
 * @date 2022/02/14
 */
@Repository
public interface OperationLogDao extends BaseMapper<OperationLog> {
}
