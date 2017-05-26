<%--@elvariable id="product" type="com.coffeeshop.model.Product"--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <form method="post" action="/product-add" class="signup">
                <div class="titleH">
                    <c:choose>
                        <c:when test="${product.id gt 0}">
                            Update Product
                        </c:when>
                        <c:otherwise>
                            Add Product
                        </c:otherwise>
                    </c:choose>
                </div>
                <div class="error">${errorMsg}</div>
                <div class="form-group">
                    <label for="productName">Product Name</label>
                    <input type="text" name="productName" id="productName" value="${product.productName}" required="required"
                           class="form-control"/>
                    <input type="hidden" name="id" id="id" value="${product.id}"/>
                </div>

                <div class="form-group">
                    <label for="price">Price</label>
                    <input type="price" name="price" id="price" value="${product.price}" required="required"
                           class="form-control"/>
                </div>

                <div class="form-group">
                    <label for="description">Description</label>
                    <input type="description" name="description" id="description" value="${product.description}" required="required"
                           class="form-control"/>
                </div>

                <div class="form-group">
                    <label for="productType">Product Type</label>
                    <select name="productType" id="productType" required="required" class="form-control">
                        <option value="" disabled="disabled" selected="selected">--Select One--</option>
                        <option value="BREAKFAST"
                                <c:if test="${product.productType eq 'BREAKFAST'}">selected</c:if> >BREAKFAST
                        </option>
                        <option value="LUNCH"
                                <c:if test='${product.productType eq "LUNCH"}'>selected</c:if> >LUNCH
                        </option>
                        <option value="DINNER"
                                <c:if test='${product.productType eq "DINNER"}'>selected</c:if> >DINNER
                        </option>
                    </select>
                </div>


                <hr/>
                <button class="btn btn-primary pull-right" type="submit"><c:choose>
                    <c:when test="${product.id gt 0}">
                        Update Product
                    </c:when>
                    <c:otherwise>
                        Add Product
                    </c:otherwise>
                </c:choose></button>
            </form>

        </div>
    </div>
</div>