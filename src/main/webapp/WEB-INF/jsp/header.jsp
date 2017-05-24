<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-default">
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
                <%--<c:if test="${loggedUser ne null}">--%>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">User
                        <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Add user</a></li>
                        <li><a href="#">List User</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Product
                        <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Add Product</a></li>
                        <li><a href="#">List Product</a></li>
                    </ul>
                </li>
                <li><a href="/myposts">Order</a></li>
                <%--</c:if>--%>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <c:choose>
                    <c:when test="${loggedUser ne null}">
                        <li class="dropdown">
                            <a class="dropdown-toggle" data-toggle="dropdown" href="#">${loggedUser}
                                <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="<c:url value="/profile"/>">Profile</a></li>
                                <li role="separator" class="divider"></li>
                                <li><a href="<c:url value="/logout"/>">Logout</a></li>
                            </ul>
                        </li>
                    </c:when>
                    <c:otherwise>
                        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                    </c:otherwise>
                </c:choose>
            </ul>
        </div>
    </div>
</nav>