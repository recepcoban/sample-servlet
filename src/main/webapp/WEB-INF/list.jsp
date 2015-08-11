<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
	
	<h4>${todos}</h4>
	
<ul>

	<c:forEach items="${todos}" var="todo">
	
		<c:if test="${todo.done}">
			<li><strike>${todo.name}</strike></li>			
		</c:if>
		
		<c:if test="${!todo.done}">
			<li>${todo.name}</li>			
			<form action="list" method="post">
				<input type="text" name="id" value="${todo.id}">
				<input type="checkbox" name="doDone" >
				<input type="submit" value="Done">				
			</form>
		</c:if>
		<a href="update?id=${todo.id}">Edit</a>
	</c:forEach>

</ul>
	
</body>
</html>
