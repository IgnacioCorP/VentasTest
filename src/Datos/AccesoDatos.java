/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Dominio.Orden;
import Dominio.Productos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class AccesoDatos implements Crud {
     
    static private ArrayList<Productos> colecProductos = new ArrayList<>();
    static private Scanner teclado = new Scanner(System.in);
    
    @Override
    public void crearOrdenesTxt() {
       String nombre = "";
        System.out.println("Insertando desde MySql");
         File archivo = new File(nombre);
            try{
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            }catch(FileNotFoundException ex){
               ex.printStackTrace(System.out);
            }
    }
    
 @Override
    public void leerOrden() { 
        String nombre = "";
        System.out.println("Listando desde MySql");
        BufferedReader entrada;
        File archivo = new File (nombre);
           
        try {
             entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while (lectura != null){
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }catch(IOException ex){
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void escribirOrden(String nombre, Orden o1) { 
        Productos p1 = new Productos();
        ArrayList<Productos> produc = (ArrayList<Productos>)o1.getCol().clone();
        PrintWriter salida = null;
        File archivo= new File(nombre);
        try {
            salida = new PrintWriter(archivo);
            //salida = new PrintWriter(new FileWriter(nombre, true));
            salida.print(o1.getIdOrden()+"*"+ p1.getIdProducto()+"*"+p1.getNombre()+"*"+p1.getPrecio()+"\n");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }finally{
            salida.close();
        }
        
        //File archivo = new File(nombre);
        for(int i=0; i<produc.size(); i++){
            try {
                salida = new PrintWriter(new FileWriter(nombre, true));
                salida.print("\t" + produc.get(i).getIdProducto() + " ");
                salida.print("" + produc.get(i).getNombre() + " ");
                salida.print("" + produc.get(i).getPrecio() + "\n");
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }finally{
                salida.close();
            }
        }
        
    }
    
    @Override
    public void crearProductosTxt(String nombre){
        File archivo = new File(nombre);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
    
   
    
    @Override
    public void introducirProducto(){
        String nombre;
        double precio;
        System.out.print("\nIngrese el nombre del producto: ");
        nombre = teclado.nextLine().toUpperCase();
        Productos p = new Productos(nombre);
        
        while(colecProductos.contains(p) == true){
            System.out.print("El producto ya se encuentra registrado, intente de nuevo porfavor: ");
            nombre = teclado.nextLine().toUpperCase();
            p = new Productos(nombre);
        }
        
        System.out.print("Ingrese el precio del producto: ");
        precio = teclado.nextDouble();
        //p.setPrecio(precio);
        
        p = new Productos(nombre, precio);
        
        System.out.println("Los datos del producto son:" + p);
           //System.out.println("¿Deseas incluir este producto al sistema? (S/N): ");
            teclado.nextLine();
            //elegir = teclado.nextLine();
            colecProductos.add(p);
    }

   


    @Override
    public void leerProductos(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}