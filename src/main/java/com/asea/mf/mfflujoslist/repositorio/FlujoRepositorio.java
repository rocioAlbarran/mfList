package com.asea.mf.mfflujoslist.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asea.mf.mfflujoslist.vo.Flujo;


@Repository
public interface FlujoRepositorio extends JpaRepository<Flujo, Integer> {

}
