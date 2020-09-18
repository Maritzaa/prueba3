/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Random;
import javax.swing.DefaultListModel;

/**
 *
 * @author Maritza
 */
public class CrearArchivo {
   //private File archivo;
   
    public void EscribirArchivo() {
       File archivo =new File("F:\\Esctructura2\\ArchivosHilos\\Prueba.txt");
        if (archivo.exists()) {
            System.out.println("el archivo existe por lo tanto no lo creo");
            System.out.println("borrando archivo");
            
        }else  {
             System.out.println("Error el archivo no existe!!");
            System.out.println("Creando el archivo...");
            try {
                archivo.createNewFile();
                System.out.println("Archivo creado satisfactoriamente");
            } catch (IOException ex) {
                System.out.println("Error creando el archivo...");
            }
            
        }
        try {
            FileReader reader = new FileReader(archivo);
            
            BufferedReader buffrd = new BufferedReader(reader);
            String linea;
            
            while ((linea = buffrd.readLine())!= null){
                System.out.println(linea);
            }
            
            buffrd.close();
            reader.close();
            
            FileWriter writer = new FileWriter(archivo,true);
            BufferedWriter buffwr = new BufferedWriter (writer);
            for (int i = 0; i < Rndom().length; i++) {
                writer.write(String.valueOf(Rndom()[i] + ";"));
            }
            System.out.println("Fin");


            buffwr.close();
            writer.close();
//            
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado!!");
            
            //}catch (NullPonterException | IOException ex){
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo!!"); 
        }
        
        
    
    }
    public int[] Rndom() {
      Random rnd=new Random(System.currentTimeMillis());
      int[] vector =new int[100000];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=rnd.nextInt(1000)+1;
        }
       
       return vector;
        
        
    }
    public static boolean primo(int numero) {
       int contador=2;
       boolean primo=true;
       while((primo)&&(contador!=numero)){
           if(numero % contador==0){
               primo=false;
               contador++;
               
           }
       }
       return primo;
        
    }
}

//  
//    public double raiz() {
//        double n;
//        for (int i = 0; i < Rndom().length; i++) {
//          double n=(double) Math.sqrt(Rndom()[i]);
//        }
//        return n;
//    }
//   }

 
    

