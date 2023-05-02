<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicios ciclcios</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            background-image: url(img/aaaaaa.jpg);
            background-size: cover;
            font-family: 'Courier New', Courier, monospace;
            color: white;
        }



        .all {
            width: 100%;
            height: 100vh;
            outline: 1px solid black;
            position: relative;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .ejercicios {
            backdrop-filter: blur(100px);
            width: 70%;
            height: fit-content;
            text-align: center;
            text-shadow: 2px 2px black;
            box-shadow: 0 0 20px 3px black;

        }

        .ejercicios h1 {
            color: white;
            font-size: 4vh;

        }

        .ejercicios h2 {
            color: white;

        }

        .lista1 {
            display: inline-block;
            vertical-align: top;
            text-decoration: none;
            list-style: none;
            text-align: center;
            width: 20%;
            line-height: 30px;
        }

        .lista1 a {
            color: white;
            text-decoration: none;
            font-size: 20px;

        }

        .lista1 a:hover {
            color: black;


        }
    </style>
</head>

<body>
    <div class="all">
        <div class="ejercicios">
            <?php
            include 'ejercicios/funciones.php';
            echo "<h1>Ejercicios Ciclicos</h1>";

            ?>
            <ul class="lista1">
                <li><a href="ejercicios/1.php" target="a">1</a></li>
                <li><a href="ejercicios/2.php" target="a">2</a></li>
                <li><a href="ejercicios/3.php" target="a">3</a></li>
                <li><a href="ejercicios/4.php" target="a">4</a></li>
                <li><a href="ejercicios/5.php" target="a">5</a></li>
                <!-- <li><a href="ejercicios/6.php" target="a">6</a></li> -->
            </ul>
            <iframe src="" width="60%" height="500px" class="iframe1" name="a"></iframe>
        </div>
    </div>
</body>

</html>