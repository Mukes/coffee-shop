<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="loggedUser" type="com.coffeeshop.model.Person"--%>
<nav class="navbar navbar-inverse bg-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed"
                    data-toggle="collapse" data-target="#navbar" aria-expanded="false"
                    aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span> <span
                    class="icon-bar"></span> <span class="icon-bar"></span> <span
                    class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Coffee Shop</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-left">

            </ul>
            <ul class="nav navbar-nav">
                <li><a href="/home">Home</a></li>
                <c:if test="${loggedUser ne null}">
                <c:if test="${loggedUser.role eq 'ADMIN'}">
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">User
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="/signup">Add user</a></li>
                            <li><a href="/list-user">List User</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Product
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="/product-add">Add Product</a></li>
                            <li><a href="/product-list">List Product</a></li>
                        </ul>
                    </li>
                </c:if>
                <li><a href="/myposts">Order</a></li>
                </c:if>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <c:choose>
                    <c:when test="${loggedUser ne null}">
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">${loggedUser.email}
                                <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="/update-person?id=${loggedUser.id}">Profile</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="/logout">Logout</a></li>
                            </ul>
                        </li>
                    </c:when>
                    <c:otherwise>
                        <li><a href="/signup"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                        <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                    </c:otherwise>
                </c:choose>
            </ul>
        </div>
    </div>
</nav>