<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <!--css-->

    <!--boostrap-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">

</head>

<body>
    <!-- start navbar-->
    <nav class="navbar navbar-expand-lg bg-dark"
    data-bs-theme="dark">
  <div class="container">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.php">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="empresa.php">A Empresa</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="servicos.php">Serviços</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="contato.php">Contato</a>
        </li>
    </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Pesquisar" aria-label="Search">
        <button class="btn btn-outline-danger" type="submit">Pesquisar</button>
      </form>
    </div>
  </div>
</nav>
    <!-- end navbar--> 
    <!-- start main-->
        <main>
            <div class="container pt-5">
                <h1>Página Principal</h1>
            </div>
        </main>    
    <!-- end main-->
    <footer class="bg-secondary">
        <div class="container pt-5 pb-3">
            <p>Todos os direitos reservados</p>
        </div>
    </footer>

    <!-- script bootstrap-->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
        crossorigin="anonymous"></script>
</body>

</html>