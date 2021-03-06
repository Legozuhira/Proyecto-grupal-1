package com.company;

public class Pedido<escoger> {
    //Atributos
    private String producto;
    private int escoger;
    private int codigo_de_pedido;
    private String precio;

    //Constructores
    public Pedido(String producto) {
        this.producto = producto;
        this.codigo_de_pedido = (int) (Math.random() * 100);
                this.precio = precio;

    }

    public int getEscoger() {
        return escoger;
    }

    public void setEscoger(int escoger) {
        this.escoger = escoger;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCodigo_de_pedido() {
        return codigo_de_pedido;
    }

    public void setCodigo_de_pedido(int codigo_de_pedido) {
        this.codigo_de_pedido = codigo_de_pedido;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

//metodos
 public void escoger (int escoger) {
     if (escoger == 0) {
         setPrecio("100.00");
         setProducto("Celular");
     } else if (escoger == 1) {
         setPrecio("200.00");
         setProducto("Television");
     } else {
         setPrecio("40.00");
         setProducto("zapatillas");


     }
 }}