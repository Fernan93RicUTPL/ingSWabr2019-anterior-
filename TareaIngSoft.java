package tareaingsoft;
import java.util.Scanner;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author _Ricardo Melo_
 */
public class TareaIngSoft {

    public static void main(String[] args) {
         Scanner lector = new Scanner (System.in);
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        int  fNacimiento, aActual;
        String nombres="", apellidos="", direccion="", correo="";
        archivo = new File("ArchivoResultante.txt");
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
                nombres=JOptionPane.showInputDialog(null,"Ingrese sus nombres");
                apellidos=JOptionPane.showInputDialog(null,"Ingreses sus apellidos");
                direccion=JOptionPane.showInputDialog(null,"Ingrese su dirección");
                correo=JOptionPane.showInputDialog(null,"Ingrese su correo electrónico");
                
                fNacimiento=Integer.parseInt(JOptionPane.showInputDialog("Introduzca su año de nacimiento"));
                aActual=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año actual"));
                
                
                int edad=aActual-fNacimiento;
                
                System.out.println("****Sus nombres -> "+nombres+"****");
                System.out.println("****Sus apellidos -> "+apellidos+"****");
                System.out.println("****Su dirección -> "+direccion+"****");
                System.out.println("****Su correo electrónico -> "+correo+"****");
                System.out.println("****Su edad es de -> "+edad+"****");
                
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                //escritura en archivo de texto
                linea.println("****Sus nombres-> "+nombres+"****");
                linea.println("****Sus apellidos-> "+apellidos+"****");
                linea.println("****Su dirección-> "+direccion+"****");
                linea.println("****Su correo electrónico-> "+correo+"**** \n");
                linea.println("Año de nacimiento ingresado-> "+fNacimiento);
                linea.println("Año actual-> "+aActual);
                linea.println("****Su edad es de: "+edad+" años****");
                
                if (edad >= 18){
                    System.out.println("****Usted es mayor de edad****");
                    linea.println("****Usted es mayor de edad****");
                }else{
                    System.out.println("****Usted no cumple con la mayoría de edad****");
                    linea.println("****Usted no cumple con la mayoría de edad****");
                }
                
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(TareaIngSoft.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            try {
                   
                nombres=JOptionPane.showInputDialog(null,"Ingrese sus nombres");
                apellidos=JOptionPane.showInputDialog(null,"Ingreses sus apellidos");
                direccion=JOptionPane.showInputDialog(null,"Ingrese su dirección");
                correo=JOptionPane.showInputDialog(null,"Ingrese su correo electrónico");
                fNacimiento=Integer.parseInt(JOptionPane.showInputDialog("Introduzca su año de nacimiento"));
                
                aActual=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año actual"));
                
                
                int edad=aActual-fNacimiento;
                
                System.out.println("****Sus nombres -> "+nombres+" ****");
                System.out.println("****Sus apellidos -> "+apellidos+" ****");
                System.out.println("****Su dirección -> "+direccion+" ****");
                System.out.println("****Su correo electrónico -> "+correo+" ****");
                System.out.println("Su edad es de -> "+edad+" años");
                
                
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                //escritura en archivo de texto
                linea.println("****Sus nombres-> "+nombres+"****");
                linea.println("****Sus apellidos-> "+apellidos+"****");
                linea.println("****Su dirección-> "+direccion+"****");
                linea.println("***Su correo electrónico-> "+correo+"**** \n");
                linea.println("Año de nacimiento ingresado-> "+fNacimiento);
                linea.println("Año actual-> "+aActual);
                linea.println("****Su edad es de: "+edad+" años****");
                
                if (edad >= 18){
                    System.out.println("****Usted es mayor de edad****");
                    linea.println("****Usted es mayor de edad****");
                }else{
                    System.out.println("****Usted no cumple con la mayoría de edad****");
                    linea.println("****Usted no cumple con la mayoría de edad****");
                }
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(TareaIngSoft.class.getName()).log(Level.SEVERE, null, ex);
            }
               
        }

        
        
    }
    
}