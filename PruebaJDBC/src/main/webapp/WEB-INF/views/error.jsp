<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<div id="WrapTransacciones-General">
	<table class="tableError marginCenter">
		<tr>
			<td rowspan="3" align="center" width="15%" class="valign"><div class="divError"></div></td>
			<td align="left" width="85%" class="tituloError valignMiddle">${error}</td>
		</tr>
		<tr>
			<td align="left" width="85%" class="conTextError">Mensaje: ${mensaje}</td>
		</tr>
		<tr>
			<td align="left" width="85%" class="conTextError">Causa: ${causa}</td>
		</tr>
		<tr>
			<td align="center" class="valignMiddle" colspan="2">
				<div class="BotonYellow">
					<a style="margin: 0 auto;" id="BotonEnviar" href="<portlet:renderURL/>" class="btnDoble">Volver</a>
				</div>
			</td>
		</tr>
	</table>
	<div class="Clear"></div>
</div>