<?php

$student = "Martin Luther King";
$arrayValues = [6, 7, 9];


echo array_sum($arrayValues) . "<br>";

echo count($arrayValues) . "<br>";

$avarage = array_sum($arrayValues) / count($arrayValues);

echo $avarage . "<br>";

$avarageEnd = round($avarage, 2);

echo $avarageEnd . "<br>";


if ($avarageEnd >= 7) {
    echo "Aprovado";
} elseif ($avarage >= 4) {
    echo "Conselho";
} else {
    echo "Reprovado";
}


?>