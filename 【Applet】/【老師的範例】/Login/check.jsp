<%
	String name=request.getParameter("name");
	String password=request.getParameter("password");
	if(name.equals("yung")){
		if(password.equals("1001")){
			out.println("OK");
		}else{
			out.println("PasswordError");
		}
	}else{
			out.println("NameError");
	}
%>