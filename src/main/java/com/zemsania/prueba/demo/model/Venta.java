package com.zemsania.prueba.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "venta")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVenta;
    @OneToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "idVenta=" + idVenta +
                ", cliente=" + cliente +
                ", fecha=" + fecha +
                '}';
    }
}
