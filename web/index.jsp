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
                 
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <link href='https://fonts.googleapis.com/css?family=Roboto:400,300,100' rel='stylesheet' type='text/css'>
    <link href="css/index.css" rel="stylesheet">
  <title>Acceso</title>
</head>
<body>

<div class="form">
      
      <ul class="tab-group">
        <li class="tab active"><a href="#signup">Registrarse</a></li>
        <li class="tab"><a href="#login">Accesar</a></li>
      </ul>
      
      <div class="tab-content">
        <div id="signup">   
          <h1>Registrarse para generar contraseñas</h1>
          
          <form action="registro" method="post">
          <p class="tab"><a href="#login">Ya estoy registrado</a></p>
          <div class="top-row">
            <div class="field-wrap">
              <label>
                Usuario:<span class="req">*</span>
              </label>
              <input name="usuario"type="text" required autocomplete="off" />
            </div>
        
            <div class="field-wrap">
              <label>
                Proveedor:<span class="req">*</span>
              </label>
              <input name="proveedor"type="text"required autocomplete="off"/>
            </div>
          </div>
          
           <div class="field-wrap">
            <label>
              Telefono:<span class="req">*</span>
            </label>
            <input name="telefono"type="text"required autocomplete="off"/>
          </div>

          <div class="field-wrap">
            <label>
              Correo:<span class="req">*</span>
            </label>
            <input name="correo"type="email"required autocomplete="off"/>
          </div>
          
          <div class="field-wrap">
            <label>
              Password:<span class="req">*</span>
            </label>
            <input name="pass" type="password"required autocomplete="off"/>
          </div>
          
          <button type="submit" class="button button-block"/>Registrarse</button>
          
          </form>

        </div>
        
        <div id="login">   
          <h1>Bienvenido!</h1>
          
          <form action="login" method="post">
          
            <div class="field-wrap">
            <label>
              Correo:<span class="req">*</span>
            </label>
            <input name="correo" type="email"required autocomplete="off"/>
          </div>
          
          <div class="field-wrap">
            <label>
              Password:<span class="req">*</span>
            </label>
            <input name="pass" type="password"required autocomplete="off"/>
          </div>
          <button class="button button-block"/>Acceder</button>
          </form>
           <p  ><a href="principal.jsp">Olvido password?</a></p>
        </div>
      </div><!-- tab-content -->
      
</div> <!-- /form -->
<div class="overlay" id="overlay">
            <div class="popup">
                <a href="index.jsp" id="btn-cerrarpopup" class="btn-cerrar-popup">x</a>
                <h4 class="hh4">BIENVENIDO</h4>
                <h5 class="hh5">INGRESAR NIT DE PROVEEDOR!!</h5>
                <form class="contendordiv">
                    <div class="contenedor-inputs">
                        <input class="inputnit"type="text" placeholder="Nit">
                    </div>
                    <button class="btn-submit">enviar</button>
                </form>    
            </div>
        </div>
</body>
  <script src="js/index.js"></script>
</html>    