<html>

<head>
    <link rel="stylesheet" href="css/style.css" />
    


<title>First Web Application</title>
</head>

<body>
    Here are the list of your todos:${demos}
    <div align="center">
        <h1>ELECTICAL AND ELECTRONCS ENGINEERING</h1>

         <table border="2" width="800">
                <tr>
                    <th>id</th>
                    <th>username</th>
                    <th>password</th>
                    <th>address</th>
                    <th>city</th>
                    <th>email</th>
        
                </tr>
            
                <c:forEach  items="${demos}" var="demo">
                        <tr>
                            <td>${demo.id}</td>
                            <td>${demo.username}</td>
                            <td>${demo.password}</td>
                            <td>${demo.address}</td>
                            <td>${demo.city}</td>
                            <td>${demo.email}</td> 
        
                        </tr>
            </c:forEach> 
    
         </table>
    </div> 
</body>

</html>