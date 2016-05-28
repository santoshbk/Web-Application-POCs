<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="other/header.jsp" />

<body>

	<div class="container">

		<h1>Detention Time</h1>

		<p> Detention time for ${student} is ${detetnionTime} hours</p>
	</div>

	<jsp:include page="other/footer.jsp" />

</body>
</html>