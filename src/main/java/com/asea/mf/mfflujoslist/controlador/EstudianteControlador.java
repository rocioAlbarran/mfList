package com.ope.mf.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ope.mf.servicio.EstudianteServicio;



//import com.ope.security.servicio.EstudianteServicio;



@RestController
public class EstudianteControlador {
	
	@Autowired
	private EstudianteServicio servicio;
	
	@GetMapping({"/login/hello","/"})
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Test método 1 %s !!!!!!", name);
    }
	
	@GetMapping({"/estudiantes","/"})
	public String listarEstudiantes(Model modelo) {
		//modelo.addAttribute("estudiantes", servicio.listarTodosLosEstudiantes());
		return "estudiantes";
	}
	
	
	
}
