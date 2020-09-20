<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" errorPage="" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<title>Log in</title>
<style type="text/css">
.right {	text-align: right;
}
</style>
<link href="css/styles.css" rel="stylesheet" type="text/css" />
</head>

<body>

<center> 
<form action="/WEB-INF/jsp/loginconf.jsp" method="post">
<div class="container text-center">
                <h2 class="mb-4">User Login</h2>
 </div>
<table>
    <tr>
    <td> Username: </td>
    <td> <input type="text" name="id"> </td>
    </Tr>
    <tr>
    <td> Password: </td>
    <td> <input type="password" name="password"> </td>
    </Tr>

</Table>
<p></p>

<tr>
    <a class="btn-min border-radius: 1px;"> <input type="submit" value="Log In"> </a>
    <a class="btn-min border-radius: 1px;"> <input type="reset" value="Clear"> </a>
    </Tr>

</Form>
</Center>
</body>
</html>