<%-- 
    Document   : admin
    Created on : May 14, 2020, 7:52:02 PM
    Author     : Eranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title> Admin Panel</title>
	<link rel="stylesheet" type="text/css" href="CSS/admin.css">

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>


	<link href="https://fonts.googleapis.com/css?family=Baloo+Chettan+2&display=swap" rel="stylesheet">
        
    </head>

    <body>
        <a href="admin.jsp"></a>
        
        <div id="left">
		<div id="logo">
			<img src="Images/logo1.png">
		</div>

		<br> <br> <br> <br> 
		
		<button type="button" class="btn btn-outline-secondary btn-sm btn-block"><a href="home.jsp">Log Out</a></button> <br> </center>
	
  <br> <br> <br>
    <br> <br> <br>
      <br> <br> <br>
        <br> <br> <br>

	</div>


	<div id="container">
		<div id="header">
                    <h2 style="margin-left: 350px; margin-top: 60px">ADMIN PANEL</h2>
		</div>
		<div id="wrapper">
			<div class="row">
                            
  
                              
  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Edit Voter Details</h5>
        <p class="card-text">
            Only admin can edit this details!!            
        </p>
        <a href="Allposts" class="btn btn-primary">EDIT</a>
      </div>
    </div>
  </div>                          
                            
                            
                            
                            
                            
                            
  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Select Election Type</h5>
        <p class="card-text">
            <input type="radio" id="e1" name="e1" value="Presidential Election" onclick="electionView.jsp">
            Presidential Election
            <br>
            <input type="radio" id="e2" name="e2" value="Parliamentary Election">
            Parliament Election
            
        </p>
        <a href="electionView.jsp" class="btn btn-primary">Info</a>
      </div>
    </div>
  </div>
  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Add/Edit/Delete Election</h5>
        <p class="card-text">
             <input type="radio" id="e1" name="e1" value="Presidential Election" onclick="electionView.jsp">
            Presidential Election
            <br>
            <input type="radio" id="e2" name="e2" value="Parliamentary Election">
            Parliament Election
        </p>
        <a href="addNewElection.jsp" class="btn btn-primary">Add</a>
        <a href="EditElection.jsp" class="btn btn-secondary">Edit</a>
        <a href="deleteElection.jsp" class="btn btn-danger">Delete</a>
      </div>
    </div>
  </div>
  <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Edit Candidate Details</h5>
        <p class="card-text">
            Only admin can edit this details!!            
        </p>
        <a href="index.jsp" class="btn btn-primary">EDIT</a>
      </div>
    </div>
  </div> 
                            
                            
    <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Edit Contact Details</h5>
        <p class="card-text">
            Only admin can edit this details!!            
        </p>
        <a href="contactshow.jsp" class="btn btn-primary">EDIT</a>
      </div>
    </div>
  </div> 
                            
                            
    <div class="col-sm-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Chat with voters</h5>
        <p class="card-text">
            Only admin can use this feature!!            
        </p>
        <a href="Chat.jsp" class="btn btn-primary">CHAT</a>
      </div>
    </div>
  </div> 
 
</div>
		

<br> <br>


                </div>
            
        </div>
    </body>
</html>
