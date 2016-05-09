package demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PortalController {

    @RequestMapping("/")
    String index(Model model) {
        model.addAttribute("nick", "Jack");
        return "portal";
    }
}