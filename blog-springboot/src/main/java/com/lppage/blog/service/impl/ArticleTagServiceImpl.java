package com.lppage.blog.service.impl;

import com.lppage.blog.entity.ArticleTag;
import com.lppage.blog.dao.ArticleTagDao;
import com.lppage.blog.service.ArticleTagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 文章标签服务
 *
 * @author liangpeng
 * @date 2022/02/14
 */
@Service
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagDao, ArticleTag> implements ArticleTagService {

}
