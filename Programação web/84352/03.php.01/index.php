<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CRUD</title>
</head>
<body>
    <form action="insert.php" method="post">
        <div>  
            <label for="name">Digite o seu nome: </label>
            <input type="text" id="name" name="name">
        </div>
        <div>  
            <label for="email">Digite o seu e-mail: </label>
            <input type="email" id="email" name="email">
        </div>
        <div>  
            <label for="password">Digite a sua senha: </label>
            <input type="password" id="password" name="password">
        </div>
        <div>
            <input type="submit" value="Cadastrar">
        </div>
    </form>
</body>
</html>