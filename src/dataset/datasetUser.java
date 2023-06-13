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
public class datasetUser {
   private ArrayList<String> idkaryawan; 
   private ArrayList<String> namaawal;
   private ArrayList<String> namaakhir;
   private ArrayList<String> email;
   private ArrayList<String> password;
   private ArrayList<String> jeniskelamin;
   private ArrayList<String> tanggallahir;
   private ArrayList<String> departemen;
   private ArrayList<String> alamat;
   private ArrayList<String> kota;
   private ArrayList<String> negara;
   private ArrayList<String> nomertelpon;
   private ArrayList<String> status;
   private ArrayList<String> tanggaldaftar;
   
   public datasetUser(){
        idkaryawan = new ArrayList<>();
        namaawal = new ArrayList<>();
        namaakhir = new ArrayList<>();
        email = new ArrayList<>();
        password = new ArrayList<>();
        jeniskelamin = new ArrayList<>();
        tanggallahir = new ArrayList<>();
        departemen = new ArrayList<>();
        alamat = new ArrayList<>();
        kota = new ArrayList<>();
        negara = new ArrayList<>();
        nomertelpon = new ArrayList<>();
        status = new ArrayList<>();
        tanggaldaftar = new ArrayList<>();
    
}
   public void addIdkaryawan(String value){
        this.idkaryawan.add(value);
    }
    
    public ArrayList<String> getIdkaryawan(){
        return this.idkaryawan;
    }
    
    public void addNamaawal(String value){
        this.namaawal.add(value);
    }
    
    public ArrayList<String> getNamaawal(){
        return this.namaawal;
    }
    public void addNamaakhir(String value){
        this.namaakhir.add(value);
    }
    
    public ArrayList<String> getNamaakhir(){
        return this.namaakhir;
    }
    public void addEmail(String value){
        this.email.add(value);
    }
    
    public ArrayList<String> getEmail(){
        return this.email;
    }
    public void addPassword(String value){
        this.password.add(value);
    }
    
    public ArrayList<String> getPassword(){
        return this.password;
    }
    public void addJeniskelamin(String value){
        this.jeniskelamin.add(value);
    }
    
    public ArrayList<String> getJeniskelamin(){
        return this.jeniskelamin;
    }
    public void addTanggallahir(String value){
        this.tanggallahir.add(value);
    }
    
    public ArrayList<String> getTanggallahir(){
        return this.tanggallahir;
    }
    public void addDepartemen(String value){
        this.departemen.add(value);
    }
    
    public ArrayList<String> getDepartemen(){
        return this.departemen;
    }
    public void addAlamat(String value){
        this.alamat.add(value);
    }
    
    public ArrayList<String> getAlamat(){
        return this.alamat;
    }
    public void addKota(String value){
        this.kota.add(value);
    }
    
    public ArrayList<String> getKota(){
        return this.kota;
    } 
    public void addNegara(String value){
        this.negara.add(value);
    }
    
    public ArrayList<String> getNegara(){
        return this.negara;
    } 
    public void addNomertelpon(String value){
        this.nomertelpon.add(value);
    }
    
    public ArrayList<String> getNomertelpon(){
        return this.nomertelpon;
    } 
    public void addStatus(String value){
        this.status.add(value);
    }
    
    public ArrayList<String> getStatus(){
        return this.status;
    } 
    public void addTanggaldaftar(String value){
        this.tanggaldaftar.add(value);
    }
    
    public ArrayList<String> getTanggaldaftar(){
        return this.tanggaldaftar;
    } 
    
    public void datasetUser (String idkaryawan, String namaawal, String namaakhir, String email,
        String password, String jeniskelamin, String tanggallahir, String departemen, String alamat, String kota,
        String negara, String nomertelpon, String status, String tanggaldaftar){
          addIdkaryawan(idkaryawan);
          addNamaawal(namaawal);
          addNamaakhir(namaakhir);
          addPassword(password);
          addJeniskelamin(jeniskelamin);
          addTanggallahir(tanggallahir);
          addDepartemen(departemen);
          addAlamat(alamat);
          addKota(kota);
          addNegara(negara);
          addNomertelpon(nomertelpon);
          addStatus(status);
          addTanggaldaftar(tanggaldaftar);
    }
}
