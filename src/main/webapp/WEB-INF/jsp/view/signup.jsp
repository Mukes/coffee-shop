<%--@elvariable id="person" type="com.coffeeshop.model.Person"--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <form method="post" action="/signup" class="signup">
                <div class="titleH">
                    <c:choose>
                        <c:when test="${loggedUser ne null}">
                            Update Profile
                        </c:when>
                        <c:otherwise>
                            Sign Up
                        </c:otherwise>
                    </c:choose>
                </div>
                <div class="error">${errorMsg}</div>
                <div class="error">
                    <c:forEach items="${errors}" var="error">
                        ${error.message}<br/>
                       <%-- <ce:showMessage color="red" text="${error.message}"/>--%>
                    </c:forEach>
                </div>
                <div class="form-group">
                    <label for="firstName">First Name</label>
                    <input type="text" name="firstName" id="firstName" value="${person.firstName}" required="required"
                           class="form-control"/>
                    <input type="hidden" name="id" id="userId" value="${person.id}"/>
                </div>

                <div class="form-group">
                    <label for="lastName">Last Name</label>
                    <input type="text" name="lastName" id="lastName" value="${person.lastName}" required="required"
                           class="form-control"/>
                </div>

                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" name="email" id="email" value="${person.email}" required="required"
                           class="form-control"/>
                </div>

                <div class="form-group">
                    <label for="phone">Phone</label>
                    <input type="phone" name="phone" id="phone" value="${person.phone}" required="required"
                           class="form-control"/>
                </div>

                <div class="form-group">
                    <label for="role">Role</label>
                    <select name="role" id="role" required="required" class="form-control">
                        <option value="" disabled="disabled" selected="selected">--Select One--</option>
                        <option value="USER"
                                <c:if test="${person.role eq 'USER'}">selected</c:if> >USER
                        </option>
                        <option value="ADMIN"
                                <c:if test='${person.role eq "ADMIN"}'>selected</c:if> >ADMIN
                        </option>
                    </select>
                </div>

                <div class="form-group">
                    <label for="enable">Enable </label>
                <div class="checkbox">
                    <input type="checkbox" name="enable" id="enable" value="${person.enable}"/>
                </div>
                    </div>

                <div class="form-group">
                    <label for="state">State</label>
                    <input type="text" name="state" id="state" value="${person.address.state}" required="required"
                           class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="city">City</label>
                    <input type="text" name="city" id="city" value="${person.address.city}" required="required"
                           class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="country">Country</label>
                    <input type="text" name="country" id="country" value="${person.address.country}" required="required"
                           class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="zipCode">Zip code</label>
                    <input type="number" name="zipcode" id="zipCode" value="${person.address.zipcode}" required="required"
                           class="form-control" minlength="5" maxlength="5"/>
                </div>
                <hr/>

                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" name="password" id="password" required="required" class="form-control"
                           />
                </div>
                <div class="form-group">
                    <label for="rePassword">Reenter Password</label>
                    <input type="password" name="rePassword" id="rePassword" required="required" class="form-control"/>
                </div>
                <hr/>
                <a class="btn btn-default" href="login">Back</a>
                <button class="btn btn-primary pull-right" type="submit"><c:choose>
                    <c:when test="${loggedUser ne null}">
                        Update Profile
                    </c:when>
                    <c:otherwise>
                        Sign Up
                    </c:otherwise>
                </c:choose></button>
            </form>

        </div>
    </div>
</div>