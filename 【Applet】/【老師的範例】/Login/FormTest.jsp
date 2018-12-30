<Html>
	<%@
		page	contentType="text/html;charset=Big5"
			import="java.util.*"
	%>
<Body>
	<Table border=1>
		<Th>把计嘿</Th><Th>把计</Th>
	<%
		Enumeration e=request.getParameterNames();
		while(e.hasMoreElements()){
			String name=(String)e.nextElement();
			String value=request.getParameter(name);
			String value2=new String(value.getBytes("ISO8859_1"),"Big5");
	%>
		<Tr>
			<Td><%=name%></Td><Td><%=value2%></Td>
		</Tr>
	<%
		}
	%>
	</Table>
</Body>
</Html>