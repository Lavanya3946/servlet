document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById("ticketForm");
    const submitBtn = document.getElementById("submitBtn");

    form.addEventListener("input", validateForm);
    form.addEventListener("reset", resetForm);

    function validateForm() {
        let isValid = true;


        const customerName = document.getElementById("customerName");
        const customerNameError = document.getElementById("customerNameError");
        if (customerName.value.length < 3 || customerName.value.length > 30) {
            isValid = false;
            customerNameError.textContent = "Customer name must be between 3 and 30 characters.";
        } else {
            customerNameError.textContent = "";
        }


        const totalAdultMembers = document.getElementById("totalAdultMembers");
        const totalAdultMembersError = document.getElementById("totalAdultMembersError");
        if (totalAdultMembers.value < 0) {
            isValid = false;
            totalAdultMembersError.textContent = "Total adult members must be a positive number.";
        } else {
            totalAdultMembersError.textContent = "";
        }


        const totalChildMembers = document.getElementById("totalChildMembers");
        const totalChildMembersError = document.getElementById("totalChildMembersError");
        if (totalChildMembers.value < 0) {
            isValid = false;
            totalChildMembersError.textContent = "Total child members must be a positive number.";
        } else {
            totalChildMembersError.textContent = "";
        }


        const mobileNo = document.getElementById("mobileNo");
        const mobileNoError = document.getElementById("mobileNoError");
        if (!/^\d+$/.test(mobileNo.value) || mobileNo.value <= 0) {
            isValid = false;
            mobileNoError.textContent = "Please enter a valid mobile number.";
        } else {
            mobileNoError.textContent = "";
        }

        const email = document.getElementById("email");
        const emailError = document.getElementById("emailError");
        if (!email.validity.valid) {
            isValid = false;
            emailError.textContent = "Please enter a valid email address.";
        } else {
            emailError.textContent = "";
        }


        submitBtn.disabled = !isValid;
    }

    function resetForm() {

        submitBtn.disabled = true;
        const errors = document.querySelectorAll(".error");
        errors.forEach(error => {
            error.textContent = "";
        });
    }
});
