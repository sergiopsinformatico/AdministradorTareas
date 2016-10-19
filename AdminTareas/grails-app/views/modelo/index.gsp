<%@ page contentType="text/html;charset=UTF-8" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Aplicacion Grails. Procesos de Ingenieria de Software</title>
	</head>
	<body>
		<h1>Listado de Tareas</h1>
		<div>
			<form action ="registrar" method="post">
				Tarea:
				<p>
					<input type="text" name="tarea" id="tarea"/>
				</p>
				<p>
					<input type="submit" name="Crear" id="Crear" value="Crear"/>
				</p>
			</form>     
			<form action ="eliminar" method="post">
				<table table width="38%" border="1" align="center" cellpadding="1" cellspacing="1">
					<tr>
						<th colspan="2" scope="col" >Tareas Pendientes</th>
					</tr>  				
					<g:each var="tarea" in="${tareas}">
						<tr>
							<td>
								${tarea.nombreTarea}
							</td>	  				
						</tr>
					</g:each>
					<tr>
						<td>
							Tarea a borrar: <input type="text" name="fila" id="fila"/>
						</td>
						<td>
							<input type="submit" value="Borrar">
						</td>
					</tr> 				
				</table>            
			</form>
		</div>
	</body>
</html>