package com.ope.mf.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ope.mf.vo.Flujo;

@Repository
public interface FlujoRepositorio extends JpaRepository<Flujo, Integer> {

}
