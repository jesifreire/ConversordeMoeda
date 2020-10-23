package br.com.unipe.aula.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.unipe.aula.model.Moeda;

@Controller
public class WelcomeController {

		@RequestMapping(value = "/conversor", method = RequestMethod.GET)
	public ModelAndView conversor(Model model) {
		model.addAttribute("moeda", new Moeda());
		return new ModelAndView("conversor");
	}
	
	@RequestMapping(value = "/conversor", method = RequestMethod.POST)
	public ModelAndView exibeConversão(@ModelAttribute Moeda moeda) {
		ModelAndView view = new ModelAndView("conversor");
		
		view.addObject("mensagem", "Você escolheu " + moeda.getDolar() + " dólares com a taxa de conversão de " + moeda.getTaxa());
		view.addObject("mensagem2", "O valor em reais com a conversão é: R$" + moeda.realConvertido(moeda.getDolar(), moeda.getTaxa()));
		
		
		return view;
	}
}
