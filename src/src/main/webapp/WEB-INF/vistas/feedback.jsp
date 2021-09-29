<!DOCTYPE html>
<html>
<head>
    <link
            rel="stylesheet"
            href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
            integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
            crossorigin="anonymous"
    />
</head>
<body>
<div class="container form-feedback">
    <h1 class="text-center m-1">Feedback de su visita</h1>

    <form class="needs-validation" novalidate>
        <div class="form-row">
            <!-- <div class="col-md-6">
              <label class="mr-sm-2" for="validationTooltip01">Fecha</label><br />
              <input type="date" name="date" id="validationTooltip01" required />
              <div class="invalid-feedback">Please choose a username.</div>
            </div> -->
            <div class="col-md-12 mb-3">
                <label class="mr-sm-2" for="validationTooltip02">Cerveceria</label>
                <select
                        class="custom-select mr-sm-2"
                        id="validationTooltip02"
                        required
                >
                    <option selected disabled value="">Elegir...</option>
                    <option value="1">Antares</option>
                    <option value="2">La Birra</option>
                    <option value="3">Cervelar</option>
                </select>
                <div class="invalid-feedback">Indique una cerveceria.</div>
            </div>

            <div id="puntuacion" class="col-md-12 mb-3">
                <p>Puntuacion</p>

                <div class="custom-control custom-radio custom-control-inline">
                    <input
                            type="radio"
                            id="customRadio1"
                            name="customRadio"
                            class="custom-control-input"
                            value="1"
                    />
                    <label class="custom-control-label" for="customRadio1">1</label>
                </div>

                <div class="custom-control custom-radio custom-control-inline">
                    <input
                            type="radio"
                            id="customRadio2"
                            name="customRadio"
                            class="custom-control-input"
                            value="2"
                    />
                    <label class="custom-control-label" for="customRadio2">2</label>
                </div>

                <div class="custom-control custom-radio custom-control-inline">
                    <input
                            type="radio"
                            id="customRadio3"
                            name="customRadio"
                            class="custom-control-input"
                            value="3"
                    />
                    <label class="custom-control-label" for="customRadio3">3</label>
                </div>

                <div class="custom-control custom-radio custom-control-inline">
                    <input
                            type="radio"
                            id="customRadio4"
                            name="customRadio"
                            class="custom-control-input"
                            value="4"
                    />
                    <label class="custom-control-label" for="customRadio4">4</label>
                </div>

                <div class="custom-control custom-radio custom-control-inline">
                    <input
                            type="radio"
                            id="customRadio5"
                            name="customRadio"
                            class="custom-control-input"
                            value="5"
                            checked
                    />
                    <label class="custom-control-label" for="customRadio5">5</label>
                </div>
            </div>

            <div class="col-md-12 mb-3">
                <label class="mr-sm-2" for="feedback">Cerveza a Recomendar</label>
                <select class="custom-select mr-sm-2" id="feedback" required>
                    <option value="" selected disabled>Elegir...</option>
                    <option value="1">Honey</option>
                    <option value="2">Golden</option>
                    <option value="3">IPA</option>
                </select>
                <div class="invalid-feedback">Seleccione una cerveza.</div>
            </div>

            <div class="col-md-12 mb-3">
                <label for="exampleFormControlTextarea1">Comentarios:</label>
                <textarea
                        class="form-control"
                        id="exampleFormControlTextarea1"
                        rows="3"
                        required
                ></textarea>
                <div class="invalid-feedback">Deje algun comentario.</div>
            </div>

            <button class="btn btn-primary mb-3 ml-1" type="submit">
                Enviar
            </button>
        </div>
    </form>
</div>
</body>
</html>

<style>
    .form-feedback {
        border: 2px solid rgb(71, 138, 226);
        border-radius: 20px;
        margin: 10px;
    }

    .form-feedback h1 {
        color: rgb(71, 138, 226);
    }

    #validationTooltip01 {
        border: 1px solid rgb(184, 184, 184);
        border-radius: 3px;
        padding: 5px;
        width: 100%;
    }

</style>

<script>
    // Example starter JavaScript for disabling form submissions if there are invalid fields
    (function () {
        "use strict";
        window.addEventListener(
            "load",
            function () {
                // Fetch all the forms we want to apply custom Bootstrap validation styles to
                var forms = document.getElementsByClassName("needs-validation");
                // Loop over them and prevent submission
                var validation = Array.prototype.filter.call(forms, function (form) {
                    form.addEventListener(
                        "submit",
                        function (event) {
                            if (form.checkValidity() === false) {
                                event.preventDefault();
                                event.stopPropagation();
                            }
                            form.classList.add("was-validated");
                        },
                        false
                    );
                });
            },
            false
        );
    })();
</script>