package kolotovAD.projectjava.controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.util.HashMap;
import java.util.Map;
@Slf4j
@Controller
public class IndexController {



    @GetMapping("/")
    public String index(Map<String, Object> model) {

        model.put("key1", 15);
        model.put("key2", 200);
        model.put("key3", "Stroka");

        return "Index";
    }


}

