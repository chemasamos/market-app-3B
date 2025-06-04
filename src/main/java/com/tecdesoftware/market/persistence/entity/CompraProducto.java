package com.tecdesoftware.market.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table
public class CompraProducto {

    @EmbeddedId
    private CompraProductoPK id;

    private Integer cantidad;

    @ManyToOne
    @JoinColumn (name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn (name = "id_producto", insertable = false, updatable = false)
    private Producto producto;

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public CompraProductoPK getId() {
        return id;
    }

    public void setId(CompraProductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    private Double total;
    private Boolean estado;
}
