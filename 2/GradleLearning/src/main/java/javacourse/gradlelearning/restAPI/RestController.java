package javacourse.gradlelearning.restAPI;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/")
    public String getInfo(){
        return "Fist Gradle Application";
    }
}
