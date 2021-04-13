package com.ms_pagos.apirest.repository;

import com.ms_pagos.apirest.model.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Integer> {
    List<Pago> findByPlaca(String placa);
}
