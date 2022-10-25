
package principal;

import Datos.AccesoDatos;
import Dominio.Orden;
import Dominio.Productos;
import java.util.ArrayList;
import java.util.Scanner;



public class VentasTest {
     public static Scanner ent = new Scanner (System.in);
     
     
        

   
    public static void main(String[] args) {
        Orden O1 = new Orden();
        Orden O2 = new Orden();
         
        ArrayList <Productos> Col = new ArrayList <Productos>();
        //CREAR 
         
        Productos p0 = new Productos ();
        Productos p1 = new Productos (p0.getIdProducto(),"Azucar",0.56);
        Productos p2 = new Productos (p0.getIdProducto(),"Sal",7.20);
        Productos p3 = new Productos (p0.getIdProducto(),"Piedra",9.99);
        Productos p4 = new Productos (p0.getIdProducto(),"Café",4.99);
        Productos p5 = new Productos (p0.getIdProducto(),"Pan",5.99);
        
        //PRIMERA ORDEN CREADA
        
        O1.AgregarProducto(p1);
        O1.AgregarProducto(p2);
        O1.AgregarProducto(p3);
        O1.AgregarProducto(p4);
        O1.AgregarProducto(p5);  
        O1.MostrarOrden();
        System.out.println("");
        O1.CalcularTotal();
        //SEGUNDA ORDEN CREADA
        O2.AgregarProducto(p1);
        O2.AgregarProducto(p2);
        O2.AgregarProducto(p3);
        O2.AgregarProducto(p4);
        O2.AgregarProducto(p5);            
        O2.MostrarOrden();
        System.out.println("");
        O2.CalcularTotal();
        
        String nombreArchivo = "Orden.txt";
        AccesoDatos Imp = new AccesoDatos();
        Imp.crearOrdenesTxt();
        Imp.crearProductosTxt(nombreArchivo);
        Imp.escribirOrden(nombreArchivo, O1);
        
        
    }
  
 
}
