document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById("milkForm");
    const submitBtn = document.getElementById("submitBtn");

    form.addEventListener("input", validateForm);

    function validateForm() {
        let isValid = true;


        const brand = document.getElementById("brand");
        if (brand.value === "") {
            isValid = false;
        }


        const type = document.getElementById("type");
        if (type.value === "") {
            isValid = false;
        }


        const quantity = document.getElementById("quantity");
        if (quantity.value <= 0) {
            isValid = false;
        }

        submitBtn.disabled = !isValid;
}
});