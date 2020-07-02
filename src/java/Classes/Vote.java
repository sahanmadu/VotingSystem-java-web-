/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Sahan
 */
public class Vote {
    
 private int id;
 private String nic;
 private String name;
 private String address;
 private String email;
 private String district;
  private String username;
  private String pwd;
  private String cpwd;
 private int tele;

    public Vote(int id, String nic, String name, String address, String email, String district, String username, String pwd, String cpwd, int tele) {
        this.id = id;
        this.nic = nic;
        this.name = name;
        this.address = address;
        this.email = email;
        this.district = district;
         this.username = username;
          this.pwd = pwd;
           this.cpwd = cpwd;
        this.tele = tele;
    }

 
 
 
 
 
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
    
    
     public String getUsername() {
        return username;
    }

    public void setUsername(String email) {
        this.username = username;
    }
    
    
     public String getPwd() {
        return pwd;
    }

    public void setPwd(String email) {
        this.pwd = pwd;
    }
    
     public String getCpwd() {
        return cpwd;
    }

    public void setCpwd(String email) {
        this.cpwd = cpwd;
    }
    
    

    public int getTele() {
        return tele;
    }

    public void setTele(int tele) {
        this.tele = tele;
    }
 
 
 
 
 
 
    
}
