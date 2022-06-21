package com.lppage.blog.service;

import com.lppage.blog.dto.TagBackDTO;
import com.lppage.blog.vo.PageResult;
import com.lppage.blog.dto.TagDTO;
import com.lppage.blog.entity.Tag;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lppage.blog.vo.ConditionVO;
import com.lppage.blog.vo.TagVO;

import java.util.List;

/**
 * 标签服务
 *
 * @author liangpeng
 * @date 2022/02/14
 */
public interface TagService extends IService<Tag> {

    /**
     * 查询标签列表
     *
     * @return 标签列表
     */
    PageResult<TagDTO> listTags();

    /**
     * 查询后台标签
     *
     * @param condition 条件
     * @return {@link PageResult<TagBackDTO>} 标签列表
     */
    PageResult<TagBackDTO> listTagBackDTO(ConditionVO condition);

    /**
     * 搜索文章标签
     *
     * @param condition 条件
     * @return {@link List<TagDTO>} 标签列表
     */
    List<TagDTO> listTagsBySearch(ConditionVO condition);

    /**
     * 删除标签
     *
     * @param tagIdList 标签id集合
     */
    void deleteTag(List<Integer> tagIdList);

    /**
     * 保存或更新标签
     *
     * @param tagVO 标签
     */
    void saveOrUpdateTag(TagVO tagVO);

}
