package edu.iu.p566.arithmetic_service.controller;

@RestController
@CrossOrigin
public class HomeController {
    @GetMappings
    public String greetings(){
        return "welcome to arithmetic services";
    }
}
