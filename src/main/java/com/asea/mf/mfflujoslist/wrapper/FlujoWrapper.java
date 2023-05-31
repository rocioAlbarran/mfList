package com.ope.mf.wrapper;

import java.util.Date;

import com.ope.mf.vo.Flujo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlujoWrapper {
	
	int flujoId;
	int tipoFlujoId;
	String clave;
	String nombre;
	String descripcion_c;
	Date fechaCreacion;
	Date fechaActualizacion;
	int usuarioId;
	int flujoVinculadoId;
	Date fechaConclusion;
	int estatusFlujoId;
	String accionId;
	int estatusId;
	String descripcionl;
	Date fechaIncio;
	
	public FlujoWrapper(Flujo flujo) {
		
		this.flujoId = flujo.getFlujoId();
		this.tipoFlujoId = flujo.getTipoFlujoId();
		this.clave = flujo.getClave();
		this.nombre = flujo.getNombre();
		this.descripcion_c = flujo.getDescripcion_c();
		this.fechaCreacion = flujo.getFechaCreacion();
		this.fechaActualizacion = flujo.getFechaActualizacion();
		this.usuarioId = flujo.getUsuarioId();
		this.flujoVinculadoId = flujo.getFlujoVinculadoId();
		this.fechaConclusion = flujo.getFechaConclusion();
		this.estatusFlujoId = flujo.getEstatusFlujoId();
		this.accionId = flujo.getAccionId();
		this.estatusId = flujo.getEstatusId();
		this.descripcionl = flujo.getDescripcionl();
		this.fechaIncio = flujo.getFechaIncio();
	}
	
	
}
