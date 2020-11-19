<%@ include file="common/header.jspf" %>	
<%@ include file="common/navigation.jspf" %>
<div class="container">
	<h1>Personas</h1>
	
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Número Documento</th>
				<th>Tipo Documento</th>
				<th>Fecha Nacimiento</th>															
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${personas}" var="persona">
				<tr>
					<td>${persona.perId}</td>
					<td>${persona.perNombre}</td>						
					<td>${persona.perApellido}</td>
					<td>${persona.perNumeroDocumento}</td>
					<td>${persona.perTipoDocumento}</td>
					<td><fmt:formatDate pattern="dd/MM/yyyy" value="${persona.perFechaNacimiento}" /></td>	
					<td>
						<a type="button" class="btn btn-light" 
							href="/editar?id=${persona.perId}">Editar</a>

						<a type="button" class="btn btn-danger" 
							href="/eliminar?id=${persona.perId}">Eliminar</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div>
		<a type="button" class="btn btn-success" href="/nuevaPersona">Nuevo</a>
	</div>
</div>


<%@ include file="common/footer.jspf" %>