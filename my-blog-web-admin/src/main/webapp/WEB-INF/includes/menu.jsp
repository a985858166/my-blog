<%--
  Created by IntelliJ IDEA.
  User: 98585
  Date: 2019/1/8
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<aside class="main-sidebar">
    <！ -  sidebar：style可以在sidebar.less  - >中找到
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="/static/assets/img/user2-160x160.jpg" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p>Alexander Pierce</p>
                <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            </div>
        </div>
        <ul class="sidebar-menu" data-widget="tree">
            <li class="header">主导航</li>
            <li class="treeview">
                <a href="#"><i class="fa fa-fw fa-book"></i> <span>文章</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="#"><i class="fa fa-circle-o"></i>所有文章</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i>写文章</a></li>
                    <li><a href="#"><i class="fa fa-circle-o"></i>文章分类</a></li>
                </ul>
            </li>
            <li><a href="#"><i class="fa fa-fw fa-comments"></i> <span>评论管理</span></a></li>
            <li><a href="#"><i class="fa fa-tags"></i><span> 标签管理 </span></a></li>
            <li><a href="#"><i class="fa fa-cloud-upload"></i><span> 文件管理 </span></a></li>
            <li><a href="#"><i class="fa fa-link"></i> <span>友情链接</span></a></li>
            <li><a href="/b-admin/information"><i class="fa fa-fw fa-gear"></i><span>博客设置</span></a></li>
        </ul>
    </section>
</aside>
