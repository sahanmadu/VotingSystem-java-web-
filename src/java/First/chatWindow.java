package First;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sahan
 */
@WebServlet(name = "chatWindow", urlPatterns = {"/chatWindow"})
public class chatWindow extends HttpServlet {
    
    
String username,tempName;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) 
        {
           
            
         String message = request.getParameter("msg"); 
         String username = session.getAttribute("username").toString(); 
       
         
        
         out.println("<html>  <head> <body bgcolor=\"#D3D3D3\"> <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> <title>CHAT WITH OTHERS</title>  </head>");
         out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> <center>");
         out.println(username);
         out.println("<br> Welcome to our online chat ");
         out.println("</h2><br><br>");
         out.println("  <body>");
         out.println("<form name=\"chatWindow\" action=\"chatWindow\">");
         out.println("Message: <input type=\"text\" name=\"msg\" value=\"\" required /><input type=\"submit\" value=\"Send\" name=\"cmdSend\"  />");
       
         out.println("<br>  <br>");
         out.println("Messages in Chat Box:");
         out.println("<br><br>");
         out.println("<textarea  readonly=\"readonly\"   name=\"txtMessage\" rows=\"30\" cols=\"70\">");

       
        if(request.getParameter("msg")!=null)
         {

           try
           {
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","");
              
                Statement st=con.createStatement();
             
                
                String sql = "insert into messages values ('"+username+"','"+message+"')";
                st.executeUpdate(sql);

                st.execute("commit");
                
           }
           catch(Exception ex1)
           {
                        System.err.println(ex1.getMessage());
                        String messages = "No";
                        out.println(messages);
           }
         }
       
        
         try
         {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","");
              
            Statement st=con.createStatement();
                 
            ResultSet rs=st.executeQuery("select * from messages");
            
           
            while(rs.next())
            {
                String messages =rs.getString(1)+ " >> " + rs.getString(2);
                
                out.println(messages);
            }
               
            con.close();
         }
         catch(Exception ex1) 
         {
            System.err.println(ex1.getMessage());
         }
         
         out.println("</textarea>");
        
         out.println("</form>");
         out.println("</body>");
         out.println("</html>");
        }
    

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       
        
        session = request.getSession();
        
        if(username!=null)
        {
            tempName=username;
        }

        processRequest(request, response);
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
 HttpSession session;
}
