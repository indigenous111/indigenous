<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
<title>Indigenous | Home</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div id="content">
		<h2>Home</h2>
		<form>
			<fieldset>
				<legend>Menu</legend>
				<ul>
					<li><a href='<c:url value="${pmurl}"/>' target='_blank'> Project Management Tool </a></li>
					<li><a href='<c:url value="${qaurl}"/>' target='_blank'> QA Tool </a></li>
				</ul>
			</fieldset>
		</form>
		<form>
			<fieldset>
				<legend>Games</legend>
				<ul>
					<li><a href="#"> Hustle </a></li>
				</ul>
			</fieldset>
		</form>
		<form>
			<fieldset>
				<legend>Personal Tools</legend>
				<ul>
				</ul>
			</fieldset>
		</form>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>