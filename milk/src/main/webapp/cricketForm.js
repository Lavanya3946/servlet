document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById("tournamentForm");
    const submitBtn = document.getElementById("submitBtn");

    form.addEventListener("input", validateForm);
    form.addEventListener("reset", resetForm);

    function validateForm() {
        let isValid = true;

        // Validate Tournament Name (min 3, max 30 characters)
        const tournamentName = document.getElementById("tournamentName");
        const tournamentNameError = document.getElementById("tournamentNameError");
        if (tournamentName.value.length < 3 || tournamentName.value.length > 30) {
            isValid = false;
            tournamentNameError.textContent = "Tournament name must be between 3 and 30 characters.";
        } else {
            tournamentNameError.textContent = "";
        }

        // Validate Organizer Name (min 3, max 30 characters)
        const organizerName = document.getElementById("organizerName");
        const organizerNameError = document.getElementById("organizerNameError");
        if (organizerName.value.length < 3 || organizerName.value.length > 30) {
            isValid = false;
            organizerNameError.textContent = "Organizer name must be between 3 and 30 characters.";
        } else {
            organizerNameError.textContent = "";
        }

        // Validate Location (must be selected)
        const location = document.getElementById("location");
        const locationError = document.getElementById("locationError");
        if (location.value === "") {
            isValid = false;
            locationError.textContent = "Please enter a location.";
        } else {
            locationError.textContent = "";
        }

        // Validate Start Date (must be selected)
        const startDate = document.getElementById("startDate");
        const startDateError = document.getElementById("startDateError");
        if (startDate.value === "") {
            isValid = false;
            startDateError.textContent = "Please select a start date.";
        } else {
            startDateError.textContent = "";
        }

        // Validate End Date (must be selected)
        const endDate = document.getElementById("endDate");
        const endDateError = document.getElementById("endDateError");
        if (endDate.value === "") {
            isValid = false;
            endDateError.textContent = "Please select an end date.";
        } else {
            endDateError.textContent = "";
        }

        // Validate Total Teams (must be a positive number)
        const totalTeams = document.getElementById("totalTeams");
        const totalTeamsError = document.getElementById("totalTeamsError");
        if (totalTeams.value <= 0) {
            isValid = false;
            totalTeamsError.textContent = "Total teams must be a positive number.";
        } else {
            totalTeamsError.textContent = "";
        }

        // Validate Contact Number (must be a positive number)
        const contactNumber = document.getElementById("contactNumber");
        const contactNumberError = document.getElementById("contactNumberError");
        if (!/^\d+$/.test(contactNumber.value) || contactNumber.value <= 0) {
            isValid = false;
            contactNumberError.textContent = "Please enter a valid contact number.";
        } else {
            contactNumberError.textContent = "";
        }

        // Validate Email (must be a valid email)
        const email = document.getElementById("email");
        const emailError = document.getElementById("emailError");
        if (!email.validity.valid) {
            isValid = false;
            emailError.textContent = "Please enter a valid email address.";
        } else {
            emailError.textContent = "";
        }

        // Enable or disable the submit button
        submitBtn.disabled = !isValid;
    }

    function resetForm() {
        // Clear validation state when the form is reset
        submitBtn.disabled = true;
        const errors = document.querySelectorAll(".error");
        errors.forEach(error => {
            error.textContent = "";
        });
    }
});
