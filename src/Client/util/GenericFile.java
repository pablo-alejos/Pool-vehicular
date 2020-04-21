/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.util;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author luis.martinez //english version Pablo Alejos
 * @param <T>
 */
public class GenericFile<T> {

    String fileName = "fileObj.ser";   
    File file = null;
    
    public GenericFile(String nombre_archivo_in){
        fileName = nombre_archivo_in;
    }

    public boolean newFile() {
        boolean resultado = false;

        try {

            file = new File(fileName);
            file.createNewFile();

            resultado = true;
            System.out.println("New file created: " + file.getPath());

        } catch (IOException e) {

            e.printStackTrace();

        }         

        return resultado;
    }   

    public ArrayList read() {

        ArrayList<T> data = new ArrayList();
        
        FileInputStream file_InputStream = null;
        ObjectInputStream in = null;

        try {
            file_InputStream = new FileInputStream(fileName);
            in = new ObjectInputStream(file_InputStream);

            data = (ArrayList<T>) in.readObject();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e) {
            System.out.println("End file");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {

                if (file_InputStream != null) {
                    file_InputStream.close();
                    file_InputStream = null;
                }

                if (in != null) {
                    in.close();                    
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        return data;
    }

    public boolean update(ArrayList<T> data) {
        boolean result = false;
        
        FileOutputStream file_OutputStream = null;
        ObjectOutputStream out = null;

        try {
            file_OutputStream = new FileOutputStream(fileName);
            out = new ObjectOutputStream(file_OutputStream);
            out.writeObject(data);

            result = true;

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (file_OutputStream != null) {
                    file_OutputStream.close();
                    file_OutputStream= null;
                }

                if (out != null) {
                    out.close();                    
                }

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

        return result;
    }

    
}
