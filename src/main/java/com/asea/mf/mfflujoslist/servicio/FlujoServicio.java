package com.asea.mf.mfflujoslist.servicio;
import java.util.List;

import com.asea.mf.mfflujoslist.vo.Flujo;
import com.asea.mf.mfflujoslist.wrapper.FlujoWrapper;



public interface FlujoServicio {
	public List<Flujo> listarFlujos();

	List<FlujoWrapper> listarFlujosData();
}
