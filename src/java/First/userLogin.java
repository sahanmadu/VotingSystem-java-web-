package First;



import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@WebServlet(name = "userLogin", urlPatterns = {"/userLogin"})
public class userLogin extends HttpServlet {
    
public String username;
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        
        username=request.getParameter("user"); 

        PrintWriter out=response.getWriter();
        
        try
        {
      
            
           session=request.getSession();
           session.setAttribute("username",request.getParameter("user")); 
           String username = session.getAttribute("username").toString(); 
       
       
         out.println("<html>  <head> <body bgcolor=\"#D3D3D3\"> <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> <title>AASK FROM OTHERS</title></head>");
         out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> <center>");
         out.println(username);
         out.println("<br> Welcome to Our online Chat ");
         out.println("</h2><br><br>");
         out.println(" <body>");
         out.println(" <form name=\"chatWindow\" action=\"chatWindow\">");
         out.println("Message: <input type=\"text\" name=\"msg\" value=\"\" required  /><input type=\"submit\" value=\"Send\" name=\"cmdSend\" required/>");
         out.println("<br>  <br>");
         out.println("Messages in Chat Box:");
         out.println("<br><br>");
         out.println("<textarea  readonly=\"readonly\"   name=\"txtMessage\" rows=\"20\" cols=\"60\">");
         
                  
       
        
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/votingsystem","root","");
              
                Statement st=con.createStatement();
                 
                ResultSet rs=st.executeQuery("select *from messages");
            
               
                while(rs.next())
                {
                    String messages =rs.getString(1)+ " >> " + rs.getString(2);
                    out.println(messages);
                }
               
                con.close();
            }
            catch(Exception e2) 
            {
                System.err.println(e2.getMessage());
            }
         
         out.println("</textarea>");
         out.println("</form>");
         out.println("</body>");
         out.println("</html>");
                    

        }
        catch(Exception e)
        {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet </title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>failed!</h1>");
            out.println("</body>");
            out.println("</html>");
            System.out.println(e);
        }
        
                
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
