<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/29
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/25
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>用户密码修改</title>
    <link href="${ctx}/css/style.css" rel="stylesheet" type="text/css"/>
    <link href="${ctx}/css/LoginAndReg.css" rel="stylesheet" type="text/css"/>
    <link href="${ctx}/css/GetPwd.css" rel="stylesheet" type="text/css"/>
    <script language="JavaScript">
        function valEmail() {
            var str = document.getElementById("email").value;
            var pattern = new RegExp("\\w+@(\\w+.)+[a-z]{2,3}");
            if (str.match(pattern) == null) {
                if (document.getElementById("emailyanzheng")) {
                    document.getElementById("emailyanzheng").remove();
                }
                document.getElementById("span_CheckEmail").innerHTML = "<span style='color: red' class='note'id='emailyanzheng'>您输入的邮箱不合法，请输入正确的邮箱</span>";
                document.getElementById("email").focus();
                return false;
            }
            else {
                document.getElementById("span_CheckEmail").innerHTML = "";
                return true;
            }
        }

        function valPassword() {
            var str = document.getElementById("password").value;
            if (str === document.getElementById("password1").value) {
                if (document.getElementById("passwordyanzheng")) {
                    document.getElementById("passwordyanzheng").remove();
                }
                document.getElementById("ReCheckRePassWord").innerHTML = "";
                return true;
            }
            else {
                document.getElementById("ReCheckRePassWord").innerHTML = "<span style='color: red' class='note'id='passwordyanzheng'>您两次输入的密码不一致请重新输入</span>";
                return false;
            }
        }
    </script>
</head>

<body>
<div id="box">
    <!--top start -->
    <div id="top">
        <a href="index.html"><img src="${ctx}/images/logo.gif" alt="Estimation" width="255" height="58" border="0"
                                  class="logo"/></a>

        <p class="topDiv"></p>

        <p class="navLeft"></p>
        <ul>
            <li><a href="${ctx}/index" class="hover">首页</a></li>
            <li><a href="#">关于我们</a></li>
            <li><a href="#">在线客服</a></li>
            <li class="chart"><a href="${ctx}/chart">购物车</a></li>
        </ul>
        <p class="navRight"></p>

        <p class="topDiv"></p>

        <form name="serch" action="#" method="post">
            <input type="text" name="txtbox" value="购物搜索" class="txtBox"/>
            <input type="submit" name="go" value="搜" class="go"/>
        </form>
    </div>
    <!--top end -->
    <!--header start -->
    <div class="nav">
        <ul>
            <li class="first"><a href="#">新品上架</a></li>
            <li><a href="#">坚果炒货</a></li>
            <li><a href="#">补血大枣</a></li>
            <li><a href="#">经典肉类</a></li>
            <li><a href="#">进口零食</a></li>
            <li><a href="#">美味糖果</a></li>
            <li><a href="#">天然干果</a></li>
            <li><a href="#">蒙古奶酪</a></li>
            <li><a href="#">台湾牛轧糖</a></li>
            <li><a href="#">蜜饯果脯</a></li>
            <li class="last">
                <div id="welcome" class="welmsgdiv2"><span>您好，欢迎光临果果香。</span><a href="${ctx}/login">登录</a><span
                        class="Lloginfg">&nbsp;</span><a href="${ctx}/regist">注册</a></div>
            </li>
        </ul>
    </div>
    <!--header end -->
    <!--guide01 start -->
    <div class="guide01">
        <img src="${ctx}/images/guide_01.jpg" width="973" height="62" border="0" usemap="#Map"/>
        <map name="Map" id="Map">
            <area shape="rect" coords="398,11,493,51" href="#"/>
            <area shape="rect" coords="540,12,633,51" href="#"/>
            <area shape="rect" coords="684,12,790,53" href="#"/>
            <area shape="rect" coords="830,10,953,54" href="#"/>
        </map>
    </div>
    <!--guide01 end -->
    <!--body start -->
    <div id="body">
        <div id="Login">
            <h1 align="left"><span class="h1"><img src="${ctx}/images/buttonPassword.gif" alt="找回密码"/></span></h1>

            <div class="FPaContent">
                <form method="post" action="upGetPwd">
                    <span style="color: red">${msg}</span><br/>
                    <label>用&nbsp&nbsp户&nbsp&nbsp名&nbsp：&nbsp</label>
                    <input type="text" name="membername"/><br/>
                    <span class="blank15"></span>
                    <label>输入&nbsp&nbsp邮箱：&nbsp</label>
                    <input type="text" name="email" id="email" onblur="valEmail()"/><br/>
                    <span id="span_CheckEmail"></span>
                    <span class="blank15"></span>
                    <label>输入新密码：</label>
                    <input type="password" name="password" id="password"/><br/>
                    <span class="blank15"></span>
                    <label>确认密码&nbsp&nbsp：&nbsp</label>
                    <input type="password" name="password1" id="password1" onblur="valPassword()"/><br/>
                    <span id="ReCheckRePassWord"></span>
                    <span class="blank15"></span>
                    <input type="submit" value="确认修改" align="right"/>
                </form>
                <p class="dxSty">　</p>

                <p class="textSty">如果有任何疑问，请访问口口香 <span class="color3"><a href="#" target="_blank">帮助中心</a></span>，或与口口香客服部取得联系。<br/>
                    客服邮箱：service@koukouxiang.com<br/>
                    客服热线：400-650-7099 (仅收市话费，客服工作时间：8：00-次日凌晨1：00)<br/>
                    客服传真：0315-83603605</p>
            </div>
        </div>
        <br class="spacer"/>
    </div>
    <!--footer start -->
    <div id="footer">
        <ul>
            <li><a href="#">首页</a>|</li>
            <li><a href="#">关于我们</a>|</li>
            <li><a href="#">新闻资讯</a>|</li>
            <li><a href="#">价单下载</a>|</li>
            <li><a href="#">联系我们</a>|</li>
        </ul>
        <p class="copyright">Copyright 2010 vancl.com All Rights Reserved 冀ICP证xxxxxx号

        </p>

        <p class="design"><a href="http://www.CSSK8.com/" target="_blank" class="link">启奥科技</a></p>
    </div>
    <!--footer end -->
    <!--body end -->
</div>
<!--box-->
</body>
</html>
