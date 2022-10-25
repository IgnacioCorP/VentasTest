/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Dominio.Orden;

/**
 *
 * @author Alumno Mañana
 */
public interface Crud {
     
   void crearOrdenesTxt();
    
    void leerOrden();
    
    void escribirOrden(String nombre, Orden o1);
    
    void crearProductosTxt(String nombre);
    
    void leerProductos(String nombre);
    
    void introducirProducto();
}
