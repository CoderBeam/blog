# 博客介绍
博客是基于Vue + SpringBoot开发的前后端分离博客，采用SpringSecurity进行权限管理，ElasticSearch全文搜索，支持QQ、微博第三方登录、在线聊天、发布说说等功能。
前端项目位于blog-vue下，blog为前台，admin为后台
后端项目位于blog-springboot下。
SQL文件位于根目录下的blog-mysql8.sql，需要MYSQL8以上版本。
**ps：请先运行后端项目，再启动前端项目，前端项目配置由后端动态加载。**
## 目录结构
```
blog-springboot
├── annotation    --  自定义注解
├── aspect        --  aop模块
├── config        --  配置模块
├── constant      --  常量模块
├── consumer      --  MQ消费者模块
├── controller    --  控制器模块
├── dao           --  框架核心模块
├── dto           --  dto模块
├── enums         --  枚举模块
├── exception     --  自定义异常模块
├── handler       --  处理器模块（扩展Security过滤器，自定义Security提示信息等）
├── service       --  服务模块
├── strategy      --  策略模块（用于扩展第三方登录，搜索模式，上传文件模式等策略）
├── util          --  工具类模块
└── vo            --  vo模块
```
## 项目特点
+ 前台参考"Hexo"的"Butterfly"设计，美观简洁，响应式体验好。
+ 后台参考"element-admin"设计，侧边栏，历史标签，面包屑自动生成。
+ 采用Markdown编辑器，写法简单。
+ 评论支持表情输入回复等，样式参考Valine。
+ 添加音乐播放器，支持在线搜索歌曲。
+ 前后端分离部署，适应当前潮流。
+ 接入第三方登录，减少注册成本。
+ 支持发布说说，随时分享趣事。
+ 留言采用弹幕墙，更加炫酷。
+ 支持代码高亮和复制，图片预览，深色模式等功能，提升用户体验。
+ 搜索文章支持高亮分词，响应速度快。
+ 新增文章目录、推荐文章等功能，优化用户体验。
+ 新增在线聊天室，支持撤回、语音输入、统计未读数量等功能。
+ 新增aop注解实现日志管理。
+ 支持动态权限修改，采用RBAC模型，前端菜单和后台权限实时更新。
+ 后台管理支持修改背景图片，博客配置等信息，操作简单，支持上传相册。
+ 代码支持多种搜索模式（Elasticsearch或MYSQL），支持多种上传模式（OSS或本地），可支持配置。
+ 代码遵循阿里巴巴开发规范，利于开发者学习。
## 技术介绍
前端： vue + vuex + vue-router + axios + vuetify + element + echarts
后端： SpringBoot + nginx + docker + SpringSecurity + Swagger2 + MyBatisPlus + Mysql + Redis + elasticsearch + RabbitMQ + MaxWell + Websocket
其他： 接入QQ，微博第三方登录，接入腾讯云人机验证、websocket
## 注意事项
+ 项目拉下来运行后，可到后台管理页面网站配置处修改博客相关信息.
+ 邮箱配置，第三方授权配置需要自己申请。
+ ElasticSearch需要自己先创建索引，项目运行环境教程中有介绍。
+ 博客图片资源只能存在Nginx的静态目录下 暂时还不支持存在COS中，正在不停的优化中……
