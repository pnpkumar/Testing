<html>

<head>
    <link rel="stylesheet" href="css/style.css" />

<title> Web Application</title>
<script>  
    function validateform(){  
    var name=document.myform.name.value;  
    var password=document.myform.password.value;  
      
    if (name.length<5){  
      alert("Name can't be blank");  
      return false;  
    }else if(password.length<6){  
      alert("Password must be at least 6 characters long.");  
      return false;  
      }  
  
    }  
    </script>
</head>

<body>
    <div align="center">
<h1>DMS.SVH COLLEGE LOGIN FORM</h1>
<h3>ELECTICAL  AND  ELECTRONICS ENGINEERING</h3>
    
<form name="myform" method="post" action="https://svhce.in/" onsubmit="return validateform()" > 
        UserName : <input type="text" name="name" /></br></br>
        Password : <input type="password" name="password" /></br></br> 
        Email    : <input type="text" name="email" /></br></br>
        Phone no : <input type="phone no" name="phone no" /></br></br> 
        <input type="submit" />
    </form>
</body>
</div>
</html>