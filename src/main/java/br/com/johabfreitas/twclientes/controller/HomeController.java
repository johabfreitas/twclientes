package br.com.johabfreitas.twclientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //responsavel em ligar o model a view
@RequestMapping("/") //rota inicial da aplicação
public class HomeController {
	// criar um método para fazer as operações dentro da aplicação
	
	//@RequestMapping(path = "/", method = RequestMethod.GET)
	@GetMapping("/")
	public String home() {
		return "home";
	}

}
