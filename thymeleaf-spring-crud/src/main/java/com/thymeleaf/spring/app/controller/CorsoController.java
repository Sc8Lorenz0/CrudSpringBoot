package com.thymeleaf.spring.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.thymeleaf.spring.app.model.Corso;
import com.thymeleaf.spring.app.service.CorsoService;

@Controller
public class CorsoController {

	@Autowired
	private CorsoService corsoService;

	@GetMapping("/") // Ritorna tutti i corsi
	public String viewHomePage(Model model) {
		model.addAttribute("listCorsi", corsoService.getAllCorsi());
		return "index";
	}

	@GetMapping("/showCorsoForm")
	public String showNewEmployeeForm(Model model) {
		// create model attribute to bind form data
		Corso corso = new Corso();
		model.addAttribute("corso", corso);
		return "new_corso";
	}

	@PostMapping("/saveCorso")
	public String saveEmployee(@ModelAttribute("corso") Corso corso) {
		// save employee to database
		corsoService.saveCorso(corso);
		return "redirect:/";
	}

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

		// get Corso dal servizio

		Corso corso = corsoService.getCorsoById(id);

		// Seleziona il corso come modello per precompilare i campi
		model.addAttribute("corso", corso);
		return "update_corso";
	}

	@GetMapping("/deleteCorso/{id}")
	public String deleteCorso(@PathVariable(value = "id") long id) {

		// call delete employee method
		this.corsoService.deleteCorsoById(id);
		return "redirect:/";
	}

}
