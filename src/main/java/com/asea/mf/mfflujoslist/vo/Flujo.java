package com.asea.mf.mfflujoslist.vo;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="flujos")
public class Flujo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "flujo_id             ")   	 int flujoId;
    @Column(name= "tipo_flujo_id        ")       int tipoFlujoId;
    @Column(name= "clave                ")       String clave;
    @Column(name= "nombre               ")       String nombre;
    @Column(name= "descripcion_c        ")       String descripcion_c;
    @Column(name= "fecha_creacion       ")       Date fechaCreacion;
    @Column(name= "fecha_actualizacion  ")       Date fechaActualizacion;
    @Column(name= "usuario_id           ")       int usuarioId;
    @Column(name= "flujo_vinculado_id   ")       int flujoVinculadoId;
    @Column(name= "fecha_conclusion     ")       Date fechaConclusion;
    @Column(name= "estatus_flujo_id     ")       int estatusFlujoId;
    @Column(name= "accion_id            ")       String accionId;
    @Column(name= "estatus_id           ")       int estatusId;
    @Column(name= "descripcion_l        ")       String descripcionl;
    @Column(name= "fecha_incio          ")       Date fechaIncio;
    
    
	
}
