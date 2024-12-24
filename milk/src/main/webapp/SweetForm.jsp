<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sweet Order Form</title>
    <a href="index.jsp">click here for Index Page</a>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.5.2/lumen/bootstrap.min.css">
    <style>
        body {
            background-color: violet;
        }
        .error {
            color: red;
            font-size: 0.9em;
        }
    </style>
    <script>
        function validateForm() {
            const shopName = document.getElementById("shopName").value.trim();
            const sweetName = document.getElementById("sweetName").value.trim();
            const quantity = document.getElementById("quantity").value;
            let isValid = true;

            // Clear previous error messages
            document.getElementById("shopNameError").innerText = "";
            document.getElementById("sweetNameError").innerText = "";
            document.getElementById("quantityError").innerText = "";

            // Validate shop name
            if (shopName === "") {
                document.getElementById("shopNameError").innerText = "Please select a shop name.";
                isValid = false;
            }

            // Validate sweet name
            if (sweetName === "") {
                document.getElementById("sweetNameError").innerText = "Please select a sweet name.";
                isValid = false;
            }

            // Validate quantity
            if (quantity <= 0) {
                document.getElementById("quantityError").innerText = "Quantity can't be 0 or less.";
                isValid = false;
            }

            return isValid;
        }

        document.addEventListener("DOMContentLoaded", function() {
            const form = document.getElementById("sweetForm");
            const submitBtn = document.getElementById("submitBtn");

            form.addEventListener("input", function() {
                const isValid = validateForm();
                submitBtn.disabled = !isValid;
            });

            form.addEventListener("reset", function() {
                // Clear validation state when the form is reset
                submitBtn.disabled = true;
                document.getElementById("shopNameError").innerText = "";
                document.getElementById("sweetNameError").innerText = "";
                document.getElementById("quantityError").innerText = "";
            });
        });
    </script>
</head>
<body>
    <div class="container">
        <div style="text-align:center"><h1>Sweet Order Form</h1></div><br><br>
        <form action="Sweet" method="post" class="mt-4" id="sweetForm" onsubmit="return validateForm()">
            <div class="form-floating">
                <select id="shopName" name="shopName" class="form-control">
                    <option value="">Shop Name</option>
                    <option value="Mothi Sweet">Mothi Sweets</option>
                    <option value="Kanthi Sweets">Kanthi Sweets</option>
                    <option value="SLV Sweets">SLV Sweets</option>
                    <option value="SJ Sweets">SJ Sweets</option>
                </select>
                <span id="shopNameError" class="error"></span>
            </div>
            <br><br>
            <div class="form-floating">
                <select id="sweetName" name="sweetName" class="form-control">
                    <option value="">Sweet Name</option>
                    <option value="Laddu">Laddu(300)</option>
                    <option value="Barfi">Barfi(350)</option>
                    <option value="Jalebi">Jalebi(250)</option>
                    <option value="Jamun">Jamun(190)</option>
                </select>
                <span id="sweetNameError" class="error"></span>
            </div><br><br>
            <div class="form-group form-check">
                <input type="checkbox" id="isSpecial" name="isSpecial" class="form-check-input">
                <label class="form-check-label" for="isSpecial"><h4>Special</h4></label>
            </div><br><br>
            <div class="form-floating">
                <select id="quantity" name="quantity" class="form-control">
                    <option value="">Quantity In KG</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                </select>
                <span id="quantityError" class="error"></span>
            </div><br><br>
            <button type="submit" class="btn btn-primary" id="submitBtn" disabled>Calculate Total Cost</button>
            <button type="reset" class="btn btn-secondary">Clear</button>
            <h2 class="text-center"><span style="color:blue;">${message}</span></h2>
        </form>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
