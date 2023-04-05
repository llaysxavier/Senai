<?php

// comentario de 1 linha
/*
A estudante Dandara da Silva
n1 = 7
n2 = 9
n3 = 6
a média = (n1+n2+n3)/3
Se a média for >= 7
    Aprovada
Se a média for >= 4 
    Conselho
Senão
    Reprovada
*/

$student = "Dandara da Silva";
$n1 = 7;
$n2 = 10;
$n3 = 6;
$average = ($n1+$n2+$n3)/3;

//echo "A aluna $student ficou com média igual a $average ";

if ($average >=7) {
    echo "A aluna $student ficou com média igual a
    $average e foi aprovada";
}elseif ($average >=4){
    echo "A aluna $student ficou com média igual a
    $average e foi para o conselho";
}else{
    echo "A aluna $student ficou com média igual a
    $average e foi reprovada";
}
?>