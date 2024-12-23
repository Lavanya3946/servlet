<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Sweet Order Form</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.5.2/lumen/bootstrap.min.css">
    <style>
    body{
    background-color:violate;
    .error {
    color: red; font-size: 0.9em;
     }
    </style>
</head>
<body>
    <div class="container ">
      <div style='text-align:center'><h1>Sweet Order Form..</h1></div><br><br>
        <form action="Sweet" method="post" class="mt-4"id="sweetForm">
            <div class="form-floating ">
                <select id="shopName" name="shopName" class="form-control">
                    <option value="">Shop Name</option>
                    <option value="Mothi Sweet">Moothi Sweets</option>
                    <option value="Kanthi Sweets">Kanti Sweets</option>
                    <option value="SLV Sweets">SLV Sweets</option>
                    <option value="SJ Sweets">SJ Sweets</option>
                </select>
                <span id="shopNameError" class="error"></span>
            </div>
            <br><br>
            <div class="form-floating ">
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
              <label class="form-check-label" for="isSpecial"> <h4>Special</h4></label>
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
            <button type="submit" class="btn btn-primary"id="submitBtn"disabled>Calculate Total Cost</button>
            <button type="reset" class="btn btn-primary">Clear</button>

            <h2 class="text-center"<span style='color:blue;'>${message}</h2>
        </form>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="sweetForm.js"></script>
</body>
</html>
