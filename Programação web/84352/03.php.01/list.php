<?php

include "conn.php";

//preparar

$stmt = $conn->prepare("SELECT * FROM student");

//executar

$stmt->execute();

//buscar

$list = $stmt->fetchAll(PDO::FETCH_ASSOC);


?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>Código</th>
            <th>Nome</th>
            <th>Email</th>
            <th>Ações</th>
        </tr>
        <?php foreach ($list as $user): ?>
        <tr>
            <td><?=$user['id']?></td>
            <td><?=$user ['namebd']?></td>
            <td><?=$user ['emailbd']?></td>
            <td>Editar | Excluir</td>
        </tr>
        <?php endforeach; ?>
    </table>
</body>
</html>