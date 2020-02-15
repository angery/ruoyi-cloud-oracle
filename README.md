## 平台简介

### 文档 http://doc.rycloud.zmrit.com

### 源码
- [Github](https://github.com/angery/ruoyi-cloud-oracle)
- [Gitee](https://gitee.com/angery/ruoyi-cloud-oracle.git)


#### 分支说明

- **master** spring原生方式，使用eureka做注册中心和spring config做配置中心
- **nacos** 集成spring-cloud-alibaba 使用nacos做注册中心和配置中心

本项目FORK自  [zhangmrit/ruoyi-cloud](https://github.com/zhangmrit/ruoyi-cloud)

依次绑定host：

127.0.0.1 eureka7001.com

127.0.0.1 gateway.com

如果要使用eureka集群，请依次绑定eureka7002.com,eureka7003.com后修改各项目中的注释部分

```
ruoyi-cloud
|
├──ruoyi-common --通用包
|  |
|  ├──ruoyi-common-core --核心工具包
|  |
|  ├──ruoyi-common-redis --redis工具包
|  |
|  ├──ruoyi-common-log --日志工具包
|  |
|  ├──ruoyi-common-auth --权限工具包
|
├──ruoyi-config --cloud统一配置中心
|
├──ruoyi-eureka --注册中心
|
├──ruoyi-gateway --网关
|
├──ruoyi-service-api --服务api模块
|  |
|  ├──ruoyi-system-api --系统业务api
|
├──ruoyi-service --微服务
|  |
|  ├──ruoyi-system --系统业务
|  |
|  ├──ruoyi-auth --授权中心
|  |
|  ├──ruoyi-gen --代码生成
|  |
|  ├──ruoyi-dfs --文件
|
├──ruoyi-tool --工具
|  |
|  ├──ruoyi-monitor --监控中心
|
├──ruoyi-ant --前端 使用ant design框架

```



启动顺序：
- eureka
- config
- gateway
- system
- auth
- gen 可选
- dfs 可选

菜单sql有增加字段，以上传到sql文件
该分支是ant分支，前端使用ant-design-vue 项目地址 [ruoyi-ant-oracle](https://gitee.com/angery/ruoyi-ant-oracle)

monitor使用springadmin完成,目前只是最简单的用法,[详戳](http://doc.rycloud.zmrit.com/#/extra?id=%e7%9b%91%e6%8e%a7)
## 平台简介
来自 https://github.com/zhangmrit/ruoyi-cloud MySQL改造成oracle
### 文档 http://doc.rycloud.zmrit.com

### 源码
- [Github](https://github.com/angery/ruoyi-cloud-oracle)
- [Gitee](https://gitee.com/angery/ruoyi-cloud-oracle.git)

#### 分支说明

- **master** spring原生方式，使用eureka做注册中心和spring config做配置中心
- **nacos** 集成spring-cloud-alibaba 使用nacos做注册中心和配置中心

本项目FORK自  [zhangmrit/ruoyi-cloud](https://github.com/zhangmrit/ruoyi-cloud)

依次绑定host：

127.0.0.1 eureka7001.com

127.0.0.1 gateway.com

如果要使用eureka集群，请依次绑定eureka7002.com,eureka7003.com后修改各项目中的注释部分

```
ruoyi-cloud
|
├──ruoyi-common --通用包
|  |
|  ├──ruoyi-common-core --核心工具包
|  |
|  ├──ruoyi-common-redis --redis工具包
|  |
|  ├──ruoyi-common-log --日志工具包
|  |
|  ├──ruoyi-common-auth --权限工具包
|
├──ruoyi-config --cloud统一配置中心
|
├──ruoyi-eureka --注册中心
|
├──ruoyi-gateway --网关
|
├──ruoyi-service-api --服务api模块
|  |
|  ├──ruoyi-system-api --系统业务api
|
├──ruoyi-service --微服务
|  |
|  ├──ruoyi-system --系统业务
|  |
|  ├──ruoyi-auth --授权中心
|  |
|  ├──ruoyi-gen --代码生成
|  |
|  ├──ruoyi-dfs --文件
|
├──ruoyi-tool --工具
|  |
|  ├──ruoyi-monitor --监控中心
|
├──ruoyi-ant --前端 使用ant design框架

```



启动顺序：
- eureka
- config
- gateway
- system
- auth
- gen 可选
- dfs 可选

菜单sql有增加字段，以上传到sql文件
该分支是ant分支，前端使用ant-design-vue 项目地址 [ruoyi-ant-oracle](https://gitee.com/angery/ruoyi-ant-oracle)

monitor使用springadmin完成,目前只是最简单的用法,[详戳](http://doc.rycloud.zmrit.com/#/extra?id=%e7%9b%91%e6%8e%a7)

欢迎pr或者加入，给个star是最好的鞭策

##  请作者喝杯咖啡


![](https://images.gitee.com/uploads/images/2020/0215/113629_1cea6917_364035.png)

