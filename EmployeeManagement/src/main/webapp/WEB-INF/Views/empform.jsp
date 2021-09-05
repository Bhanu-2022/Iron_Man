<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Employee</h1>  
       <form action="./empform" method="post">  
        <table >    
  					<tr>
					<td>Employee ID</td>
					<td><input type="number" name="id"></td>
					</tr>   
					<tr>
					<td>Employee name</td>
					<td><input type="text" name="name"></td>
					</tr>  
					<tr>
					<td>Employee salary</td>
					<td><input type="number" name="salary"></td>
					</tr>  
					<tr>
					<td>Employee designation</td>
					<td><input type="number" name="designation"></td>
					</tr>  
         
          <input type="submit" value="Edit Save" /></td>     
        </table>    
       </form>

</body>
</html>