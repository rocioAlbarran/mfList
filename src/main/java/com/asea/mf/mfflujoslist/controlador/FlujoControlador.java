package com.ope.mf.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ope.mf.servicio.FlujoServicio;
import com.ope.mf.wrapper.FlujoWrapper;


//import com.ope.security.servicio.EstudianteServicio;



@RestController
public class FlujoControlador {
	
	@Autowired
	private FlujoServicio servicio;
	
	@GetMapping({"/mf/listaFlujos0"})
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		servicio.listarFlujos();
      return String.format("Test lista de flujos método 1 %s !!!!!!", name);
    }
	

	@GetMapping({"/mf/listaFlujos"})
    public List<FlujoWrapper> listaFlujos() {		
      return servicio.listarFlujosData();
    }
	
	
	
}
