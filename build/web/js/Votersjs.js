function validationM()
{
	var nic=document.getElementById('nic').value;
	var fname=document.getElementById('fname').value;
	var address=document.getElementById('vaddress').value;
	var email=document.getElementById('hospitalemail').value;
	var district=document.getElementById('dist').value;
        var username=document.getElementById('hospitaluname').value;
        var password=document.getElementById('hospitalpwd').value;
        var cpassword=document.getElementById('hospitalcpwd').value;
	var tele=document.getElementById('teleno').value;

	if(nic=="")
	{

		document.getElementById('hid1').innerHTML="please enter NIC";
		return false;
	}

	else if(fname=="")
	{
		document.getElementById('hname1').innerHTML="please enter name";
		return false;
	}

	else if(address=="")
	{
		document.getElementById('haddress1').innerHTML="please enter address";
		return false;
	}

	else if(email=="")
	{
		document.getElementById('hemail1').innerHTML="please enter email";
		return false;
	}

	else if(district=="")
	{
		document.getElementById('hroom').innerHTML="please enter no of rooms";
		return false;
	}

	else if(username=="")
	{
		document.getElementById('huname').innerHTML="please enter username";
		return false;
	}
        
        
	else if(password=="")
	{
		document.getElementById('hpwd').innerHTML="please enter password";
		return false;
	}
        
	else if(cpassword=="")
	{
		document.getElementById('hcpwd').innerHTML="please confirm your password";
		return false;
	}
        
	else if(tele=="")
	{
		document.getElementById('hno').innerHTML="please enter telephone number";
		return false;
	}
        
        
        else if(password != cpassword)
	{
		document.getElementById('hcpwd').innerHTML="password does not match!";
		return false;
	}
        
        else if(password.length<6)
            
    {
        
        document.getElementById('hpwd').innerHTML="Password must be at least 6 characters long!";
		return false;
        
    }
        
     else if(isNaN(tele))
     {
         
          document.getElementById('hno').innerHTML=" numbers only!";
		return false;
     }
      
     
     
    else{
          alert("Data successfully added");
          
      }  
        
        
        
	
}

