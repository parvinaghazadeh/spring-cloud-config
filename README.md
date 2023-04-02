# spring-cloud-config
#### Includes the necessary services to display some features of Spring Cloud config

### steps
- First, install springCloudConfig as root
- Second, Run ConfigServerApplication service as a Spring Boot app as configServer then ConfigClientApplication as config client that want to use of config server data
- Then, call the below service as http client of ConfigClientController to get and return sample config from the configServer

>GET http://localhost:8081/client/greeting

### notes
- you can watch repo config file from config-server:
  http://localhost:8888/config-client.yml
- you can get more information in :
  https://docs.spring.io/spring-cloud-config/docs/current/reference/html/

