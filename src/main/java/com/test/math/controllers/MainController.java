package com.test.math.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller class to display the main controller
 */
@Controller
public class MainController {

  /**
   * Index page to display
   *
   * @return String
   */
  @RequestMapping("/")
  @ResponseBody
  public String index() {
    return "Developed by mauricio";
  }
}
