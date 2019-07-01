package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class BookstoreApplication {

  @RequestMapping(value = "/recommended")
  public String readingList(){
    return "Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)";
  }
  
  @RequestMapping(value = "/recommendedNew")
  public String readingNewList(){
    return "Netty in Action";
  }
  
  @RequestMapping(value = "/recommendedCS")
  public String readingComputerScienceList(){
    return "Netty in Action";
  }
  
  public static void main(String[] args) {
    SpringApplication.run(BookstoreApplication.class, args);
  }
}
