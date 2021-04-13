package com.ms_pagos.apirest.service;

import com.ms_pagos.apirest.model.Pago;
import com.ms_pagos.apirest.pojo.NewPagoPOJO;
import com.ms_pagos.apirest.repository.PagoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagoService {
    private PagoRepository pagoRepository;

    public PagoService( PagoRepository pagoRepository ){
        this.pagoRepository = pagoRepository;
    }

    public List<Pago> findByPlaca(String placa ){
        return (List<Pago>) pagoRepository.findByPlaca( placa );
    }

    public Pago findById( Integer id ){
        return pagoRepository.findById( id ).orElse( null );
    }

    public void save ( Pago pago ){
        pagoRepository.save( pago );
    }

    public Pago mapperPagoEntity(NewPagoPOJO pagoPOJO){
        Pago nuevoPago =  new Pago();
        nuevoPago.setPlaca(pagoPOJO.getPlaca());
        nuevoPago.setCreated_at(pagoPOJO.getCreated_at());
        nuevoPago.setFechaPago(pagoPOJO.getFechaPago());
        nuevoPago.setHoraPago(pagoPOJO.getHoraPago());
        nuevoPago.setPeaje(pagoPOJO.getPeaje());
        nuevoPago.setUpdated_at(pagoPOJO.getUpdated_at());
        nuevoPago.setValor(pagoPOJO.getValor());
        return nuevoPago;
    }
}
