<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="other/header.jsp" />

<body>
	<div class="container">
		<spring:url value="/" var="detentionActionUrl" />

		<form:form class="form-horizontal" method="post"
			modelAttribute="detentionForm" action="${detentionActionUrl}">

			<spring:bind path="name">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="col-sm-2 control-label">Name</label>
					<div class="col-sm-10">
						<form:input path="name" type="text" class="form-control" id="name"
							placeholder="name" />
						<form:errors path="name" class="control-label" />
					</div>
				</div>
			</spring:bind>

			<spring:bind path="type">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="col-sm-2 control-label">Type</label>
					<div class="col-sm-10">
						<label class="radio-inline"> <form:radiobutton path="type"
								value="consecutive" /> Consecutive
						</label> <label class="radio-inline"> <form:radiobutton
								path="type" value="concurrent" /> Concurrent
						</label> <br />
						<form:errors path="type" class="control-label" />
					</div>
				</div>
			</spring:bind>

			<spring:bind path="time">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="col-sm-2 control-label">Time</label>
					<div class="col-sm-10">
						<label class="radio-inline"> <form:radiobutton path="time"
								value="bad" /> Bad Time
						</label> <label class="radio-inline"> <form:radiobutton
								path="time" value="good" /> Good Time
						</label> <br />
						<form:errors path="time" class="control-label" />
					</div>
				</div>
			</spring:bind>

			<spring:bind path="list">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="col-sm-2 control-label">Offense Types</label>
					<div class="col-sm-10">
						<form:checkboxes path="list" items="${detentionList}"
							element="label class='checkbox-inline'" />
						<br />
						<form:errors path="list" class="control-label" />
					</div>
				</div>
			</spring:bind>

			<button type="submit" class="btn-lg btn-primary pull-right">Calculate
			</button>

		</form:form>

	</div>
	<jsp:include page="other/footer.jsp" />
</body>
</html>