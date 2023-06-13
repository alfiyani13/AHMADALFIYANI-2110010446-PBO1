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
public class datasetDetail_cuti {
   private ArrayList<String> tipecuti; 
   private ArrayList<String> tanggalcuti;
   private ArrayList<String> tanggalselesaicuti;
   private ArrayList<String> alasancuti;
   private ArrayList<String> tanggalpengajuan;
   private ArrayList<String> pesanadmin;
   private ArrayList<String> tanggalkonfirmasiadmin;
   private ArrayList<String> status;
   private ArrayList<String> telahdibacaadmin;
   
   public datasetDetail_cuti(){
        tipecuti = new ArrayList<>();
        tanggalcuti = new ArrayList<>();
        tanggalselesaicuti = new ArrayList<>();
        alasancuti = new ArrayList<>();
        tanggalpengajuan = new ArrayList<>();
        pesanadmin = new ArrayList<>();
        tanggalkonfirmasiadmin = new ArrayList<>();
        status = new ArrayList<>();
        telahdibacaadmin = new ArrayList<>();
    
}
   public void addTipecuti(String value){
        this.tipecuti.add(value);
    }
    
    public ArrayList<String> getTipecuti(){
        return this.tipecuti;
    }
    
    public void addTanggalcuti(String value){
        this.tanggalcuti.add(value);
    }
    
    public ArrayList<String> getTanggalcuti(){
        return this.tanggalcuti;
    }
    public void addTanggalselesaicuti(String value){
        this.tanggalselesaicuti.add(value);
    }
    
    public ArrayList<String> getTanggalselesaicuti(){
        return this.tanggalselesaicuti;
    }
    public void addAlasancuti(String value){
        this.alasancuti.add(value);
    }
    
    public ArrayList<String> getAlasancuti(){
        return this.alasancuti;
    }
    public void addTanggalpengajuan(String value){
        this.tanggalpengajuan.add(value);
    }
    
    public ArrayList<String> getTanggalpengajuan(){
        return this.tanggalpengajuan;
    }
    public void addPesanadmin(String value){
        this. pesanadmin.add(value);
    }
    
    public ArrayList<String> getPesanadmin(){
        return this. pesanadmin;
    }
    public void addTanggalkonfirmasiadmin(String value){
        this.tanggalkonfirmasiadmin.add(value);
    }
    
    public ArrayList<String> gettanggalkonfirmasiadmin(){
        return this.tanggalkonfirmasiadmin;
    }
    public void addStatus(String value){
        this.status.add(value);
    }
    
    public ArrayList<String> getStatus(){
        return this.status;
    }
    public void addTelahdibacaadmin(String value){
        this.telahdibacaadmin.add(value);
    }
    
    public ArrayList<String> getTelahdibacaadmin(){
        return this.telahdibacaadmin;
    } 
    
    public void datasetDetail_cuti (String tipecuti, String tanggalcuti, String tanggalselesaicuti, String alasancuti,
        String tanggalpengajuan, String pesanadmin, String tanggalkonfirmasiadmin, String status, String telahdibacaadmin){
          addTipecuti(tipecuti);
          addTanggalcuti(tanggalcuti);
          addTanggalselesaicuti(tanggalselesaicuti);
          addAlasancuti(alasancuti);
          addTanggalpengajuan(tanggalpengajuan);
          addPesanadmin( pesanadmin);
          addTanggalkonfirmasiadmin(tanggalkonfirmasiadmin);
          addStatus(status);
          addTelahdibacaadmin(telahdibacaadmin);
    }
}

