/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisanLat2;

/**
 *
 * @author Member
 */
public class Subclass extends SuperClass {
    String nama;
    int umur = 15;
    
    public void setName (String nama){
        this.nama = nama;
    }
    
    public void cetak (){
       System.out.println("Anak ini punya sifat "+super.sifat);
        System.out.println("Yang bernama "+nama);
        System.out.println("Berumur "+umur+" Tahun");
        System.out.println("Dengan tinggi badan "+super.TB);
        super.hobby();
    }
}
