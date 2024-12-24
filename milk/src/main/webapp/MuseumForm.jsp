<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Museum Ticket Form</title>
    <a href="index.jsp">click here for Index Page</a>
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
    <script>
        function validateForm() {
            const customerName = document.getElementById("customerName").value.trim();
            const totalAdultMembers = document.getElementById("totalAdultMembers").value;
            const totalChildMembers = document.getElementById("totalChildMembers").value;
            const mobileNo = document.getElementById("mobileNo").value.trim();
            const email = document.getElementById("email").value.trim();
            let isValid = true;

            // Clear previous error messages
            document.getElementById("customerNameError").innerText = "";
            document.getElementById("totalAdultMembersError").innerText = "";
            document.getElementById("totalChildMembersError").innerText = "";
            document.getElementById("mobileNoError").innerText = "";
            document.getElementById("emailError").innerText = "";

            // Validate customer name
            if (customerName.length < 3 || customerName.length > 30) {
                document.getElementById("customerNameError").innerText = "Customer name must be between 3 and 30 characters.";
                isValid = false;
            }

            // Validate total adult members
            if (totalAdultMembers < 0) {
                document.getElementById("totalAdultMembersError").innerText = "Total adult members must be a positive number.";
                isValid = false;
            }

            // Validate total child members
            if (totalChildMembers < 0) {
                document.getElementById("totalChildMembersError").innerText = "Total child members must be a positive number.";
                isValid = false;
            }

            // Validate mobile number
            if (mobileNo.test(mobileNo)) {
                document.getElementById("mobileNoError").innerText = "Please enter a valid mobile number.";
                isValid = false;
            }

            // Validate email
            let emailPattern = email.indexOf("@");
            if (!emailPattern.test(email)) {
                document.getElementById("emailError").innerText = "Please enter a valid email address.";
                isValid = false;
            }

            return isValid;
        }

        document.addEventListener("DOMContentLoaded", function() {
            const form = document.getElementById("ticketForm");
            const submitBtn = document.getElementById("submitBtn");

            form.addEventListener("input", function() {
                const isValid = validateForm();
                submitBtn.disabled = !isValid;
            });

            form.addEventListener("reset", function() {
                // Clear validation state when the form is reset
                submitBtn.disabled = true;
                document.getElementById("customerNameError").innerText = "";
                document.getElementById("totalAdultMembersError").innerText = "";
                document.getElementById("totalChildMembersError").innerText = "";
                document.getElementById("mobileNoError").innerText = "";
                document.getElementById("emailError").innerText = "";
            });
        });
    </script>
</head>
<body>
    <div class="container mt-5">
        <div class="row">
            <div class="col-8 form-container">
                <h2 class="museum">Museum Ticket Form</h2>
                <form action="TicketService" method="post" id="ticketForm" onsubmit="return validateForm()">
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
