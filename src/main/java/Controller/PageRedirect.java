package Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageRedirect {

    // inject RequestParam(value = "id", defaultValue = "1") String idvia application.properties
//    @Value("${welcome.message:test}")
    //private String message = "Hello World";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
//        model.put("message", this.message);
        return "Usersearch";
    }

    @RequestMapping("/ladderstats")
    public String ladder(Map<String, Object> model) {
        model.put("message", "lul");
        return "Ladderstats";
    }

}
