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
public class datasetCuti {
   private ArrayList<String> tipecuti; 
   private ArrayList<String> alasancuti; 
   private ArrayList<String> tanggaldibuat;
   
   public datasetCuti(){
        tipecuti = new ArrayList<>();
        alasancuti = new ArrayList<>();
        tanggaldibuat = new ArrayList<>();
    
}
   public void addTipecuti(String value){
        this.tipecuti.add(value);
    }
    
    public ArrayList<String> getTipecuti(){
        return this.tipecuti;
    }
    
    public void addAlasancuti(String value){
        this.alasancuti.add(value);
    }
    
    public ArrayList<String> getAlasancuti(){
        return this.alasancuti;
    }
    
    public void addTanggaldibuat(String value){
        this.tanggaldibuat.add(value);
    }
    
    public ArrayList<String> getTanggaldibuat(){
        return this.tanggaldibuat;
    }
    
    public void Cuti(String tipecuti, String alasancuti, String tanggaldibuat){
          addTipecuti(tipecuti);
          addAlasancuti(alasancuti);
          addTanggaldibuat(tanggaldibuat);
    }
}
