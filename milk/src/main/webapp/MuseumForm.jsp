<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Museum Ticket Form</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.5.2/lumen/bootstrap.min.css">
    <style>
        body {
            background-color: white;
        }
        .form-container {
            background-color: gray;
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
            <div class="col-8 form-container">
                <h2 class="museum">Museum Ticket Form</h2>
                <form action="TicketService" method="post" id="ticketForm">
                    <div class="form-group">
                        <label for="customerName">Customer Name:</label>
                        <input type="text" id="customerName" name="customerName" class="form-control" required>
                        <span id="customerNameError" class="error"></span>
                    </div>
                    <div class="form-group">
                        <label for="totalAdultMembers">Total Adult Members:</label>
                        <input type="number" id="totalAdultMembers" name="totalAdultMembers" class="form-control" min="0" required>
                        <span id="totalAdultMembersError" class="error"></span>
                    </div>
                    <div class="form-group">
                        <label for="totalChildMembers">Total Child Members:</label>
                        <input type="number" id="totalChildMembers" name="totalChildMembers" class="form-control" min="0" required>
                        <span id="totalChildMembersError" class="error"></span>
                    </div>
                    <div class="form-group">
                        <label for="mobileNo">Mobile No:</label>
                        <input type="text" id="mobileNo" name="mobileNo" class="form-control" required>
                        <span id="mobileNoError" class="error"></span>
                    </div>
                    <div class="form-group">
                        <label for="email">Email:</label>
                        <input type="text" id="email" name="email" class="form-control" required>
                        <span id="emailError" class="error"></span>
                    </div>
                    <button type="submit" class="btn btn-primary" id="submitBtn" >Submit</button>
                    <button type="reset" class="btn btn-secondary">Clear</button>
                </form>
            </div>
            <div class="col-4">
                <h1>${message}</h1>
                <h2 class="text-center"><u>Submission Status:</u></h2>
                <div class="info">
                    <h1>${order}</h1>
                </div>
            </div>
        </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
