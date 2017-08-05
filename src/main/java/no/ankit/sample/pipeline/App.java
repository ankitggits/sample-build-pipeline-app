package no.ankit.sample.pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ankit on 03-08-2017.
 */
@SpringBootApplication
@RestController
public class App {

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
        System.out.println("master-change-1");
        System.out.println("master-change-2");
        System.out.println("master-change-3");
    }
}
