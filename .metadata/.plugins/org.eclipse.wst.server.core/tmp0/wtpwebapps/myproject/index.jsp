<%@page import="test.structEntity"%>
<%@page import="java.io.OutputStream"%>
<html>
	<body>
		hello world!
		
		<%
			structEntity struct = new structEntity();
			struct.setId(1);
			struct.setName("mahdi");
			
			out.write(struct.getId()+"");
			
		%>
	</body>
</html>