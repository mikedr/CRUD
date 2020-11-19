<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="common/header.jspf" %>	
<%@ include file="common/navigation.jspf" %>
<div class="container">
	<h1>Datos Generales</h1>
	<form:form method="post" modelAttribute="persona">
		<form:hidden path="perId"/>
		<fieldset class="form-group">
			<form:label path="perNombre">Nombre</form:label>
			<form:input path="perNombre" type="text" class="form-control"/>
			<form:errors path="perNombre" cssClass="text-warning" />
		</fieldset>
		<fieldset class="form-group">
			<form:label path="perApellido">Apellido</form:label>
			<form:input path="perApellido" type="text" class="form-control"/>
			<form:errors path="perApellido" cssClass="text-warning" />
		</fieldset>
		<fieldset class="form-group">
			<form:label path="perNumeroDocumento">Número de documento</form:label>
			<form:input path="perNumeroDocumento" type="text" class="form-control"/>
			<form:errors path="perNumeroDocumento" cssClass="text-warning" />
		</fieldset>
		<fieldset class="form-group">
			<form:select  path="perTipoDocumento">
		       <form:option value=""> </form:option>
		       <form:options items="${tiposDocumento}"></form:options>
			</form:select>
			<form:errors path="perTipoDocumento" cssClass="text-warning" />
		</fieldset>
		<fieldset class="form-group">		
			<form:label path="perFechaNacimiento">Fecha de nacimiento</form:label>
			<form:input path="perFechaNacimiento" type="text" class="form-control" />
			<form:errors path="perFechaNacimiento" cssClass="text-warning" />
		</fieldset>
		<br>
		<button type="submit" class="btn btn-primary">Guardar</button>
	</form:form>
</div>
<%@ include file="common/footerMeassurement.jspf" %>
<%@ include file="common/footer.jspf" %>