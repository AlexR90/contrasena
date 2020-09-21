<%-- 
    Document   : principal
    Created on : Sep 12, 2020, 8:48:53 AM
    Author     : Deyda E
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="css/index_1.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="overlay">
            <div class="popup">
                <a href="index.jsp" id="btn-cerrarpopup" class="btn-cerrar-popup">x</a>
                <h4>BIENVENIDO</h4>
                <h5>INGRESAR NIT DE PROVEEDOR!!</h5>
                <form>
                    <div class="contenedor-inputs">
                        <input type="text" placeholder="Nit">
                    </div>
                    <button class="btn-submit">enviar</button>
                </form>    
            </div>
        </div>
    </body>
</html>
