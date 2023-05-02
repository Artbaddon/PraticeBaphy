<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style-guia-php.css">
</head>

<body>
    <div class="ejercicios">
        <h2>Ejercicio 3</h2>
        <div class="form">
            <form action="<?php $_SERVER['PHP_SELF']; ?>" method="post">

                <label for="codigo">
                    <h2> Ingrese el codigo del producto</h2>

                </label>
                <input type="number" name="codigo" id="codigo" required>

                <label for="nombre">
                    <h2> Ingrese el nombre del producto>

                </label>
                <input type="text" name="nombre" id="nombre" required>

                <label for="totalE">
                    <h2> Ingrese el total de existencias</h2>

                </label>
                <input type="number" name="totalE" id="totalE" min="0" required>

                <label for="precio">
                    <h2> Ingrese el precio</h2>
                </label>
                <input type="text" name="precio" id="precio" min="0" required>

                <label for="cat">
                    <h2> Ingrese la categoria</h2>
                </label>
                <input type="number" name="cat" id="cat" min="0" required>
                <label for="descuento">
                    <h2> Ingrese el descuento</h2>
                </label>
                <input type="text" name="descuento" id="descuento" min="0" required>


                <input type="submit" value="ENVIAR" class="enviar">
            </form>
        </div>
        <?php

        include 'funciones.php';

        escribirT("Solucion 1");
        if ($_SERVER['REQUEST_METHOD'] == "POST") {

            $codigo = $_POST['codigo'];
            $nombre = $_POST['nombre'];
            $totalE = $_POST['totalE'];
            $precio = $_POST['precio'];
            $cat = $_POST['cat'];
            $descuento = $_POST['descuento'];

            if ($cat == 1) {
                $descuentoT = $precio * 0.05;
                $precio = $precio - $descuentoT;
                texto("nombre producto: $nombre <br>");
                
            } elseif ($cat == 2) {
                $descuentoT = $precio * 0.10;
                $precio = $precio - $descuentoT;
            }
        }



        ?>

    </div>
</body>

</html>