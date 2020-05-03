<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../commons/nav.jsp"%>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Main content -->
    <section class="content">
        <div class="box box-info">
            <div class="box-body" style="display: block;">
                <div class="table-responsive">
                    <table class="table no-margin">
                        <thead>
                        <tr>
                            <th>水果品种</th>
                            <th>照片</th>
                            <th>水果名</th>
                            <th>价格/斤</th>
                            <th>简介</th>
                            <th>原产地</th>
                            <th>库存</th>
                            <th>销量</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="fruit" items="${fruits}">
                            <tr>
                                <td>${fruit.author}</td>
                                <td><img src="<%=request.getContextPath()%>/${fruit.fruitImage}"
                                         style="width: 45px;height: 80px;"
                                         onclick='showimage("<%=request.getContextPath()%>/${fruit.fruitImage}")'/>
                                </td>
                                <td>${fruit.fruitName}</td>
                                <td>${fruit.price}</td>

                                <td>${fruit.brief}</td>
                                <td>${fruit.source}</td>
                                <td>${fruit.stock}</td>
                                <td>${fruit.sale}</td>
                                <td>
                                    <a type="button" class="btn btn-danger" id="addCart"
                                       href="<%=request.getContextPath()%>/cart/add/${fruit.bId}">加入购物车</a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </section>
</div>
<jsp:include page="../commons/tail.jsp"/>

<script>

    function showChoose() {
        $("#chooseType").show();
        locationChange();
    }

    function showimage(source) {
        $("#imgInModalID").attr("src", source);
        $('.modal').show();
    }

    function closeModel() {
        $('.modal').hide();
    }

    function locationChange() {
        var type = "";
        var obj = document.getElementById('typeList');
        obj.options.length = 0;
        $.ajax({
            type: "post",
            url: "/fruit/getParentTypeList",
            cache: false,
            data: {type: type},
            dataType: "json",
            success: function (result) {
                if (result.length > 0) {
                    for (var i in result) {
                        var selectOption = new Option(result[i].name, result[i].cId);
                        obj.add(selectOption);
                    }
                }
            }
        });
    }


</script>
</body>
</html>
