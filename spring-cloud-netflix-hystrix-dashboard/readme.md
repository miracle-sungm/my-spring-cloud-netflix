Hystrix Dashboard: 监控

对客户端进行监控、客户端需配置HystrixMetricsStreamServlet，Spring通过ServletRegistrationBean注册Servlet
详见com.miracle.netflix.eureka.client.MyEurekaClientApplication

项目启动之后访问：localhost:8095/hystrix