<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
            crossorigin="anonymous"
    />
    <title>Resena</title>
</head>
<body>
<div id="reseña" class="m-2 container">
    <h5 class="m-2">Sanson Ezequiel</h5>
    <div class="m-2 d-flex">
        <p class="me-3"><strong>· Cerveceria:</strong> Antares</p>
        <p><strong>· Cerveza Consumida:</strong> Honey</p>
    </div>
    <div class="m-2 d-flex">
        <p class="me-2"><strong>· Puntuacion:</strong> 5</p>
        <img
                width="30px"
                height="25px"
                src="https://w7.pngwing.com/pngs/427/480/png-transparent-gold-star-star-star-angle-orange-symmetry-thumbnail.png"
        />
    </div>
    <div class="m-2">
        <p><strong>· Reseña:</strong> Estuvo genial!</p>
    </div>
    <img
            src="https://www.brewermap.com.ar/assets/img/items/156/club.png"
            id="logo"
    />
</div>
</body>
</html>

<style>
    @import url("https://fonts.googleapis.com/css2?family=Poppins&display=swap");
    * {
        font-family: "Poppins", sans-serif;
    }
    #reseña {
        border: 1px solid black;
        box-shadow: 2px 2px 10px black;
        width: 50%;
        height: 230px !important;
    }

    #reseña h5 {
        border-bottom: 1px solid rgb(197, 195, 195);
    }

    #logo {
        width: 150px;
        position: relative;
        top: -120px;
        left: 70%;
    }
</style>
