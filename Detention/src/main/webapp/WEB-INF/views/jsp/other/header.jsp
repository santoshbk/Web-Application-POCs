<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<head>
<title>Detention Calculator</title>


<spring:url value="/resources/core/css/hello.css" var="coreCss" />
<spring:url value="/resources/core/css/bootstrap.min.css"
	var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
</head>

<spring:url value="/" var="urlHome" />

<nav class="navbar navbar-inverse ">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="${urlHome}">Detention Calculator</a>
		</div>
	</div>
</nav>