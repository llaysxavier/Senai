<?php

$dayWeek = date("w");
echo $dayWeek . "<br>";

switch ($dayWeek) {
    case 0:
        echo "Hoje é domingo";
        break;
    case 1:
        echo "Hoje é segunda";
        break;
    case 2:
        echo "Hoje é terça";
        break;
    case 3:
        echo "Hoje é quarta";
        break;
    case 4:
        echo "Hoje é quinta";
        break;
    case 5:
        echo "Hoje é sexta";
        break;
    case 6:
        echo "Hoje é sábado";
        break;
}

