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
        archivo = new File("ArchivoResultante.txt");
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
                fNacimiento=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento"));
                
                aActual=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año actual"));
                
                
                int edad=aActual-fNacimiento;
                
                System.out.println("Su edad es de -> "+edad+" años");
                
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                //escritura en archivo de texto
                linea.println("Año de nacimiento ingresado-> "+fNacimiento);
                linea.println("Año actual-> "+aActual);
                linea.println("Su edad es de: "+edad+" años");
                
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(TareaIngSoft.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            try {
                   
                fNacimiento=Integer.parseInt(JOptionPane.showInputDialog("Introduzca su año de nacimiento"));
                
                aActual=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el año actual"));
                
                
                int edad=aActual-fNacimiento;
                
                System.out.println("Su edad es de -> "+edad+" años");
                
                
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                //escritura en archivo de texto
                linea.println("Año de nacimiento ingresado-> "+fNacimiento);
                linea.println("Año actual-> "+aActual);
                linea.println("Su edad es de: "+edad+" años");
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(TareaIngSoft.class.getName()).log(Level.SEVERE, null, ex);
            }
               
        }

        
        
    }
    
}