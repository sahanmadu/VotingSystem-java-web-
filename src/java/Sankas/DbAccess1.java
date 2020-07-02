/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sankas;

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
public class DbAccess1 {
    public void addNew(new12 n){
   try {
            PreparedStatement ps=DBconnect.getPreparedStatement("insert into election (partie,candidate) values(?,?)");
            
            ps.setString(1, n.getPartie());
              ps.setString(2, n.getCandidate());
               
                  ps.executeUpdate();

            
        } catch (SQLException ex) {
            Logger.getLogger(DbAccess1.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    
    }
    
    
    
      public static List<new12> getAll(){
         List<new12> ls=new LinkedList<>();
     
         try {
             ResultSet rs=DBconnect.getPreparedStatement("select id, partie,count(partie) from election group by partie").executeQuery();
             while(rs.next()){
             
             new12 n=new new12(rs.getInt(1),rs.getString(2),rs.getString(3));
             ls.add(n);
             }
         } catch (SQLException ex) {
             Logger.getLogger(DbAccess1.class.getName()).log(Level.SEVERE, null, ex);
         }
         return  ls;
     
     
     
     }
    
    
}
