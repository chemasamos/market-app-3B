package com.tecdesoftware.market.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

//Esta clase es para crear llave compuesta
@Embeddable
public class CompraProductoPK implements Serializable {

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    @Column(name = "id_compra")
    private Integer idCompra;
    @Column(name = "id_producto")
    private Integer idProducto;
}
