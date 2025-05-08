/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

/**
 *
 * @author TEGAR RASYID
 */
public class Buku {
    public int id_buku;
    public String judul_buku,pengarang;
    
    public void cetak_buku(){
        System.out.println("Buku saya aslinya adalah : "+id_buku+" "+judul_buku+" "+pengarang);
    }
    
    public void insert_data(int id_buku,String judul_buku, String pengarang){
        this.id_buku=id_buku;
        this.judul_buku=judul_buku;
        this.pengarang=pengarang;
        System.out.println("Menambahkan data buku : "+id_buku+""+judul_buku+""+pengarang);
    }
    public void update_data(){
        System.out.println("Merubah data buku");
    }
    public float bagi_angka(){
        float a=1.5f,b=3.0f,c;
        c=a/b;
        
        
        return c;
    }
    
}
