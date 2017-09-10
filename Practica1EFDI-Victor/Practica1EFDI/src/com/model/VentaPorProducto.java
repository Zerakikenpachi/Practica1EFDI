/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author victor restrepo
 */
public class VentaPorProducto {

    private static final long serialVersionUID = 1L;
    protected VentaPorProductoPK ventaporproductoPK;
    private String idCantidad;
    private String idPrecioVenta;

    public VentaPorProducto() {
    }

    public VentaPorProducto(VentaPorProductoPK ventaPorProductoPK) {
        this.ventaporproductoPK = ventaporproductoPK;
    }

    public VentaPorProducto(VentaPorProductoPK ventaporproductoPK, String idCantidad, String idPrecioVenta) {
        this.ventaporproductoPK = ventaporproductoPK;
        this.idCantidad = idCantidad;
        this.idPrecioVenta = idPrecioVenta;
    }

    public VentaPorProducto(String idProducto, String idVenta) {
        this.ventaporproductoPK = new VentaPorProductoPK(idProducto, idVenta);
    }

    public VentaPorProductoPK getVentaporproductoPK() {
        return ventaporproductoPK;
    }

    public void setVentaporproductoPK(VentaPorProductoPK ventaporproductoPK) {
        this.ventaporproductoPK = ventaporproductoPK;
    }

    public String getIdCantidad() {
        return idCantidad;
    }

    public void setIdCantidad(String idCantidad) {
        this.idCantidad = idCantidad;
    }

    public String getIdPrecioVenta() {
        return idPrecioVenta;
    }

    public void setIdPrecioVenta(String idPrecioVenta) {
        this.idPrecioVenta = idPrecioVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ventaporproductoPK != null ? ventaporproductoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentaPorProducto)) {
            return false;
        }
        VentaPorProducto other = (VentaPorProducto) object;
        if ((this.ventaporproductoPK == null && other.ventaporproductoPK != null) || (this.ventaporproductoPK != null && !this.ventaporproductoPK.equals(other.ventaporproductoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Ventaporproducto[ ventaporproductoPK=" + ventaporproductoPK + " ]";
    }
}
