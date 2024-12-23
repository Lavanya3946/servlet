<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cricket Tournament</title>
</head>
<body>
    <h1>Cricket Tournament Form Details</h1>
    <h2>
        Tournament Name: ${tournamentOrder.tournamentName} <br>
        Organizer Name: ${tournamentOrder.organizerName} <br>
        Location: ${tournamentOrder.location} <br>
        Start Date: ${tournamentOrder.startDate} <br>
        End Date: ${tournamentOrder.endDate} <br>
        Total Teams: ${tournamentOrder.totalTeams} <br>
        Contact Number: ${tournamentOrder.contactNumber} <br>
        Email: ${tournamentOrder.email}
    </h2>
    <h3>Booked Successfully....!</h3>
</body>
</html>
