package org.rpa;

public class Folio {

    String fecha;
    String folio;
    String cliente;
    String recepcion;
    String agencia;
    String tipo;
    String estatus;

    public Folio(String fecha, String folio, String cliente, String recepcion, String agencia, String tipo, String estatus) {
        this.fecha = fecha;
        this.folio = folio;
        this.cliente = cliente;
        this.recepcion = recepcion;
        this.agencia = agencia;
        this.tipo = tipo;
        this.estatus = estatus;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getRecepcion() {
        return recepcion;
    }

    public void setRecepcion(String recepcion) {
        this.recepcion = recepcion;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
