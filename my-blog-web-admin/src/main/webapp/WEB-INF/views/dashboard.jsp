<%--
  Created by IntelliJ IDEA.
  User: 98585
  Date: 2019/1/8
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>仪表盘</title>
    <jsp:include page="../includes/header.jsp"/>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
    <jsp:include page="../includes/nav.jsp"/>
    <jsp:include page="../includes/menu.jsp"/>
    <!-- 内容包装器。包含页面内容 -->
    <div class="content-wrapper">
        <!-- 内容标题（页眉） -->
        <section class="content-header">
            <h1>
                控制面板
            </h1>
        </section>
        <!-- 主要内容 -->
        <section class="content">
            <div class="container">
                <div class="row">
                    <div class="box">
                        <div class="box-header">
                            <h3 class="box-title">用户列表</h3>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">

                        </div>
                        <!-- /.box-body -->
                    </div>
                </div>
            </div>

        </section>
    </div>
    <!-- 内容包装器。包含页面内容 and-->
    <jsp:include page="../includes/copyright.jsp"/>

</div>


<jsp:include page="../includes/footer.jsp"/>
</body>
</html>
