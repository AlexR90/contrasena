<%-- 
    Document   : index
    Created on : Sep 11, 2020, 8:58:21 PM
    Author     : CyD.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
    <link href='https://fonts.googleapis.com/css?family=Roboto:400,300,100' rel='stylesheet' type='text/css'>
    <link href="css/index.css" rel="stylesheet">
    

  <title>Acceso</title>
</head>
<body>

  <div class="container">
    <div class="backbox">
      <div class="loginMsg">
        <div class="textcontent">
          <p class="title">No estas registrado?</p>
          <p>Registrese para generar contrasenas</p>
          <button id="switch1">Registrarse!</button>
        </div>
      </div>
      <div class="signupMsg visibility">
        <div class="textcontent">
          <p class="title">Ya esta registrado?</p>
          <p>Ingrese para generar contrasenas</p>
          <button id="switch2">Acceso</button>
        </div>
      </div>
    </div>
    <!-- backbox -->

    <div class="frontbox">
      <div class="login">
        <h2>Acceso</h2>
        <div class="inputbox">
          <input type="text" name="email" placeholder="Usuario">
          <input type="password" name="password" placeholder="PASSWORD">
        </div>
        <p>Olvido su Password?</p>
        <button>ACCEDER</button>
      </div>

      <div class="signup hide">
        <h2>REGISTRARSE</h2>
        <div class="inputbox">
          <input type="text" name="Nombre" placeholder="NombreProveedor">
          <input type="text" name="email" placeholder="Correo">
          <input type="password" name="password" placeholder="  PASSWORD">
          <input type="password" name="password" placeholder="  PASSWORD">
          <input type="password" name="password" placeholder="  PASSWORD">
        </div>
        <button>REGISTRO</button>
      </div>

    </div>
    <!-- frontbox -->
  </div>
</body>
  <script src="js/index.js"></script>
</html>    