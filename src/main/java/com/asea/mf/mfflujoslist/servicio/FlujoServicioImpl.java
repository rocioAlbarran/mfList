package com.ope.mf.servicio;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ope.mf.repositorio.FlujoRepositorio;
import com.ope.mf.vo.Flujo;
import com.ope.mf.wrapper.FlujoWrapper;


@Service
public class FlujoServicioImpl implements FlujoServicio {

	@Autowired
	private FlujoRepositorio repositorio;

	@Override
	public List<Flujo> listarFlujos() {
		return repositorio.findAll();
	}
	
	@Override
	public List<FlujoWrapper> listarFlujosData() {
		repositorio.findAll();
		List<FlujoWrapper> listaFlujoData = new ArrayList<FlujoWrapper>();
		for(Flujo flujo :repositorio.findAll()) {
		      System.out.println(flujo);
		      listaFlujoData.add(new FlujoWrapper(flujo));
		      
		    }
		return listaFlujoData;
	}

	
	


}
