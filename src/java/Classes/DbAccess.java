/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sahan
 */
public class DbAccess {
    
     public void addNew(Vote n){
   try {
            PreparedStatement ps=DBconnect.getPreparedStatement("insert into vote(nic,fname,address,email,district,username,password,cpassword,tele) values(?,?,?,?,?,?,?,?,?)");
            
            ps.setString(1, n.getNic());
              ps.setString(2, n.getName());
                ps.setString(3, n.getAddress());
                  ps.setString(4, n.getEmail());
                      ps.setString(5, n.getDistrict());
                      ps.setString(6, n.getUsername());
                      ps.setString(7, n.getPwd());
                      ps.setString(8, n.getCpwd());
                      ps.setInt(9, n.getTele());
                  ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(DbAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    
    }
    
     public static List<Vote> getAll(){
         List<Vote> ls=new LinkedList<>();
     
         try {
             ResultSet rs=DBconnect.getPreparedStatement("select * from vote").executeQuery();
             while(rs.next()){
             
             Vote n=new Vote(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10));
             ls.add(n);
             }
         } catch (SQLException ex) {
             Logger.getLogger(DbAccess.class.getName()).log(Level.SEVERE, null, ex);
         }
         return  ls;
     
     
     
     }
     
     
     
       public static List<Vote> getNewById(int id){
         List<Vote> ls=new LinkedList<>();
         String sql="select * from vote where id = " +id;
         try {
             ResultSet rs=DBconnect.getPreparedStatement(sql).executeQuery();
             while(rs.next()){
                 
             Vote n=new Vote(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10));
             ls.add(n);
             }
         } catch (SQLException ex) {
             Logger.getLogger(DbAccess.class.getName()).log(Level.SEVERE, null, ex);
         }
         return  ls;
     
     
     
     }
     
   public void edit(int id,String nic,String name,String address,String email,String district,String username,String pwd,String cpwd,int tele ){
     String sql="update vote set nic=?,fname=?,address=?,email=?,district=?,username=?,password=?,cpassword=?,tele=?" + " where id = ? ";
    
         try {
              PreparedStatement ps=DBconnect.getPreparedStatement(sql);
             ps.setString(1,nic);
             ps.setString(2,name);
               ps.setString(3,address);
                 ps.setString(4,email);
                   ps.setString(5,district);
                   ps.setString(6,username);
                   ps.setString(7,pwd);
                   ps.setString(8,cpwd);
                   ps.setInt(9,tele);
                    ps.setInt(10,id);
                 ps.executeUpdate();
             
         } catch (SQLException ex) {
             Logger.getLogger(DbAccess.class.getName()).log(Level.SEVERE, null, ex);
         }
     
     }
     
     public void delete(int id){
     
    
         try {
              String sql3="delete from vote where id=?";
      PreparedStatement ps=DBconnect.getPreparedStatement(sql3);
             ps.setInt(1, id);
             ps.executeUpdate();
         } catch (SQLException ex) {
             Logger.getLogger(DbAccess.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
    
    
}
