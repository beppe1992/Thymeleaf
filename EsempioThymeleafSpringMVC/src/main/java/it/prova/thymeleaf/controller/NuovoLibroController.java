package it.prova.thymeleaf.controller;

import it.prova.thymeleaf.model.Libro;

import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NuovoLibroController {

	@RequestMapping("/nuovoLibro")
	public ModelAndView goToPaginaNuovoLibro() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("nuovoLibro");
		Libro l = new Libro();
		mv.addObject("libro", l);
		return mv;
	}

	@RequestMapping("/inserisciLibro")
	public String inserisciNuovoLibro(@ModelAttribute("libro") Libro libro) {

		System.out.println("titolo: " + libro.getTitolo());
		System.out.println("autore: " + libro.getAutore());
		System.out.println("anno: " + libro.getAnno());

		return "nuovoLibro";
	}

}
