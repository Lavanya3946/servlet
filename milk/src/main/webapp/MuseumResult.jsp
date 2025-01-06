<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
    <title>Ordered Details</title>
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
    <h3 style="text-align:center;"></h3>
    <table>
    <tr>
     <th>ID</th>
     <th>CustomerName</th>
     <th>TotalAdultMembers</th>
     <th>TotalChildMembers</th>
     <th>MobileNo</th>
     <th>Email</th>
      </tr>
    <c:forEach var="museum" items="${museumRecords}">
    <tr>
    <td>${museum.id}</td>
    <td>${museum.customerName}</td>
    <td>${museum.totalAdultMembers}</td>
    <td>${museum.totalChildMembers}</td>
    <td>${museum.mobileNo}</td>
    <td>${museum.email}</td>
    </tr>
    </c:forEach>
    </table>

</body>
</html>
