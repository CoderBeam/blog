# 博客介绍
博客是基于Vue + SpringBoot开发的前后端分离博客，采用SpringSecurity进行权限管理，ElasticSearch全文搜索，支持在线聊天、发布说说等功能。
前端项目位于blog-vue下，blog为前台，admin为后台
后端项目位于blog-springboot下。
SQL文件位于根目录下的blog-mysql8.sql，需要MYSQL8以上版本。
**ps：请先运行后端项目，再启动前端项目，前端项目配置由后端动态加载。**

## 项目特点
+ 前台参考"Hexo"的"Butterfly"设计，美观简洁。
+ 后台参考"element-admin"设计。
+ 采用Markdown编辑器，写法简单。
+ 评论支持表情输入回复等。
+ 前后端分离，适应当前潮流。
+ 留言采用弹幕墙，更加炫酷。
+ 支持代码高亮和复制，图片预览，深色模式等功能，提升用户体验。
+ 搜索文章支持高亮分词，响应速度快。
+ 新增文章目录、推荐文章等功能，优化用户体验。
+ 新增在线聊天室，支持撤回、语音输入、统计未读数量等功能。
+ 后台管理支持修改背景图片，博客配置等信息，操作简单，支持上传相册。
## 技术介绍
前端： vue + vuex + vue-router + axios + vuetify + elementui + echarts
后端： SpringBoot + nginx + SpringSecurity + Swagger2 + MyBatisPlus + Mysql + Redis + Websocket
## 注意事项
+ 博客图片资源只能存在Nginx的静态目录下，暂时还不支持存在腾讯云COS中，正在不停的优化中……
+ 请先运行后端项目，再启动前端项目，前端项目配置由后端动态加载。
+ 现目前暂时不支持QQ、微博第三方登录
