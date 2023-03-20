package br.com.calculadora.calculadora_sb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
    @GetMapping("/som/{a}/{b}")
    public int som(@PathVariable int a, @PathVariable int b){
        return a+b;
    }
    @GetMapping("/sub")
    public int sub(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b){
        return a - b;
    }
}
