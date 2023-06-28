package com.bolsadeideas.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bolsadeideas.springboot.di.app.models.services.IServicio;

@Controller
public class IndexController {
	
	@Autowired
//	@Qualifier("miServicioComplejo")
	private IServicio servicio;
	
	//inyección de dependiencias por metodo contructor 
	//de manera implicita sin usar la anotación @Autowired 
	/*public IndexController(IServicio servicio) {
		this.servicio = servicio;
	}*/
	
	@GetMapping({"/", "","/index"})
	public String index(Model model) {
		
		model.addAttribute("objeto", servicio.operacion());
		
		return "index";
	}

	//inyección de dependiencias por metodo setter 
	//de manera explicita usando la anotación @Autowired 
	/*@Autowired
	public void setServicio(IServicio servicio) {
		this.servicio = servicio;
	}*/
}
