<?php

    $name = "Darcy Ribeiro";
    $number1 = 10;
    $number2 = 3;
    $number3 = "3";


    echo "Olá, Mundo!";
    echo "<br>";
    echo $name;
    echo "<br>";

    $result = $number1 + $number2;
    echo $result;
    echo "<br>";

    $result = $number1 - $number2;
    echo $result;
    echo "<br>";

    $result = $number1 * $number2;
    echo $result;
    echo "<br>";

    $result = $number1 / $number2;
    echo $result;
    echo "<br>";

    $result = $number1 % $number2;
    echo $result;
    echo "<br>";

    $result2 = $number1 + $number3;
    echo $result2;
    echo "<br>";

    echo "O resultado da soma de uma string com um inteiro é: " .gettype($result2);
    echo "<br>";

    if (is_int($number3))
    {
        echo '$number3 é um inteiro';
    }
    else
    {
        echo '$number3 não é um inteiro';
    }

    /*
    echo gettype($number2);
    echo "<br>";

    echo gettype($number3);
    echo "<br>"; 
    */

?>