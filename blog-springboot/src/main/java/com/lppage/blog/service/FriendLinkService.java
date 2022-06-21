package com.lppage.blog.service;

import com.lppage.blog.dto.FriendLinkBackDTO;
import com.lppage.blog.dto.FriendLinkDTO;
import com.lppage.blog.vo.ConditionVO;
import com.lppage.blog.vo.PageResult;
import com.lppage.blog.entity.FriendLink;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lppage.blog.vo.FriendLinkVO;

import java.util.List;

/**
 * 友链服务
 *
 * @author liangpeng
 * @date 2022/02/14
 */
public interface FriendLinkService extends IService<FriendLink> {

    /**
     * 查看友链列表
     *
     * @return 友链列表
     */
    List<FriendLinkDTO> listFriendLinks();

    /**
     * 查看后台友链列表
     *
     * @param condition 条件
     * @return 友链列表
     */
    PageResult<FriendLinkBackDTO> listFriendLinkDTO(ConditionVO condition);

    /**
     * 保存或更新友链
     *
     * @param friendLinkVO 友链
     */
    void saveOrUpdateFriendLink(FriendLinkVO friendLinkVO);

}
