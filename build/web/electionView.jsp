<%-- 
    Document   : electionView
    Created on : May 16, 2020, 8:04:05 PM
    Author     : Eranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Election view Page</title>
        <link rel="stylesheet" href="CSS/electionView.css">
        
        <link rel="stylesheet" href="CSS/header.css">
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script> 
    </head>
    <style>
    body{
  margin: 0;
  padding: 0;
  background: #f1f1f1;
  background-image:url("Images/oldElectionBack.jpg");
}

</style>
    <body>
        
         <div class="wrapper">
		<div class="nav">
			<div class="logo">
                            <a href="Images/home.jsp"><img src="Images/logo1.png"></a>
			</div>
			<div class="menu">
				<ul>
					<li><a href="home.jsp">Home</a></li>
					
					
				</ul>
			</div>
		</div>
        
        
        
            
        
        
    <center> <h2> Previous Presidential Election Results </h2></center>
       
     <br> <br> <br>
             <br> <br> <br>
             <br> <br> <br>
              <br> <br> <br>
             <br> <br> <br>
       
        <div class="pt">
  <div class="box">
 <h2 class="header" style="
    background: green;
">
2015</h2>
<ul>
    <li class="cash"><span> <img src="Images/P15.jpg" width="80px" height="80px" ></span> President Maithripala Sirisena</li>
    <li> <b>Candiadate  Votes</b></li>
<li>Maithripala Sirisena - 6,217,162</li>
<li>Mahinda Rajapaksa - 5,768,090</li>
<li>Ratnayake Sirisena - 18,174</li>
<li><a href="#">See More</a></li>
</ul>
</div>
<div class="box">
  <h2 class="header" style="
    background: #2196F3;
">
2010</h2>
<ul>
<li class="cash"><span>  <img src="Images/P10.jpeg" width="80px" height="80px" > </span> President Mahinda Rajapaksa </li>
<li> <b>Candiadate  Votes</b> </li>
<li>Mahinda Rajapaksa - 6,015,934 </li>
<li>Sarath Fonseka - 4,173,185 </li>
<li>Mohomad Cassim Mohomad - 39,226 </li>
<li><a href="#">See More</a></li>
</ul>
</div>
<div class="box">
  <h2 class="header" style="
    background: #2196F3;
">
2005</h2>
<ul>
<li class="cash"><span>  <img src="Images/P10.jpeg" width="80px" height="80px" > </span>  President Mahinda Rajapaksa  </li>
<li> <b>Candiadate  Votes</b> </li>
<li> Mahinda Rajapaksa - 4,887,152 </li>
<li> Ranil Wickremesinghe - 4,706,366 </li>
<li> Siritunga Jayasuriya - 35,425 </li>
<li><a href="#">See More</a></li>
</ul>
    
</div>
           
</div>
         <button class="btn btn-secondary"> <a href="parliamentView.jsp">Next </a> </button>     
        
    </body>
</html>



