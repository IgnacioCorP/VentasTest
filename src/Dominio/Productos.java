/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class Productos {
      public static Scanner ent = new Scanner (System.in); 
    int idProducto;
     String nombre;
     double precio;
     int ContadorProd = 0;

    public Productos() {
        ContadorProd++;
        this.idProducto = ContadorProd;
    }
 
    public Productos(String nombre) {
        this.nombre = nombre;
    }

    public Productos(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }
    

    public Productos(int idProduccto, String nombre, double precio) {
        this();
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
       
    }

    public int getIdProducto() {
        return idProducto = ContadorProd;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

  public int getContadorProd() {
        return ContadorProd;
    }

    public void setContadorProd(int ContadorProd) {
        this.ContadorProd = ContadorProd;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.idProducto;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Productos other = (Productos) obj;
        if (this.idProducto != other.idProducto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", precio=" + precio + '}'+"\n";
    }

    
    
    
}
