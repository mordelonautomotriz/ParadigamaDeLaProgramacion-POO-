/*
disene un algoritmo en el que ingrese 
los requerimientos funcionales
del paper selecionado
 */
package requerimientosfuncionales;

import java.util.Scanner;

/**
 *
 * @author HECTOR ORTIZ
 */
public class RequerimientosFuncionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner objeto=new Scanner(System.in);//new reserva espacio de memoria
      
       System.out.println("\tUniversidad De Las Fuerzas Armadas ESPE - Extension Latacunga ");
 
        System.out.println("\nDepartamento: Energia y Mecanica");
        
        System.out.println("Carrera: Ingeniera Automotriz");
        
        System.out.println("Docente: Ing. Luis Guerra ");
        
        System.out.println("Asignatura: Programacion ");
        
        System.out.println("Nivel: 4to nivel 'B' ");
        
        System.out.println("ID: L00280605 \n");
        
        System.out.println("ingrese los REQUERIMIENTOS FUNCIONALES: \n");
        
        System.out.println("\tPropiedades \n");
        String requerimientoun=objeto.nextLine();
        
        System.out.println("\ningrese los requerimientos NO FUNCIONALES: \n");
        
        System.out.println("\tPropiedades");
        String requerimientouno=objeto.nextLine();
       
        System.out.println("\nindique las FASES PARA EL DISENIO DE LA ORIENTACION A OBJETOS \n");
        
       System.out.println("\tatributos: ");
       String faseuno=objeto.nextLine();
       String fasedos=objeto.nextLine();
       String fasetres=objeto.nextLine();
       String fasecuatro=objeto.nextLine();
       String fasecinco=objeto.nextLine();
       String faseseis=objeto.nextLine();
              
        System.out.println("\tservicios:");
       String pasodos=objeto.nextLine();
       String pasotres=objeto.nextLine();
       String pasocuatros=objeto.nextLine();
       String pasocinco=objeto.nextLine();
       String pasoseis=objeto.nextLine();
       String pasosiete=objeto.nextLine();
       
       System.out.println("\tingrese datos de la ABSTRACCION:");
       
       String elementouno=objeto.nextLine();
       String elementodos=objeto.nextLine();
       String elementotres=objeto.nextLine();
       String elementocuatroa=objeto.nextLine();
       
       System.out.println("\tdetermine el ENCAPSULAMIENTO: \n");
       System.out.println("Sistema: ");
       String sistema=objeto.nextLine();
       
      System.out.println("\tObjeto: ");
      String objetos=objeto.nextLine();
      
      System.out.println("\tClase de Objeto: ");
      String claseObjeto=objeto.nextLine();
      
      System.out.println("\tAtributos: ");
      String atributo=objeto.nextLine();
      String atributos=objeto.nextLine();
      
      System.out.println("\tservicios:");
      String servicio=objeto.nextLine();
      String servicios=objeto.nextLine();
    }
    
}
