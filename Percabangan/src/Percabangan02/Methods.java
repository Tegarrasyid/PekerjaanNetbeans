/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percabangan02;

/**
 *
 * @author TEGAR RASYID
 */
public class Methods {
    
    public int a, b, c;
    
    
    public void tulis(){
        System.out.println("method tulis");
    }
    
    public int tambah(){
        int x,y=0,z=10;
        x=y+z;
        System.out.println("Nilai x = "+x);
        return x;
    }
    
    public int tambah01(int b, int c){
        this.b = b;
        this.c = c;
        a= b+c;
        System.out.println("Nilai a = "+a+" (Dari pertambahan)");
        
        return a;
    }
    
    public int kurang(int b, int c){
        this.b = b;
        this.c = c;
        a= b-c;
        System.out.println("Nilai a = "+a +" (Dari pengurangan)");
        return 0;
    }
    
    public int kali(int b, int c){
        this.b = b;
        this.c = c;
        a= b*c;
        System.out.println("Nilai a = "+a +" (Dari perkalian)");
        return 0;
    }
    
    public int bagi(int b, int c){
        this.b = b;
        this.c = c;
        a= b/c;
        System.out.println("Nilai a = "+a+" (Dari pembagian)");
        return 0;
    }
    
    private void tulis01(){
        System.out.println("Private method");
    }
    
    protected void tulis02(){
        System.out.println("protected method");
    }
    
    
    
    
}
