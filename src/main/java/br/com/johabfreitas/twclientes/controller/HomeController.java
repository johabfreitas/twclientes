package br.com.johabfreitas.twclientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller //responsavel em ligar o model a view
@RequestMapping("/") //rota inicial da aplicação
public class HomeController {
	// criar um método para fazer as operações dentro da aplicação
	
	//@RequestMapping(path = "/", method = RequestMethod.GET)
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	/**
	@GetMapping("/mensagem")
	public String mensagem(ModelMap model) {
		model.addAttribute("attribMensagem", "Mensagem vinda do servidor");
		
		return "mensagem";
	}
	**/
	
	@GetMapping("/mensagem")
	public ModelAndView mensagem() {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("mensagem");
		modelAndView.addObject("attribMensagem", "Mensagem vinda do servidor!");
		return modelAndView;
	}
	
	/**
	@GetMapping("/saudacao/{nome}")
	public ModelAndView saudacao(@PathVariable String nome) {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("saudacao");
		modelAndView.addObject("nome", nome);
		return modelAndView;
	}
	*/

	/**
	@GetMapping("/saudacao")
	public ModelAndView saudacao(@RequestParam String nome) {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("saudacao");
		modelAndView.addObject("nome", nome);
		return modelAndView;
	}
	**/
	
	@GetMapping("/saudacao")
	public ModelAndView saudacao(@RequestParam(required = false, defaultValue = "Freitas") String nome) {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("saudacao");
		modelAndView.addObject("nome", nome);
		return modelAndView;
	}
}
