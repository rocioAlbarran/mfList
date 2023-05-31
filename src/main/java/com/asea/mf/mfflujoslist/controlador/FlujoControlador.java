package com.asea.mf.mfflujoslist.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.asea.mf.mfflujoslist.servicio.FlujoServicio;
import com.asea.mf.mfflujoslist.wrapper.FlujoWrapper;


@RestController
public class FlujoControlador {
	
	@Autowired
	private FlujoServicio servicio;
	
	@GetMapping({"/mf/listaFlujos"})
    public List<FlujoWrapper> listaFlujos() {		
      return servicio.listarFlujosData();
    }
	
	
	
}
