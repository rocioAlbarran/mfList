package com.ope.mf.servicio;
import java.util.List;

import com.ope.mf.vo.Flujo;
import com.ope.mf.wrapper.FlujoWrapper;

public interface FlujoServicio {
	public List<Flujo> listarFlujos();

	List<FlujoWrapper> listarFlujosData();
}
