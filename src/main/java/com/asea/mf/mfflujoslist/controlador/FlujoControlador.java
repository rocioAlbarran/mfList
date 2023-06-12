package com.asea.mf.mfflujoslist.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.asea.mf.mfflujoslist.servicio.FlujoServicio;
import com.asea.mf.mfflujoslist.wrapper.FlujoWrapper;

import jakarta.servlet.http.HttpServletResponse;


@RestController
//@Produces({"application/json", "application/xml"})
@RequestMapping("/mf")
public class FlujoControlador {
	
	@Autowired
	private FlujoServicio servicio;
	
	@GetMapping({"/listaFlujos"})
	/*
	@ApiOperation(value = "Is Alive operation", notes = "Return is the microservice is alive with a get operation returning the time")
	@ApiResponses({ @ApiResponse(code = HttpServletResponse.SC_OK, message = "OK"),
	@ApiResponse(code = HttpServletResponse.SC_INTERNAL_SERVER_ERROR, message = "INTERNAL ERROR SERVER"),
	@ApiResponse(code = HttpServletResponse.SC_UNAUTHORIZED, message = "UNAUTHORIZED"),
	@ApiResponse(code = HttpServletResponse.SC_FORBIDDEN, message = "FORBIDDEN"),
	@ApiResponse(code = HttpServletResponse.SC_NOT_FOUND, message = "ELEMENTO NOT FOUND")})
	*/
    public List<FlujoWrapper> listaFlujos() {		
      return servicio.listarFlujosData();
    }
	
	
	
}
