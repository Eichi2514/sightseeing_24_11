package org.eichi.sightseeing.domain.home.home.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller

public class HomeController {

    @Value("${openweathermapAPIkey}")
    String openweathermapAPIkey;

    @Value("${attractionAPIkey}")
    String attractionAPIkey;

    @GetMapping("/")
    public String ShowMain(Model model) {

        model.addAttribute("openweathermapAPIkey", openweathermapAPIkey);
        model.addAttribute("attractionAPIkey", attractionAPIkey);
        return "/usr/home/main";
    }
}
