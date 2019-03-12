package kr.hs.dgsw.web_get;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(required = false, defaultValue = "NONAME") String to,
            @RequestParam(required = false, defaultValue = "Hello") String say)
    {
        return say + ", " + to;
    }

    @GetMapping("/greeting1/say/to")
    public String greeting1(){
        return "";
    }
}
