<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Cricket Tournament Form</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.5.2/lumen/bootstrap.min.css">
    <style>
        body {
            background-color: white;
        }
        .form-container {
            background-color: red;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 10px;
        }
        .error {
            color: red;
            font-size: 0.9em;
        }
    </style>
    <script>
        function validateForm() {
            const tournamentName = document.getElementById("tournamentName").value.trim();
            const organizerName = document.getElementById("organizerName").value.trim();
            const location = document.getElementById("location").value.trim();
            const startDate = document.getElementById("startDate").value;
            const endDate = document.getElementById("endDate").value;
            const totalTeams = document.getElementById("totalTeams").value;
            const contactNumber = document.getElementById("contactNumber").value.trim();
            const email = document.getElementById("email").value.trim();
            let isValid = true;

            // Clear previous error messages
            document.getElementById("tournamentNameError").innerText = "";
            document.getElementById("organizerNameError").innerText = "";
            document.getElementById("locationError").innerText = "";
            document.getElementById("startDateError").innerText = "";
            document.getElementById("endDateError").innerText = "";
            document.getElementById("totalTeamsError").innerText = "";
            document.getElementById("contactNumberError").innerText = "";
            document.getElementById("emailError").innerText = "";

            // Validate tournament name
            if (tournamentName.length <= 2 || tournamentName.length > 30) {
                document.getElementById("tournamentNameError").innerText = "Tournament name must be between 3 and 30 characters.";
                isValid = false;
            }

            // Validate organizer name
            if (organizerName.length < 3 || organizerName.length > 30) {
                document.getElementById("organizerNameError").innerText = "Organizer name must be between 3 and 30 characters.";
                isValid = false;
            }

            // Validate location
            if (location.length < 3 || location.length > 30) {
                document.getElementById("locationError").innerText = "Location must be between 3 and 30 characters.";
                isValid = false;
            }

            // Validate start date
            if (startDate === "") {
                document.getElementById("startDateError").innerText = "Please select a start date.";
                isValid = false;
            }

            // Validate end date
            if (endDate === "") {
                document.getElementById("endDateError").innerText = "Please select an end date.";
                isValid = false;
            }

            // Validate total teams
            if (totalTeams <= 0) {
                document.getElementById("totalTeamsError").innerText = "Total teams must be a positive number.";
                isValid = false;
            }

            // Validate contact number
            if (contactNumber.test(contactNumber)) {
                document.getElementById("contactNumberError").innerText = "Please enter a valid 10-digit contact number.";
                isValid = false;
            }

            // Validate email
            let emailPattern = email.indexOf("@gmail.com");;
            if (!emailPattern.test(email)) {
                document.getElementById("emailError").innerText = "Please enter a valid email address.";
                isValid = false;
            }

            return isValid;
        }

        document.addEventListener("DOMContentLoaded", function() {
            const form = document.getElementById("tournamentForm");
            const submitBtn = document.getElementById("submitBtn");

            form.addEventListener("input", function() {
                const isValid = validateForm();
                submitBtn.disabled = !isValid;
            });

            form.addEventListener("reset", function() {
                // Clear validation state when the form is reset
                submitBtn.disabled = true;
                document.getElementById("tournamentNameError").innerText = "";
                document.getElementById("organizerNameError").innerText = "";
                document.getElementById("locationError").innerText = "";
                document.getElementById("startDateError").innerText = "";
                document.getElementById("endDateError").innerText = "";
                document.getElementById("totalTeamsError").innerText = "";
                document.getElementById("contactNumberError").innerText = "";
                document.getElementById("emailError").innerText = "";
            });
        });
    </script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
 <a class="navbar-brand" href="index.jsp">Cricket Tournament</a>
 <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
 <span class="navbar-toggler-icon">
 </span>
 </button>
 <div class="collapse navbar-collapse" id="navbarNav">
 <ul class="navbar-nav">
 <li class="nav-item active">
  <a class="nav-link" href="index.jsp">Index page <span class="sr-only">(current)</span></a>
   </li>
   </ul>
   </nav>

    <div class="container mt-5">
        <div class="row">
            <div class="col-md-6 form-container">
                <h2 class="mb-4">Cricket Tournament Form</h2>
                <form action="TournamentService" method="post" id="tournamentForm" onsubmit="return validateForm()">
                    <div class="form-group">
                        <label for="tournamentName">Tournament Name:</label>
                        <input type="text" id="tournamentName" name="tournamentName" class="form-control" required>
                        <span id="tournamentNameError" class="error"></span>
                    </div>
                    <div class="form-group">
                        <label for="organizerName">Organizer Name:</label>
                        <input type="text" id="organizerName" name="organizerName" class="form-control" required>
                        <span id="organizerNameError" class="error"></span>
                    </div>
                    <div class="form-group">
                        <label for="location">Location:</label>
                        <input type="text" id="location" name="location" class="form-control" required>
                        <span id="locationError" class="error"></span>
                    </div>
                    <div class="form-group">
                        <label for="startDate">Start Date:</label>
                        <input type="date" id="startDate" name="startDate" class="form-control" required>
                        <span id="startDateError" class="error"></span>
                    </div>
                    <div class="form-group">
                        <label for="endDate">End Date:</label>
                        <input type="date" id="endDate" name="endDate" class="form-control" required>
                        <span id="endDateError" class="error"></span>
                    </div>
                    <div class="form-group">
                        <label for="totalTeams">Total Teams:</label>
                        <input type="number" id="totalTeams" name="totalTeams" class="form-control" min="1" required>
                        <span id="totalTeamsError" class="error"></span>
                    </div>
                    <div class="form-group">
                        <label for="contactNumber">Contact Number:</label>
                        <input type="text" id="contactNumber" name="contactNumber" class="form-control" required>
                        <span id="contactNumberError" class="error"></span>
                    </div>
                    <div class="form-group">
                        <label for="email">Email:</label>
                        <input type="email" id="email" name="email" class="form-control" required>
                        <span id="emailError" class="error"></span>
                    </div>
                    <button type="submit" class="btn btn-primary" id="submitBtn" >Submit</button>
                    <button type="reset" class="btn btn-secondary">Clear</button>
                </form>
            </div>
            <div class="col-md-6">
                <h2 class="text-center mt-4">Tournament Details</h2>
                <div class="alert alert-info">

                    <h2>${message}</h2>
                </div>
                    <button type="submit" class="btn btn-secondary">  <a href="TournamentService">View All</a>
</button>

            </div>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
