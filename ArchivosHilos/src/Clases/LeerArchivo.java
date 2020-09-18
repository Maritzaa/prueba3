/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Maritza
 */
public class LeerArchivo {
      
    public int[] cargar(File f) throws IOException {
    
        int[] array = null;

        if (f.exists()) {

            FileReader reader = null;
            BufferedReader buufrd = null;
            String[] campos;
            try {
                reader = new FileReader(f);
                buufrd = new BufferedReader(reader);
                String line;

                int i = 0;

                int tamaño = 0;

                while ((line = buufrd.readLine()) != null) {

                    campos = line.split(",");

                    tamaño = Integer.parseInt(campos[i]);

                    i = i + 1;
                    array = new int[campos.length];
                    for (int j = 0; j < campos.length; j++) {

                        array[j] = Integer.parseInt(campos[j]);

                    }


                }


            } catch (FileNotFoundException ex) {

                System.out.println("error en  File");

            } finally {

                buufrd.close();
                reader.close();
            }

        } else {
            System.out.println("El archivo no existe");
            return null;
        }
        return array;
     
    
    }
         
}
