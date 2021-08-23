package com.ms_pagos.apirest.controller;

import com.ms_pagos.apirest.model.Pago;
import com.ms_pagos.apirest.repository.PagoRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/pay_ms")
public class PagoController {
    @Autowired
    private PagoRepository pagoRepository;

    @GetMapping("/getPayments")
    public List<Pago> findAllPagos(){
        return pagoRepository.findAll();
    }

    @GetMapping("/paymentById/{id}")
    public ResponseEntity<Pago> findPagoById(@PathVariable(value = "id") int pagoId) throws ResourceNotFoundException {
        Pago pago = pagoRepository.findById(pagoId).orElseThrow(() -> new ResourceNotFoundException("Payment not found for this id :: " + pagoId));
        return ResponseEntity.ok().body(pago);
    }

    @GetMapping("/paymentsByPlaca/{placa}")
    public List<Pago> findPagosByPlaca(@PathVariable(value = "placa") String placa) throws ResourceNotFoundException {
        return pagoRepository.findByPlaca(placa);
    }

    @PostMapping(value = "/createPayment")
    public Pago savePago(@Validated @RequestBody Pago pago) {
        long millis=System.currentTimeMillis();
        pago.setCreated_at(new Date(millis));
        pago.setUpdated_at(new Date(millis));
        return pagoRepository.save(pago);
    }

    @PutMapping("/updatePayment/{id}")
    public ResponseEntity<Pago> updatePago( @PathVariable(value = "id") int pagoId, @RequestBody Pago pagoDetails) throws ResourceNotFoundException {
        Pago pago = pagoRepository.findById(pagoId)
                .orElseThrow(() -> new ResourceNotFoundException("Payment not found on :: "+ pagoId));

        pago.setValor(pagoDetails.getValor());
        pago.setPeaje(pagoDetails.getPeaje());
        pago.setHoraPago(pagoDetails.getHoraPago());
        pago.setFechaPago(pagoDetails.getFechaPago());
        pago.setPlaca(pagoDetails.getPlaca());
        pago.setValor(pagoDetails.getValor());
        long millis=System.currentTimeMillis();
        pago.setUpdated_at(new Date(millis));
        final Pago updatedPago = pagoRepository.save(pago);
        return ResponseEntity.ok(updatedPago);
    }
}
