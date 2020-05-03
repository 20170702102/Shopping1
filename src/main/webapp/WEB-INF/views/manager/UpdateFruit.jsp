<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../commons/nav.jsp"%>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <!-- Main content -->
    <section class="content">
        <a type="button" class="btn btn-danger" onclick="showChoose()">目录选择</a>

        <div class="box-body" style="display: none;" id="chooseType">
            <form action="<%=request.getContextPath()%>/fruit/searchByCategory" method="post">
                <select name="typeList" id="typeList">
                    <option value="">请选择</option>
                </select>
                <input type="submit" class="btn btn-danger" value="查询">
            </form>
        </div>
        <form action="<%=request.getContextPath()%>/fruit/checkFruit" method="post">
            <input type="text" placeholder="请填写水果名" name="fruitName">
            <input type="submit" class="btn btn-danger" value="查询水果">
        </form>


        <div class="box box-info">
            <div class="box-body" style="display: block;">
                <div class="table-responsive">
                    <form action="<%=request.getContextPath()%>/backend/fruit/updateFruit" method="post">
                        <input type="hidden" name="bId" value="${fruit.bId}">
                        水果品种：<input name="author" value="${fruit.author}"/>
                        <br/>
                        <input type="hidden" name="fruitImage" value="${fruit.fruitImage}">
                        水果名字：<input name="fruitName" value="${fruit.fruitName}"/>
                        <br/>
                        水果价格：<input name="price" value="${fruit.price}"/>
                        <br/>
                        总页数：<input name="brief" value="${fruit.brief}"/>
                        <br/>
                        出版社：<input name="source" value="${fruit.source}"/>
                        库存：<input name="stock" value="${fruit.stock}"/>
                        销量：<input name="sale" value="${fruit.sale}"/>
                        <input type="submit" value="提交">
                    </form>
                </div>
            </div>
        </div>
    </section>
</div>

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
