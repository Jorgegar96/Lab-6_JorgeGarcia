
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JorgeLuis
 */
public class Universo {
    
    private String name;
    private ArrayList<Ser> seres;
    private String ruta;
    private File archivo;

    public Universo() throws IOException {
        seres = new ArrayList();
    }

    public Universo(String name) throws IOException {
        this.name = name;
        seres = new ArrayList();
        setRuta();
        this.archivo = new File(ruta);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Ser> getSeres() {
        return seres;
    }

    public void setSeres(ArrayList<Ser> seres) {
        this.seres = seres;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta() {
        this.ruta = "./" + name + ".txt";
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void addSer(Ser ser){
        this.seres.add(ser);
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    public void escribirArchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo,false);
            bw = new BufferedWriter(fw);
            for (Ser ser : seres) {
                bw.write(ser.getRaza() + "|");
                bw.write(ser.getKi() + "|");
                bw.write(ser.getAños_max() + "|");
                bw.write(ser.getPlaneta() + "|");
                bw.write("\n");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo(){
        if (archivo.exists()){
            Scanner sc = null;
            seres = new ArrayList();
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNextLine()){
                    seres.add(new Ser(sc.next(),
                            sc.nextInt(),
                            sc.nextInt(),
                            sc.next()
                        )
                    );
                }
            } catch (Exception e) {
            }
            sc.close();
        }
    }
    
}
