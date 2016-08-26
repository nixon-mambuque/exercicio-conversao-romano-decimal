<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="idData" required="true" %>

	<input type="text" id="${idData}" name="${idData}" size="72"/>
		<script>
			$("#${idData}").datepicker({dateFormat: 'dd/mm/yy'});
		</script>