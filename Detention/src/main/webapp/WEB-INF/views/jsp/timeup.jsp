<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="other/header.jsp" />

<body>

	<div class="container">

		<h1>Inform Parents!</h1>

		<p> ${student} cannot be retained for ${detetnionTime} hours</p>
	</div>

	<jsp:include page="other/footer.jsp" />

</body>
</html>