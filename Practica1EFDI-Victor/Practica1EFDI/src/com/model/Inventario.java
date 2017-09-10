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
public class Inventario {
    private String idInventario;
    private int cantProdPorAlmacen;
    private String idAlmacen;

    public Inventario() {
    }

    public Inventario(String idInventario) {
        this.idInventario = idInventario;
    }

    public Inventario(String idInventario, int cantProdPorAlmacen, String idAlmacen) {
        this.idInventario = idInventario;
        this.cantProdPorAlmacen = cantProdPorAlmacen;
        this.idAlmacen = idAlmacen;
    }

    public String getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(String idInventario) {
        this.idInventario = idInventario;
    }

    public int getCantProdPorAlmacen() {
        return cantProdPorAlmacen;
    }

    public void setCantProdPorAlmacen(int cantProdPorAlmacen) {
        this.cantProdPorAlmacen = cantProdPorAlmacen;
    }

    public String getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(String idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInventario != null ? idInventario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventario)) {
            return false;
        }
        Inventario other = (Inventario) object;
        if ((this.idInventario == null && other.idInventario != null) || (this.idInventario != null && !this.idInventario.equals(other.idInventario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.model.Inventario[ idInventario=" + idInventario + " ]";
    }
}
