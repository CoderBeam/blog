package com.lppage.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lppage.blog.dto.OperationLogDTO;
import com.lppage.blog.vo.PageResult;
import com.lppage.blog.entity.OperationLog;
import com.lppage.blog.vo.ConditionVO;

/**
 * 操作日志服务
 *
 * @author liangpeng
 * @date 2022/02/14
 */
public interface OperationLogService extends IService<OperationLog> {

    /**
     * 查询日志列表
     *
     * @param conditionVO 条件
     * @return 日志列表
     */
    PageResult<OperationLogDTO> listOperationLogs(ConditionVO conditionVO);

}
