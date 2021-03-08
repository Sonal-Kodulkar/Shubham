<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign-Up</title>
</head>
<body>
<h1 style="color: crimson" align="center">Registration form</h1>

<form action="/demo/employees/addUser" ,method="POST">

    <div align="center">
        <table border="1">
            <tr>
                <td>ID:</td>
                <td><input type="text" name="id" value="${empUdate.id}" align="center"></td>
            </tr>
            <tr>
                <td>First Name:</td>
                <td><input type="text" name="firstName" value="${empUdate.firstName}" align="center"></td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td><input type="text" name="lastName" value="${empUdate.lastName}" align="center"></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="text" name="email" value="${empUdate.email}" align="center"></td>
            </tr>
            <tr>

                <td>Create Password:</td>
                <td><input type="password" name="password" value="${empUdate.password}" align="center"></td>
            </tr>
            <tr>

                <td>ReEnter Password:</td>
                <td><input type="password" name="ReEnetrpassword" value="${empUdate.password}" align="center"></td>
            </tr>
            <tr>

                <td>Mobile Number:</td>
                <td><input type="number" name="mobileNumber" value="${empUdate.mobileNumber}" align="center"></td>
            </tr>
            <tr>
                <td>Bank Account Number:</td>
                <td><input type="number" name="accountNumber" value="${empUdate.accountNumber}" align="center"></td>
            </tr>
            <tr>
                <td>Adhar Number:</td>
                <td><input type="number" name="adharNumber" value="${empUdate.adharNumber}" align="center"></td>
            </tr>

        </table>
        <br><input type="Submit"></br>
    </div>

</form>

</body>
</html>
