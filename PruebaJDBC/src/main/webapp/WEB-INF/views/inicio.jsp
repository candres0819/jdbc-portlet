<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" session="false"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<portlet:defineObjects />
<portlet:actionURL var="urlAction">
	<portlet:param name="action" value="submit"/>
</portlet:actionURL>

<form:form id="formContactenos" name="formContactenos" action="${urlAction}" method="POST" autocomplete="off">
	<div class="wrapfield mensaje">
		<p><label for="observaciones">Probar JDBC</label></p>
	</div>
	<input type="submit" name="submit" />
</form:form>