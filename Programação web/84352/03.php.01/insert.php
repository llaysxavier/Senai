<?php

include "conn.php";

$name = $_POST['name'];
$email = $_POST['email'];
$password = $_POST['password'];

//echo "$name - $email - $password";

//preparar
$stmt = $conn->prepare("INSERT INTO student (namebd, emailbd, passbd) VALUES (:namebda, :emailbda, :passbda)");


//trocar
$stmt ->bindValue(':namebda', $name);
$stmt ->bindValue(':emailbda', $email);
$stmt ->bindValue(':passbda', $password);

//executar
$stmt->execute();

header('Location: index.php');

?>