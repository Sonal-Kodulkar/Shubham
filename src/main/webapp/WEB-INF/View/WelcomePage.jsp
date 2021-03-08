<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>WelcomePage</title>
</head>
<body>
<div align="center">
    <h1 style="color: crimson">Welcome ${employeeEntity1.firstName} </h1>
    <table>
        <tr>
            <td>Full Name:</td>
            <td>${employeeEntity1.firstName} ${employeeEntity1.lastName}</td>
        </tr>
        <tr>
            <td>Email Address:</td>
            <td>${employeeEntity1.email} </td>
        </tr>
        <tr>
            <td> Mobile Number:</td>
            <td>${employeeEntity1.mobileNumber}</td>
        </tr>
        <tr>
            <td>Bank Account Number:</td>
            <td>${employeeEntity1.accountNumber}</td>
        </tr>
        <tr>
            <td>Adhar Number:</td>
            <td>${employeeEntity1.adharNumber}</td>
        </tr>
    </table>
   <br> <a href="/demo/employees/update/${employeeEntity1.id}">
        <button type="button" name="update">Update</button>
    </a>
    <br><a href="/demo/employees/delete/${employeeEntity1.id}">
    <button type="button" name="delete">Delete</button>
</a>
</div>
</body>
</html>
