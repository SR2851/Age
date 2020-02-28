<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

<title>Formulaire de saisie</title>
<style type="text/css"><%@ include file="bootstrap.min.css"%></style>
</head>
<body style="background-color: #910035;">
<div class="container-fuild" style="backgroud-color: #910035;">
<div class="row">
	<div class="col-lg-3" style="background-color: #e6d3da; border-bottom-right-radius: 25px; border-bottom-left-radius: 25px;padding-left: 30px;">
		<h3>Réponses:</h3>
		<p>En fonction de votre âge vous verrez:</p>
		<ul><li>Vous êtes jeune</li>
		<li>Vous êtes adulte</li></ul>
	</div>
<div class="col-lg-6" style="background-color: #e6d3da; border-bottom-right-radius: 25px; border-bottom-left-radius: 25px;padding-left: 30px;">
<h1>Formulaire de saisie de l'âge:</h1>
<form action="/TD1JEE/Formulaire" method="post" style="display: block;margin-left: auto; margin-right: auto;">
<label>Donnez votre nom</label><br>
<input type="text" name="nom" class="form-control"><br>
<label>Donnez votre âge</label><br>
<input type="text" name="age" class="form-control"><br>
<input type="submit" name="lancer" value="Lancer"><br><br>
</form>
</div>
<div class="col-lg-3">
		
	</div>
</div>
</div>
</body>
</html>