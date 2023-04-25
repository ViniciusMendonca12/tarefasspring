package tarefasspring.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }

}
