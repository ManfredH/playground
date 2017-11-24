package de.msg.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person")
public class PersonController {

    @RequestMapping
    public String index() {
        return "index";
    }

    @RequestMapping("/create")
    public String create() {
        return "create";
    }

    @RequestMapping("/{id}/view")
    public String view(@PathVariable("id") Long id, Model model) {
        return "view";
    }

    @RequestMapping("/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        return "edit";
    }

}
