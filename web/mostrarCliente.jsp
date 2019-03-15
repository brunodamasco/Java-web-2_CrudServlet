§<%-- 
    Document   : mostrarCliente
    Created on : 14/03/2019, 15:51:53
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrando Cliente</title>
    </head>
    <body>
        <script type="text/javascript">
            alert('${msg}');
        </script>
        <h1>Mostrando cliente cadastro</h1>
        <label>Nome: </label>${clienteJsp.nome}<br/>
        <label>CPF: </label>${clienteJsp.cpf}<br/>
        <label>RG: </label>${clienteJsp.rg}<br/>
        <label>E-mail: </label>${clienteJsp.email}<br/>
        <label>Telefone: </label>${clienteJsp.telefone}<br/>
    </body>
</html>
