# koala-service
spring-boot + dubbo 的一个例子

### 模块说明
- koala-service-api 定义服务接口（该接口需单独打包，在服务提供方和消费方共享）
- koala-service-provider 服务提供方
- koala-service-web 服务消费者

### 运行
1. 下载 zookeeper，修改 conf 文件夹中的 zoo_sample.cfg，重命名为 zoo.cfg
``` cmd
tickTime=2000
initLimit=10
syncLimit=5
dataDir=E:/Program/zookeeper-3.4.8/zk-data-temp
clientPort=2181
```
2. 打包安装 koala-service-api
3. 运行 zookeeper（bin 目录下的 zkServer.cmd）
4. 运行 koala-service-provider 的 App 函数，启动服务提供者
5. 运行 koala-service-web 的 App 函数，启动服务消费者，打开浏览器输入 localhost:8080，看到 hello dubbo，即表面程序运行成功

### 配置
- dubbo 有四种配置方式：xml 配置、属性配置、注解配置、API 配置，详细方法参考[官方文档](http://dubbo.io/User+Guide-zh.htm#UserGuide-zh-%E9%85%8D%E7%BD%AE)
- 本例子中采用注解配置，需要注意两个注解，一个是提供者里的 @Service 注解，一个是消费者里的 @Reference 注解
- spring-boot 通过 @ImportResource 注解加载配置文件