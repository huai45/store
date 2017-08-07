http://localhost:9999/druid/index.html
username:druid
password:druid
如想自定义登录用户名和密码 请修改配置文件
spring.datasource.druid.stat-view-servlet.loginUsername
spring.datasource.druid.stat-view-servlet.loginPassword
如果启动过程中出现循环依赖异常
  在dataSourceInitializer 下面的Bean中
  将该Bean的依赖修改为 @Lazy
@Lazy
@Service
CategoryAttrValueTplService   tplService;
