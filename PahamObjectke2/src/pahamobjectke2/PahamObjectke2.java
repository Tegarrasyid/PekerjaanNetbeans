/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pahamobjectke2;

/**
 *
 * @author TEGAR RASYID
 */
public class PahamObjectke2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama = "Tegar";
        int usia = 201;
        boolean kondisi = true;
        double pecahan = 21.7;
        float pecahan_kecil = 11.2f;
        
        //menampilkan data variabel
        System.out.println("Nama saya adalah :"+nama);
        System.out.println("Usia saya adalah :"+usia);
        System.out.println("Kondisi saya adalah :"+kondisi);
        System.out.println("Pecahan saya adalah :"+pecahan);
        System.out.println("Pecahan kecil saya adalah :"+pecahan_kecil);
        
        /*
        Deklarasi Object untuk dapat 
        memahami struktur Object
        */
        LatihObject object_1 = new LatihObject();   
        System.out.println("--------------");
        System.out.println("Data Objectif");
        System.out.println("--------------");
        
        
        //mengakses object
        System.out.println(object_1.kondisi);
        System.out.println(object_1.usia);
        System.out.println(object_1.nama);
        System.out.println(object_1.pecahan);
        System.out.println(object_1.pecahan_kecil);
        
        
        
         System.out.println("--------------");
        System.out.println("Jenis Harimau");                                                                                       
        System.out.println("--------------");
        //mengakses object harimau 1
        Harimau1 harimau1 = new Harimau1();
        
        System.out.println("--------------");
        System.out.println("Harimau Jantan");                                                                                       
        System.out.println("--------------");
        
       
         harimau1.setNama("Bagong");
         harimau1.setJenis_kelamin("Jantan");
         harimau1.setUsia(6);
        
         System.out.println("Nama harimau saya adalah " +harimau1.nama);
        System.out.println("Jenis kelaminnya adalah " +harimau1.jenis_kelamin);
        System.out.println("Berusia " +harimau1.usia+ " tahun");

         
         //mengakses object harimau 2
         Harimau2 harimau2 = new Harimau2();
         
         System.out.println("--------------");
        System.out.println("Harimau Betina");                                                                                       
        System.out.println("--------------");
         
         harimau2.setNama("Revi");
         harimau2.setJenis_kelamin("Betina");
         harimau2.setUsia(5);
         
         System.out.println("Nama harimau saya adalah " +harimau2.nama);
         System.out.println("Jenis kelaminnya adalah " +harimau2.jenis_kelamin);
         System.out.println("Berusia " +harimau2.usia+ " tahun");
         
         
    }
}
        
    
    
              


