/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operator;

/**
 *
 * @author TEGAR RASYID
 */
public class matematika {
    int p,l,t,s,a,phi,r;
    // rumus kubus

    public int tambah(){
        return 0;
        
    }
    
    public int tambah1(int s){
        int V;
        this.s = s;
        
        V = s*s*s; 
        System.out.println("Volume kubus adalah "+ V );
        return 0;
    }
    
    public int tambah2(int p, int l, int t){
        int V;
        this.p = p;
        this.l = l;
        this.t = t;
        
        V = p * l * t; 
        System.out.println("Volume balok adalah "+ V );
        return 0;
    }
    
    
        public int tambah3(int p, int l, int t){
        int V;
        this.p = p;
        this.l = l;
        this.t = t;
        
        V = p*l*t/3;

        System.out.println("Volume limas adalah "+ V );
        return 0;
    }
    
    
        public int tambah4(int r, int t, int phi){
        int V;
        this.r = r;
        this.t = t;
        this.phi = phi;
        
        V = phi * r*r * t ;
        System.out.println("Volume tabung adalah "+ V );
        return 0;
    }
    
}
