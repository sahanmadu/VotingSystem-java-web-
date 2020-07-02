  function mynew(){
             
          var option1= document.getElementsByName('candi');
          var option2= document.getElementsByName('partie');
             
          if(option1[0].checked && option2[0].checked ){
              
              alert("Successfully voted!");
          } 
          
        else if(option1[1].checked && option2[1].checked ){
              
              alert("Successfully voted! ");
          } 
           
      else if(option1[2].checked && option2[2].checked ){
              
              alert("Successfully voted! ");
          } 
         else if(option1[0].checked && option2[1].checked ){
              
              alert("Select matching party!! ");
              return false;
          } 
           else if(option1[0].checked && option2[2].checked ){
              
              alert("Select matching party!! ");
              return false;
          } 
            else if(option1[1].checked && option2[0].checked ){
              
              alert("Select matching party!! ");
              return false;
          } 
           else if(option1[1].checked && option2[2].checked ){
              
              alert("Select matching party!! ");
              return false;
          } 
            else if(option1[2].checked && option2[0].checked ){
              
              alert("Select matching party!! ");
              return false;
          } 
           else if(option1[2].checked && option2[1].checked ){
              
              alert("Select matching party!! ");
              return false;
          } 
          else{
              alert("please select items!!");
              return false;
          }
  }




