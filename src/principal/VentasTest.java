
package principal;

import java.util.ArrayList;
import java.util.Scanner;
import orden.Orden;
import orden.Productos;


public class VentasTest {
     public static Scanner ent = new Scanner (System.in);
     public static ArrayList <Orden> Or = new  ArrayList <Orden>(); 
     
        

   
    public static void main(String[] args) {
        menu();
        System.out.println("");
    }
    public static void menu() {
         int select = -1; //opción elegida del usuario
        while(select != 0){
			
				
                                System.out.println("===== MENÚ =====");
				System.out.println("1) Iniciar Orden" );				
				System.out.println("0) Salir\n" );
				
                                System.out.print("Elige opción: " );
				select = ent.nextInt(); 
	
				
				switch(select){
				case 1:      
                                    
                                    menu2();
                                    
                                   
					break;
				case 2: 

                                  
					break;
				
				case 0: 
					System.out.println("Adios!");
					break;
				default:
					System.out.println("Número no reconocido");break;
				}
				
				System.out.println("\n"); //Mostrar un salto de línea en Java
				
			
		}
    }
  
     public static void menu2() {
         int select = -1; 
         while(select != 0){


            System.out.println("===== ¿DESEA CREAR PRODUCTO? =====");
            System.out.println("1) SI" );
            System.out.println("0) NO\n" );

            System.out.print("Elige opción: " );
            select = ent.nextInt(); 


            switch(select){
            case 1: 
                 ArrayList <Productos> Pro = new  ArrayList <Productos>(); 
                ent.nextLine();

                System.out.print("\nINTRODUZCA EL NOMBRE DEL PRODUCTO: ");
                String nom = ent.nextLine();

                System.out.print("\nINTRODUZCA EL PRECIO DEL PRODUCTO: ");
                double pre = ent.nextDouble();
                Productos Pr = new Productos(nom,pre);                     
                Pro.add(Pr);    
                Orden uno;
                uno = new Orden(Pro);
                Or.add(uno);
                uno.AgregarProducto(Pr);
                uno.MostrarOrden();
                uno.CalcularTotal();
                    break;
           				
            case 0: 
                    System.out.println("Adios!");
                    break;
            default:
                    System.out.println("Número no reconocido");
                    break;
            }

            System.out.println("\n"); 
                                  
        
        }
    }
 
}
