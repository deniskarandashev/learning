package ru.karandashev.learning_english.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Denis Karandashev
 * @project learning_english
 * @date 08.11.2020
 */

@Controller
public class MainController {

  @GetMapping("/index")
  public String index(Model model) {
    return "index";
  }
}
