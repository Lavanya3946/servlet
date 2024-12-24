<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Milk Form</title>
    <a href="index.jsp">click here for Index Page</a>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        .error {
            color: red;
            font-size: 0.9em;
        }
    </style>
    <script>
        function validateForm() {
            const brand = document.getElementById("brand").value.trim();
            const type = document.getElementById("type").value;
            const quantity = document.getElementById("quantity").value;
            let isValid = true;

            // Clear previous error messages
            document.getElementById("errormess").innerText = "";
            document.getElementById("errortype").innerText = "";
            document.getElementById("errornum").innerText = "";

            // Validate brand
            if (brand.length < 3) {
                document.getElementById("errormess").innerText = "Brand name must be at least 3 letters.";
                isValid = false;
            }

            // Validate type
            if (type === "") {
                document.getElementById("errortype").innerText = "Please select a type of milk needed.";
                isValid = false;
            }

            // Validate quantity
            if (quantity <= 0) {
                document.getElementById("errornum").innerText = "Quantity can't be 0 or less.";
                isValid = false;
            }

            return isValid;
        }
    </script>
</head>
<body>
    <div class="container">
        <h1 class="mt-5">Milk Order Form</h1>
        <form action="MilkService" method="post" class="mt-4" id="milkForm" onsubmit="return validateForm()">
            <div class="form-group">
                <label for="brand">Brand:</label>
                <select name="brand" id="brand" class="form-control">
                    <option value="">Select Brand</option>
                    <option value="Nandini">Nandini</option>
                </select>
                <span id="errormess" class="error"></span>
            </div>
            <div class="form-group">
                <label for="type">Type:</label>
                <select name="type" id="type" class="form-control">
                    <option value="">Select Type</option>
                    <option value="special">Special(56)</option>
                    <option value="ordinary">Ordinary(54)</option>
                    <option value="goodlife">GoodLife(67)</option>
                    <option value="goodlife_lite">GoodLife_Lite(68)</option>
                    <option value="family">Family(56)</option>
                    <option value="buffallo">Buffalo(70)</option>
                </select>
                <span id="errortype" class="error"></span>
            </div>
            <div class="form-group">
                <label for="quantity">Quantity:</label>
                <input type="number" name="quantity" id="quantity" class="form-control" min="1" required>
                <span id="errornum" class="error"></span>
            </div>
            <button type="submit" class="btn btn-primary" id="submitBtn">Cost of Milk</button>
            <button type="reset" class="btn btn-secondary">Clear</button>
            <h2>${message}${order}</h2>
        </form>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
