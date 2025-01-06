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
     <th>tournamentName/th>
     <th>organizerName</th>
     <th>location</th>
     <th>startDate</th>
     <th>endDate</th>
     <th>totalTeams</th>
     <th>ContactNumber</th>
     <th>email</th>
      </tr>
    <c:forEach var="cricket" items="${cricketRecords}">
    <tr>
    <td>${cricket.id}</td>
    <td>${cricket.tournamentName}</td>
    <td>${cricket.organizerName}</td>
    <td>${cricket.location}</td>
    <td>${cricket.startDate}</td>
    <td>${cricket.endDate}</td>
    <td>${cricket.totalTeams}</td>
    <td>${cricket.contactNumber}</td>
    <td>${cricket.email}</td>

    </tr>
    </c:forEach>
    </table>

</body>
</html>
