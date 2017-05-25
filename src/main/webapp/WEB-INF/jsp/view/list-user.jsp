<%--@elvariable id="person" type="com.coffeeshop.model.Person"--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table class="table">
    <thead>
    <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Email</th>
        <th>Role</th>
        <th>Update</th>
        <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${persons}" var="person">
        <tr>
            <td>${person.firstName}</td>
            <td>${person.lastName}</td>
            <td>${person.email}</td>
            <td>${person.role}</td>
            <td><a class="btn btn-info " href="update-person?id=${person.id}">Update</a></td>
            <td><a class="btn btn-danger " href="delete-person?id=${person.id}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
