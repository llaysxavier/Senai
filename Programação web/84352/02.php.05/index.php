<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        if(isset($_GET['acao'])){
            echo "Clicou";
        }
        
    ?>
    <form action=""method="get">
        <button type="subimit" name="acao">Clique aqui</button>
    </form>
</body>
</html>