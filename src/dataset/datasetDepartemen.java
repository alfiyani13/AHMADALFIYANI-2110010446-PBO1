/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author Akhmad Alfiani
 */
public class datasetDepartemen {
   private ArrayList<String> namadepartemen; 
   private ArrayList<String> singkatandepartemen;
   private ArrayList<String> kodedepartemen;
   private ArrayList<String> tanggaldibuat;
   
   public datasetDepartemen(){
        namadepartemen = new ArrayList<>();
        singkatandepartemen = new ArrayList<>();
        kodedepartemen = new ArrayList<>();
        tanggaldibuat = new ArrayList<>();
    
}
   public void addNamadepartemen(String value){
        this.namadepartemen.add(value);
    }
    
    public ArrayList<String> getNamadepartemen(){
        return this.namadepartemen;
    }
    
    public void addSingkatandepartemen(String value){
        this.singkatandepartemen.add(value);
    }
    
    public ArrayList<String> getSingkatandepartemen(){
        return this.singkatandepartemen;
    }
    public void addKodedepartemen(String value){
        this.kodedepartemen.add(value);
    }
    
    public ArrayList<String> getKodedepartemen(){
        return this.kodedepartemen;
    }
    public void addTanggaldibuat(String value){
        this.tanggaldibuat.add(value);
    }
    
    public ArrayList<String> getTanggaldibuat(){
        return this.tanggaldibuat;
    }
    
    public void Departemen(String namadepartemen, String singkatandepartemen,String kodedepartemen, String tanggaldibuat){
          addNamadepartemen(namadepartemen);
          addSingkatandepartemen(singkatandepartemen);
          addKodedepartemen(kodedepartemen);
          addTanggaldibuat(tanggaldibuat);
    }
}
