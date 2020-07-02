<%-- 
    Document   : Vote
    Created on : May 5, 2020, 5:42:59 PM
    Author     : Sahan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
        <style>
            img{
                width: 180px;
                height: 200px;
            }
            table{
                margin-left: 420px;
               
            }
            label{
                font-weight: bold;
                color: white;
            }
            h2{
                text-align: center;
                color: lightcyan;
                
            }
             h1{
                text-align: center;
                color: yellow;
                
            }
            
            #btn1{
                margin-left: 420px;
                padding: 0px;
            }
            
            body{
                background-image: url('Images/back.jpg');
            }
            #btn2{
                float:right;
            }
            
        </style>
    </head>
    <body>
         <button class="btn btn-danger" id="btn2"><a href="home.jsp">Log out</a></button>
          <button class="btn btn-success" id="btn2"><a href="Chat.jsp">Chat with others</a></button>
        <h1>Presidential Election 2020</h1>
       
        <<form action="Addvote.jsp" method="POST" onsubmit="return mynew()" name="form1">
        <h2>Candidates</h2>
        <table border="0" cellpadding="8"> 
            <tr>
                <td><label>Mahinda Rajapaksha</label></td>
               <td><label>Anura Kumara</label></td>
                <td><label>Ranil Wikramasinhe</label></td>
            </tr>
            <tr>
                  <td><img src="Images/mahinda.jpg"></td>
                 <td><img src="Images/anura.jpg"></td>
                  <td><img src="Images/ranil.jpg"></td>
            </tr>
            <tr>
                  <td><input type="radio"  name="candi" value="mahinda" ></td>
                  <td><input type="radio"  name="candi" value="anura" ></td>
                  <td> <input type="radio"  name="candi" value="ranil" ></td>
            </tr>
        </table>
        <br>
         <h2>PARTIES</h2>
           <table border="0" cellpading="10"> 
            <tr>
                <td><label>SLTP</label></td>
               <td><label>JVP</label></td>
                <td><label>UNP</label></td>
            </tr>
            <tr>
                  <td><img src="Images/mahi.png"></td>
                 <td><img src="Images/JVP1.jpg"></td>
                  <td><img src="Images/unp.png"></td>
            </tr>
            <tr>
                  <td><input type="radio"  name="partie" value="sltp"</td>
                  <td> <input type="radio"  name="partie" value="jvp" ></td>
                  <td> <input type="radio"  name="partie" value="unp" ></td>
            </tr>
        </table>
         <br><br>
         <input type="submit" value="Vote Here" id="btn1" class="btn btn-success">
         <input type="reset" value="Cancel" id="btn1" class="btn btn-success">
     </form> 
        
         <script src="js/Electionvali.js"></script>
      
              
        
    </body>
</html>
