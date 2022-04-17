/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PEWARISAN;

/**
 *
 * @author Member
 */
public class subClass extends superClass {
    String nama = "Arimbi";
    int umur = 15;
    
    public void cetak (){
       System.out.println("Anak ini punya sifat "+super.sifat);
        System.out.println("Yang bernama "+nama);
        System.out.println("Berumur "+umur+" Tahun");
        System.out.println("Dengan tinggi badan "+super.TB);
        super.hobby();
    }
}
