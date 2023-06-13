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
public class datasetAdmin {
   private ArrayList<String> username; 
   private ArrayList<String> password; 
   private ArrayList<String> tanggaldibuat;
   
   public datasetAdmin(){
        username = new ArrayList<>();
        password = new ArrayList<>();
        tanggaldibuat = new ArrayList<>();
    
}
   public void addUsername(String value){
        this.username.add(value);
    }
    
    public ArrayList<String> getUsername(){
        return this.username;
    }
    
    public void addpassword(String value){
        this.password.add(value);
    }
    
    public ArrayList<String> getPassword(){
        return this.password;
    }
    
    public void addTanggaldibuat(String value){
        this.tanggaldibuat.add(value);
    }
    
    public ArrayList<String> getTanggaldibuat(){
        return this.tanggaldibuat;
    }
    
    public void Admin(String username, String password, String tanggaldibuat){
          addUsername(username);
          addpassword(password);
          addTanggaldibuat(tanggaldibuat);
    }
}
