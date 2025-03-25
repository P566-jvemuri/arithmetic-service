package edu.iu.p566.arithmetic_service.controller;

import edu.iu.p566.arithmetic_service.service.IArithmeticService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/arithmetic")
public class ArithmeticController {

    private final IArithmeticService arithmeticService;

    // Constructor injection
    public ArithmeticController(IArithmeticService arithmeticService) {
        this.arithmeticService = arithmeticService;
    }

    @GetMapping("/add/{n}/{m}")
    public int arithmetic(@PathVariable int n, @PathVariable int m) {
        return arithmeticService.arithmetic(n, m);
    }
}
