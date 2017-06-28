package com.sda.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}
}


//@RestController
//class ServiceInstanceRestController {
//
//	@Autowired
//	private DiscoveryClient discoveryClient;
//
//	@RequestMapping("/service-instances/{applicationName}")
//	public List<ServiceInstance> serviceInstancesByApplicationName(
//			@PathVariable String applicationName) {
//		return this.discoveryClient.getInstances(applicationName);
//	}
//}