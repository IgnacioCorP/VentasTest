/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;
import principal.VentasTest;


/**
 *
 * @author Alumno Mañana
 */
public class Orden {
    
    public int idOrden;
    public ArrayList <Productos> Col = new ArrayList <Productos>();
    public static int ContOrden;
    public final int MaxProduct = 10;

    public Orden() {
        ContOrden++;
        this.idOrden = ContOrden;
    }

    public Orden(ArrayList<Productos> Col) {
        this();
        this.Col = Col;
    }

  

    
    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public ArrayList<Productos> getCol() {
        return Col;
    }

    public void setCol(ArrayList<Productos> Col) {
        this.Col = Col;
    }

    public int getContOrden() {
        return ContOrden;
    }

    public void setContOrden(int ContOrden) {
        this.ContOrden = ContOrden;
    }


    public void AgregarProducto(Productos pro){               
        if(Col.size() < 10){
        Col.add(pro);  
        }else{
            System.out.println("Demasiados productos en esta orden.");
        }
    }
     
     public double CalcularTotal(){     
        double suma = 0;
        for (int i = 0; i < Col.size(); i++) {
             suma += Col.get(i).getPrecio();
        }
         System.out.println("LA SUMA TOTAL ES: "+suma);
         return suma;
     }
     
     
     public void MostrarOrden(){     
        System.out.print("\nID: "+idOrden);
         System.out.print("\nPRODUCTOS: ");     

         for (int i = 0; i < Col.size(); i++) {
              System.out.print(Col.get(i).toString());     
         }     
        System.out.print("\nNÚMERO DE ORDEN: "+ContOrden);
    }
   
}
