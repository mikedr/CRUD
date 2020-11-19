<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="common/header.jspf" %>	
<%@ include file="common/navigation.jspf" %>
<div class="container">
	<h1>Filtros</h1>
	<form:form method="post" modelAttribute="personaBuscar">
		<fieldset class="form-group">
			<form:label path="perNombre">Nombre</form:label>
			<form:input path="perNombre" type="text" class="form-control"/>
			<form:errors path="perNombre" cssClass="text-warning" />
		</fieldset>
		<fieldset class="form-group">			
			<form:select  path="perTipoDocumento">
		       <form:option value=""> </form:option>
		       <form:options items="${tiposDocumento}"></form:options>
			</form:select> 			
		</fieldset>
		<br>
		<button type="submit" class="btn btn-primary">Buscar</button>
	</form:form>
</div>
<%@ include file="common/footerMeassurement.jspf" %>
<%@ include file="common/footer.jspf" %>