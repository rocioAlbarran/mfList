package com.ope.mf.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ope.mf.vo.Estudiante;



@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long> {

}
