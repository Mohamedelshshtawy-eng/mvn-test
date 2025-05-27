package mohamed.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("main")
    public String hello() {
        return "Hello worled";
    }

    @GetMapping("next")
    public String next(){
        return "Hello next";
    }

    @PostMapping("post")
    public String get(@RequestBody String name) {
        return name;
    }

    @GetMapping("post")
    public void getall() {
    }

}
