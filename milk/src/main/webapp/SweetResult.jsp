<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Sweet order</title>
    <style>
     body {
     font-family: Arial;
      }
       h2 {
        text-align: center;
        color:black;
        }
         table {
              margin: 0 auto;
              border-collapse: collapse;
              width: 80%;
            }
            th, td {
             border: 1px solid #ddd;
              padding: 8px;
               text-align: center;
                }
              th {
                 background-color: pink;
               color: black;
               }
               tr:nth-child(even)
                {
                background-color: orange;
                }
                 tr:hover {
                 background-color:blue;
                  }
                 </style>
</head>
<body>
<h2 style="text-align:center;">Sweet List</h2>
<table>
<tr>
  <th>ID</th>
  <th>Shop Name</th>
  <th>Sweet Name</th>
  <th>isSpecial</th>
  <th>Quantity</th>
  <th>Price</th>
</tr>
<c:forEach var="sweet" items="${list}">
<tr>
  <td>${sweet.id}</td>
  <td>${sweet.shopName}</td>
  <td>${sweet.sweetName}</td>
  <td><c:choose>
  <c:when test="${sweet.special}">YES</c:when>
  <c:otherwise>NO</c:otherwise>
  </c:choose>
  </td>
  <td>${sweet.quantity}</td>
  <td>${sweet.totalPrice}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
