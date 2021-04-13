package com.ms_pagos.apirest.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name="pago")
public class Pago {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id_pago")
    private int idPago;
    @Column(name="fecha_pago")
    private Date fechaPago;
    @Column(name="hora_pago")
    private Time horaPago;
    @Column(name="placa")
    private String placa;
    @Column(name="peaje")
    private int peaje;
    @Column(name="valor")
    private double valor;
    @Column(name="created_at")
    private Date created_at;
    @Column(name="updated_at")
    private Date updated_at;

    public Pago() {
    }

    public Pago(int idPago, Date fechaPago, Time horaPago, String placa, int peaje, double valor, Date created_at, Date updated_at) {
        this.idPago = idPago;
        this.fechaPago = fechaPago;
        this.horaPago = horaPago;
        this.placa = placa;
        this.peaje = peaje;
        this.valor = valor;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Time getHoraPago() {
        return horaPago;
    }

    public void setHoraPago(Time horaPago) {
        this.horaPago = horaPago;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPeaje() {
        return peaje;
    }

    public void setPeaje(int peaje) {
        this.peaje = peaje;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "idPago=" + idPago +
                ",fechaPago" + fechaPago +
                ",horaPago" + horaPago+
                ",placa" + placa +
                ",peaje" + peaje +
                ",valor" + valor +
                ",created_at" + created_at +
                ",updated_at" + updated_at + '\'' +
                '}';
    }
}
