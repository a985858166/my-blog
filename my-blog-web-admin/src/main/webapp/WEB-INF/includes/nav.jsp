<%--
  Created by IntelliJ IDEA.
  User: 98585
  Date: 2019/1/8
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header class="main-header">
    <!-- Logo -->
    <a href="#" class="logo">
        <!-- 侧栏迷你50x50像素的迷你标志 -->
        <span class="logo-mini"><b>B</b>log</span>
        <!-- 常规状态和移动设备的徽标 -->
        <span class="logo-lg"><b>我的</b>博客</span>
    </a>
    <!-- 标题导航栏：样式可以在header.less中找到 -->
    <nav class="navbar navbar-static-top">
        <!-- 侧边栏切换按钮-->
        <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
            <span class="sr-only">切换导航</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </a>
        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
                <!-- 用户帐户：样式可以在dropdown.less中找到 -->
                <li class="dropdown user user-menu">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <img src="/static/assets/img/user2-160x160.jpg" class="user-image" alt="User Image">
                        <span class="hidden-xs">流体石头</span>
                    </a>
                    <ul class="dropdown-menu">
                        <!-- User image -->
                        <li class="user-header">
                            <img src="/static/assets/img/user2-160x160.jpg" class="img-circle" alt="User Image">

                            <p>${user.username}</p>
                        </li>

                        <!-- Menu Footer-->
                        <li class="user-footer">
                            <div class="pull-left">
                                <a href="#" class="btn btn-default btn-flat">简介</a>
                            </div>
                            <div class="pull-right">
                                <a href="#" class="btn btn-default btn-flat">退出</a>
                            </div>
                        </li>
                    </ul>
                </li>

            </ul>
        </div>
    </nav>
    <%--导航栏结束--%>

</header>