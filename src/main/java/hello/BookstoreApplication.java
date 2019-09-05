package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class BookstoreApplication {

  @RequestMapping(value = "/recommended", method = RequestMethod.GET)
  public String readingList(){
    return "Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)";
  }
  
  @RequestMapping(value = "/recommendedNew")
  public String readingListNew(){
    return "New book1, New book2, New book3";
  }
  
  public static void main(String[] args) {
    SpringApplication.run(BookstoreApplication.class, args);
  }
}
