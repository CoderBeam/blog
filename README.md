# 博客介绍
一个基于Vue + Spring Boot开发的前后端分离的个人博客，采用了目前国内较为主流的技术栈。系统支持在线聊天、发布说说等功能，使用媒体查询针对不同终端设备的用户提供更加舒适的界面和更好的用户体验。

## 项目特点
+ 前台参考"Hexo"的"Butterfly"设计，美观简洁。
+ 后台参考若依框架设计。
+ 采用Markdown编辑器。
+ 评论支持表情输入回复等。
+ 前后端分离，适应当前潮流。
+ 支持代码高亮和复制，图片预览，深色模式等功能，提升用户体验。
+ 后台管理支持修改背景图片，博客配置等信息，操作简单，支持上传相册。
## 技术介绍
前端：Vue2.0、Vue-cli、Vue-Router、Vuex、Axios、ElementUI、Echarts
后端：Spring Boot、Nginx、Spring Security、Swagger2、MyBatis Plus、MySQL、Redis、Websocket

## 注意事项
+ 博客图片资源只能存在Nginx的静态目录下，暂时还不支持存在腾讯云COS中，正在不停的优化中……
+ 前端项目位于blog-vue下，blog为前台，admin为后台；后端项目位于blog-springboot下；需要MYSQL8以上版本。
+ 请先运行后端项目，再启动前端项目，前端项目配置由后端动态加载。
+ 由于无服务器和域名，项目暂未部署，故现目前暂时不支持QQ、微博第三方登录

