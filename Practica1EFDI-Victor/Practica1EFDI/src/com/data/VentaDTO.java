/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.data;

import java.util.List;

/**
 *
 * @author victor restrepo
 */
public class VentaDTO {

    private int consecutivo;
    private List<ClienteDTO> cliente;
    private List<CajeroDTO> cajero; 
    private int valorBruto;
    private double descuento;
    private int valorNeto;
    private List<ProductoDTO> producto;
    private String fecha;
    private String hora;
    private String medioPago;

    public VentaDTO(int consecutivo, List<ClienteDTO> cliente, List<CajeroDTO> cajero, int valorBruto, double descuento, int valorNeto, List<ProductoDTO> producto, String fecha, String hora, String medioPago) {
        this.consecutivo = consecutivo;
        this.cliente = cliente;
        this.cajero = cajero;
        this.valorBruto = valorBruto;
        this.descuento = descuento;
        this.valorNeto = valorNeto;
        this.producto = producto;
        this.fecha = fecha;
        this.hora = hora;
        this.medioPago = medioPago;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public List<ClienteDTO> getCliente() {
        return cliente;
    }

    public void setCliente(List<ClienteDTO> cliente) {
        this.cliente = cliente;
    }

    public List<CajeroDTO> getCajero() {
        return cajero;
    }

    public void setCajero(List<CajeroDTO> cajero) {
        this.cajero = cajero;
    }

    public int getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(int valorBruto) {
        this.valorBruto = valorBruto;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getValorNeto() {
        return valorNeto;
    }

    public void setValorNeto(int valorNeto) {
        this.valorNeto = valorNeto;
    }

    public List<ProductoDTO> getProducto() {
        return producto;
    }

    public void setProducto(List<ProductoDTO> producto) {
        this.producto = producto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

}
