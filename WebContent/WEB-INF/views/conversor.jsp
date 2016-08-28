<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<style>
.w3-btn{width:150px;}
</style>

<title>Conversor</title>
</head>
<body bgcolor="aquamarine">
	<form action="converte" method="post">
	
	<table width="600">
		<tr>
			<td align="center">
				<h1 class="w3-container w3-blue">Bem vindo ao sistema de conversao de numeracao romana para decimal</h1>
			</td>
		</tr>
		<tr>
			<td align="center">
				<h3>Introduza por favor o valor em Romano:</h3>
			</td>
		</tr>
	</table>
	
	<table width="600">
		<tr>
			<td align="center">
				<input type="text" name="valorRomano" />
			</td>
		</tr>
	</table>
	
	<table width="600">
		<tr>
			<td align="center">
				<input type="submit" name="bt_converte" value="Converter" class="w3-btn w3-red w3-round-medium" />
			</td>
		</tr>
	</table>
	
	</form>
</body>
</html>