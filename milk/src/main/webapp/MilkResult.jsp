<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <title>Ordered Details</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.5.2/minty/bootstrap.min.css">
    <style>
        body {
            font-family: Arial;
        }
        h2 {
            text-align: center;
            color: black;
        }
        table {
            margin: 0 auto;
            width: 80%;
        }
        th {
            background-color: pink;
            color: black;
        }
        tr:nth-child(even) {
            background-color: orange;
        }
        tr:hover {
            background-color: blue;
        }
    </style>
</head>
<body>
    <h3 class="text-center"></h3>
    <table class="table table-striped table-bordered">
        <thead class="thead-dark">
            <tr>
                <th>ID</th>
                <th>Brand</th>
                <th>Type</th>
                <th>Quantity</th>
                <th>Total</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="milk" items="${milkRecords}">
                <tr>
                    <td>${milk.id}</td>
                    <td>${milk.brand}</td>
                    <td>${milk.type}</td>
                    <td>${milk.quantity}</td>
                    <td>${milk.total}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootswatch/4.5.2/minty/bootstrap.min.js"></script>
</body>
</html>
