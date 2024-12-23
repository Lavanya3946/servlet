<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Milk Form</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h1 class="mt-5">Milk Order Form</h1>
        <form action="MilkService" method="post" class="mt-4"id="milkForm">
            <div class="form-group"><span id="brand"></span><br>
                <label for="brand">Brand:</label>
                <select name="brand" id="brand" class="form-control">
                    <option value="Milk Brand"></option>
                    <option value="Nandini">Nandini</option>
                </select>
            </div>
            <div class="form-group">
                <label for="type">Type:</label>
                <select name="type" id="type" class="form-control">
                    <option value="Type"></option>
                    <option value="special">Special(56)</option>
                    <option value="ordinary">Ordinary(54)</option>
                    <option value="goodlife">GoodLife(67)</option>
                    <option value="goodlife_lite">GoodLife_Lite(68)</option>
                    <option value="family">Family(56)</option>
                    <option value="buffallo">Buffalo(70)</option>
                </select>
            </div>
            <div class="form-group">
                <label for="quantity">Quantity:</label>
                <input type="number" name="quantity" id="quantity" class="form-control" min="1" required>
            </div>
            <button type="submit" class="btn btn-primary"id="submitBtn" disabled>Cost of Milk</button>
            <button type="reset" class="btn btn-primary">clear</button>
             <h2>${message}${order} </h2>
        </form>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="milkForm.js"></script>
</body>
</html>
