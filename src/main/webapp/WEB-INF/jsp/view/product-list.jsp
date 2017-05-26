<%--@elvariable id="product" type="com.coffeeshop.model.Product"--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table class="table">
    <thead>
    <tr>
        <th>Name</th>
        <th>Type</th>
        <th>Price</th>
        <th>Description</th>
        <th>Update</th>
        <th>Delete</th>
        <th>Order</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.productName}</td>
            <td>${product.productType}</td>
            <td>${product.price}</td>
            <td>${product.description}</td>
            <td><a class="btn btn-info " href="product-add?id=${product.id}">Update</a></td>
            <td><a class="btn btn-danger " href="product-delete?id=${product.id}">Delete</a></td>
            <td><a class="btn btn-success " href="order?id=${product.id}">Order</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
