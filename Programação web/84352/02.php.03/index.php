<?php

$sorteio = rand(0,5);
echo "$sorteio <br>";

switch($sorteio) {
    case 0:
        echo "Perdeu a vez!";
        break;
    case 1:
        echo "Avance 1 casa!";
        break;
    case 2:
        echo "Avance 2 casas!";
        break;
    case 3:
        echo "Avance 2 casas e jogue novamente!";
        break;
    case 4:
        echo "Avance 1 casa e os adversarios voltam 2 casas!";
        break;
    default:
        echo "Volte 5 casas!";
        break;
}
?>