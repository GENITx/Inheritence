/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding;

/**
 *
 * @author Member
 */
public class Hasil extends Bangundatar {
       public static void main(String[] args) {
       Bangundatar bangundatar=new Bangundatar();
        
       persegi Persegi = new persegi();
       Persegi.sisi=8;
        
       Persegipanjang perjang =new Persegipanjang();
       perjang.lebar=11;
       perjang.panjang=2;
        
        
       bangundatar.luas();
       bangundatar.keliling();
       
       Persegi.luas();
       Persegi.keliling();
       
       perjang.luas();
       perjang.keliling();
        
    }

    @Override
    public void keliling() {
        super.keliling(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void luas() {
        super.luas(); //To change body of generated methods, choose Tools | Templates.
    }
       

}
