<%@ page isELIgnored="false" %>
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
            background-color:red;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 10px ;
        }
        .error {
            color: red;
            font-size: 0.9em;
        }
    </style>
</head>
<body>
    <div class="container mt-5">
        <div class="row">
            <div class="col-md-6 form-container">
                <h2 class="mb-4">Cricket Tournament Form</h2>
                <form action="TournamentService" method="post" id="tournamentForm">
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
                    <button type="submit" class="btn btn-primary" id="submitBtn" disabled>Submit</button>
                    <button type="reset" class="btn btn-secondary">Clear</button>
                </form>
            </div>
            <div class="col-md-6">
                <h2 class="text-center mt-4">Tournament Details</h2>
                <div class="alert alert-info">
                    <h2>${message}</h2>
                </div>
            </div>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="cricketForm.js"></script>
</body>
</html>
