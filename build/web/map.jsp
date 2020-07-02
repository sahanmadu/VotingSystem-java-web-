<%-- 
    Document   : map
    Created on : May 5, 2020, 11:22:11 AM
    Author     : Sahan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <style>
     
      #map {
        height: 600px;  
        width: 700px;
        margin-left: 370px;
       }
       img{
           width:200px;
           height: 100px;
       }
       h1{
          color: blacks;
          margin-left: 480px;
       }
       body{
           background-image: url("Images/maps.jpg");
           background-size: cover;
           background-repeat: no-repeat;
       }
       
       ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  border: 1px solid #e7e7e7;
  background-color: #f3f3f3;
  opacity: .8;
}

li {
  float: left;
}

li a {
  display: block;
  color: #666;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover:not(.active) {
  background-color: #ddd;
}

li a.active {
  color: white;
  background-color: #4CAF50;
}
       
       
       
       
    </style>
    </head>
    <body>
        <ul>
  
  <li><a href="#news">Home</a></li>
  <li><a href="#contact">Contact</a></li>
  <li><a href="Showall">Result</a></li>
  <li><a href="Aboutus.jsp">About Us</a></li>
   <li><a class="active"  href="#">Location</a></li>
  <li><a href="Service.jsp">Service</a></li>
</ul>
        <h1>Election Commission of Sri Lanka</h1><br>
         <div id="map"></div>
    <script>

function initMap() {
  
  var options = {
      zoom:9,
      center:{lat:6.9271,lng:79.8612}
      
  }

  var map = new google.maps.Map(
      document.getElementById('map'), options);

  var marker = new google.maps.Marker({
      position:{lat:6.9271,lng:79.8612},
      map:map
        });
        
infowindow = new google.maps.InfoWindow({
    content:"<img src='Images/smt_1.jpg'><br/><b>Election Commission,</b><br/>Sarana Rd,<br/>Sri Jayawardenepura Kotte 10107,</br>Sri Lanka" });
    google.maps.event.addListener(marker, "click", function(){infowindow.open(map,marker);});infowindow.open(map,marker);
}
    </script>

   
    <script async defer
    src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBKglFvtw9R39jMMckshWL25O7oRc9S7-0&callback=initMap">
    </script>
    </body>
</html>
