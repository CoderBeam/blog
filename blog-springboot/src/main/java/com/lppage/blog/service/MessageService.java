package com.lppage.blog.service;

import com.lppage.blog.dto.MessageBackDTO;
import com.lppage.blog.vo.PageResult;
import com.lppage.blog.vo.ConditionVO;
import com.lppage.blog.vo.MessageVO;
import com.lppage.blog.dto.MessageDTO;
import com.lppage.blog.entity.Message;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lppage.blog.vo.ReviewVO;

import java.util.List;

/**
 * 留言服务
 *
 * @author liangpeng
 * @date 2022/02/14
 */
public interface MessageService extends IService<Message> {

    /**
     * 添加留言弹幕
     *
     * @param messageVO 留言对象
     */
    void saveMessage(MessageVO messageVO);

    /**
     * 查看留言弹幕
     *
     * @return 留言列表
     */
    List<MessageDTO> listMessages();

    /**
     * 审核留言
     *
     * @param reviewVO 审查签证官
     */
    void updateMessagesReview(ReviewVO reviewVO);

    /**
     * 查看后台留言
     *
     * @param condition 条件
     * @return 留言列表
     */
    PageResult<MessageBackDTO> listMessageBackDTO(ConditionVO condition);

}
