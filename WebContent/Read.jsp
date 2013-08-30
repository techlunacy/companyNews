<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title>Company News</title>
        <style>
        	body {
        		font-family: sans-serif;
        	}
        	
        	.timestamp {
        		 font-size:80%;
        		 color:#999;
        	}
        </style>
    </head>
    <body>
    	<h1>Company News</h1>
        <div>
    	    <s:a action="Post">Post new item</s:a> (only if you're allowed to, please)
   	    </div>
        <s:iterator value="articles">
        	<h2>
        		<s:property value="title"/>
        	</h2>
        	<div>
        		<s:property value="body"/>
        	</div>
        	<div class="timestamp">
        		posted <s:date name="createDate" nice="true"/>
       		</div>
        </s:iterator>
    </body>
</html>
