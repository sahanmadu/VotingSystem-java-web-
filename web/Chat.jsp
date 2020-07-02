<%-- 
    Document   : Chat
    Created on : May 5, 2020, 2:00:26 PM
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
            body{
                background-image: url("Images/man1.jpg");
                background-size: cover;            }
        </style>
    </head>
    <body>
      <div class="container">
	<br><br>
        <h1 class="text-center  font-weight-bold">For More Information And Help</h1><br><br>
	<div class="col-lg-8-m-auto d-block">

		<form class="bg-info text-white" action="userLogin" name="userLogin" method="POST">
			<div class="form-group">
				<label class="text-white font-weight-bold">USERNAME</label>
                                <input type="text" name="user"  class="form-control" autocomplete="off" required>
			
				
			</div>
			
			  <input type="submit"   value="GO" class="btn btn-success" name="log in" >
                           <input type="reset" name="reset"  value="Cancel" class="btn btn-success">
		</form>
		
	</div>
</div>
    </body>
</html>
