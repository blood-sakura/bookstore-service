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
  
  @RequestMapping(value = "/recommendedGentlemanBooks")
  public String readingGentlemanBooks(){
    return "Books for men";
  }
  
  @RequestMapping(value = "/recommendedKidsBooks")
  public String readingKidBooks(){
    return "Books for Kids";
  }
  
  @RequestMapping(value = "/recommendedLadyBooks")
  public String readingLadyBooks(){
    return "Books for wormen";
  }
    @RequestMapping(value = "/recommendedPetBooks")
  public String readingPetBooks(){
    return "Books for pets";
  }
  
  @RequestMapping(value = "/recommendedHouseBooks")
  public String readingHouseBooks(){
    return "Books for Houses";
  }
  
  @RequestMapping(value = "/recommendedTouristsBooks")
  public String readingTouristsBooks(){
    return "Books for Tourists";
  }

  public static void main(String[] args) {
    SpringApplication.run(BookstoreApplication.class, args);
  }
}
