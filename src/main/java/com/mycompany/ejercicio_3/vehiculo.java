/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
package com.mycompany.ejercicio_3;

/**
 *
 * @author enrique
 */
// Vehiculo.java
// vehiculo.java
package com.mycompany.ejercicio_3;  // Añade esto en cada archivo

public abstract class vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private double precio;

    public vehiculo(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    // Getters y Setters
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAño() { return año; }
    public double getPrecio() { return precio; }

    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setAño(int año) { this.año = año; }
    public void setPrecio(double precio) { this.precio = precio; }

    // Método abstracto para el descuento
    public abstract double calcularDescuento();

    // Método para mostrar info básica
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Precio: $" + precio);
    }
}