package it.prova.thymeleaf.controller;

import it.prova.thymeleaf.model.Libro;

import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LibriController {

	List<Libro> libri = new ArrayList<Libro>();

	@RequestMapping("/listaLibri")
	public String goToPaginaListaLibri() {
		recuperaLibriBase();
		return "listaLibri";
	}

	@RequestMapping("/altriLibri")
	public String goToAltriltriLibri() {
		recuperaAltriLibri();
		return "listaLibri";
	}

	public List<Libro> recuperaLibriBase() {

		Libro libro1 = new Libro();
		libro1.setAnno(2015);
		libro1.setTitolo("Libro Prova 1");
		libro1.setAutore("Autore del libro 1");

		Libro libro2 = new Libro();
		libro2.setAnno(2014);
		libro2.setTitolo("Libro Prova 2");
		libro2.setAutore("Autore del libro 2");

		Libro libro3 = new Libro();
		libro3.setAnno(2013);
		libro3.setTitolo("Libro Prova 3");
		libro3.setAutore("Autore del libro 3");

		libri.add(libro1);
		libri.add(libro2);
		libri.add(libro3);

		return libri;
	}

	public List<Libro> recuperaAltriLibri() {

		Libro libro4 = new Libro();
		libro4.setAnno(2012);
		libro4.setTitolo("Libro Prova 4");
		libro4.setAutore("Autore del libro 4");

		libri.add(libro4);

		return libri;
	}

	@ModelAttribute("libri")
	public List<Libro> getLibri() {
		return libri;
	}

	public void setLibri(List<Libro> libri) {
		this.libri = libri;
	}

}
