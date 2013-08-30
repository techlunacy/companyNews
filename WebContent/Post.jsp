<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
  <title>Post Company News Article</title>
</head>
<body>
	<s:form action="Post"> 
	  <s:textfield label="Title" name="title"/>
	  <s:textarea label="Body" name="body" rows="30" cols="60" />
	  <s:submit/>
	</s:form>
</body>
</html>
