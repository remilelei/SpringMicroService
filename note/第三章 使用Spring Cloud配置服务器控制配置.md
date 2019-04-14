# 第三章 使用Spring Cloud配置服务器控制配置
## 1. 配置管理
配置管理的四个原则：
1. 分离：服务的配置信息与服务实体要分开部署。
2. 抽象：配置的访问封装为一个接口，不要直接访问。
3. 集中：配置信息集中在尽可能少的存储库中。
4. 稳定：保证可用性和冗余。

## 2. 代码运行踩坑
1. confsvr的Dockerfile中CURL的链接改为：*https://edelivery.oracle.com/otn-pub/java/jce/8/jce_policy-8.zip* 不然会因为许可证问题下载下来一个HTML（不一定，和CURL版本有关系）
