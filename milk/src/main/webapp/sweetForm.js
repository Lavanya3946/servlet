document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById("sweetForm");
    const submitBtn = document.getElementById("submitBtn");

    form.addEventListener("input", validateForm);
    form.addEventListener("reset", resetForm);

    function validateForm() {
        let isValid = true;

        const shopName = document.getElementById("shopName");
        const shopNameError = document.getElementById("shopNameError");
        if (shopName.value === "") {
            isValid = false;
            shopNameError.textContent = "Please select a shop name.";
        } else {
            shopNameError.textContent = "";
        }


        const sweetName = document.getElementById("sweetName");
        const sweetNameError = document.getElementById("sweetNameError");
        if (sweetName.value === "") {
            isValid = false;
            sweetNameError.textContent = "Please select a sweet name.";
        } else {
            sweetNameError.textContent = "";
        }


        const quantity = document.getElementById("quantity");
        const quantityError = document.getElementById("quantityError");
        if (quantity.value <= 0) {
            isValid = false;
            quantityError.textContent = "Please enter a positive quantity.";
        } else {
            quantityError.textContent = "";
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
