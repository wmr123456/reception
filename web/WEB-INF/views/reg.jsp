<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/25
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>用户注册</title>
    <script language="JavaScript">
        function valName() {
            var pattern = new RegExp("^[a-z]([a-z0-9])*[-_]?([a-z0-9]+)$", "i");
            var str1 = document.getElementById("name").value;
            if (str1.length >= 6) {
                if (pattern.test(str1)) {
                    if (document.getElementById("usernameyanzheng")) {
                        document.getElementById("usernameyanzheng").remove();
                }
                    document.getElementById("membername1").innerHTML = "";
                    return true;
                } else {
                document.getElementById("membername1").innerHTML = "<span style='color: red' class='note'id='usernameyanzheng'>用户名应以字母开头的6-12位字符</span>";
                document.getElementById("name").focus();
            }
        }
            else {
                document.getElementById("membername1").innerHTML = "<span style='color: red' class='note'id='usernameyanzheng'>用户名应以字母开头的6-12位字符</span>";
                document.getElementById("name").focus();
                return false;
            }
        }
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
            if (str === document.getElementById("RexPassWord").value) {
                if (document.getElementById("passwordyanzheng")) {
                    document.getElementById("passwordyanzheng").remove();
            }
                document.getElementById("ReCheckRePassWord").innerHTML = "";
                return true;
            }
            else {
                document.getElementById("ReCheckRePassWord").innerHTML = "<span style='color: red' class='note'id='passwordyanzheng'>您两次输入的密码不一致请重新输入</span>";
//                document.getElementById("RexPassWord").focus();
                return false;
        }
        }
    </script>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="${ctx}/css/style.css" rel="stylesheet" type="text/css" />
    <link href="${ctx}/css/LoginAndReg.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="box">
    <!--top start -->
    <div id="top">
        <a href="index.html"><img src="${ctx}/images/logo.gif" alt="Estimation" width="255" height="58" border="0" class="logo" /></a>
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
            <input type="text" name="txtbox" value="购物搜索" class="txtBox" />
            <input type="submit" name="go" value="搜" class="go" />
        </form>
    </div>
    <!--top end -->
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
        <img src="${ctx}/images/guide_01.jpg" width="973" height="62" border="0" usemap="#Map" />
        <map name="Map" id="Map">
            <area shape="rect" coords="398,11,493,51" href="#" />
            <area shape="rect" coords="540,12,633,51" href="#" />
            <area shape="rect" coords="684,12,790,53" href="#" />
            <area shape="rect" coords="830,10,953,54" href="#" />
        </map>
    </div><!--guide01 end -->
    <!--body start -->
    <form:form modelAttribute="mer" action="/register" method="post">
    <div id="body">
        <div id="Login">
            <h1 align="left"><img src="${ctx}/images/pic_title.gif"></h1>
            <table width="800" border="0" align="center" cellpadding="0" cellspacing="0" class="lineJL">
                <tbody><tr>
                    <td class="sty03" valign="top" width="236" align="right">请填写您的Email地址：</td>
                    <td class="sty01" valign="top" width="219">
                        <form:input path="email" onblur="valEmail()" id="email"/><span class="Reginput"
                                                                                       id="span_CheckEmail"><form:errors
                            path="email" cssClass="errorClass"></form:errors></span></td>
                    <td class="sty04" valign="top" width="425" align="left">　请填写有效的 Email地址作为下次登录的用户名，<br>　同时我们也会给这个地址发送您的帐户信息、订单通知等。</td>
                </tr>
                 <tr>
                    <td class="sty03" valign="top" align="right">请输入用户名：</td>
                     <td class="sty01" valign="top">
                         <form:input path="membername" id="name" onblur="valName()"/><span id="membername1"
                                                                                           class="Reginput"><form:errors
                             path="membername" cssClass="errorClass"></form:errors></span></td>
                     <td class="sty03 sty04" valign="top" align="left">　用户名请设为6-16位字母或数字</td>
                 </tr>
                 <tr>
                    <td class="sty03" valign="top" align="right">请输入真实姓名：</td>
                     <td class="sty01" valign="top">
                         <form:input path="name"/><span id="RealName" class="Reginput"></span></td>
                     <td class="sty03 sty04" valign="top" align="left">　请输入您的正是姓名</td>
                 </tr>
                <tr>
                    <td class="sty03" valign="top" align="right">请设定密码：</td>
                    <td class="sty01" valign="top">
                        <form:password path="password" id="password"/><span id="CheckRePassWord"
                                                                            class="Reginput"
                                                                            style="color: red"><form:errors
                            path="password" cssClass="errorClass"></form:errors></span></td>
                    <td class="sty03 sty04" valign="top" align="left">　密码请设为6-16位字母或数字</td>
                </tr>
                <tr>
                    <td class="sty03" valign="top" align="right">请再次输入设定密码：</td>
                    <td class="sty01" valign="top">
                        <input id="RexPassWord" name="RexPassWord" maxlength="16" onchange="Check_RePassWord()" value=""
                               type="password" onblur="valPassword()"><span id="ReCheckRePassWord"
                                                                            class="Reginput">${msg}</span>
                    </td>
                    <td align="left">　</td>
                </tr>
                <tr>
                    <td class="sty03" valign="top" align="right">请输入验证码：</td>
                    <td class="sty02" colspan="2" valign="top">
                        <input name="Validate_Code" id="Validate_Code"
                                                                      class="inputSty01" onchange="CheckValidateCode()"
                                                                      style="width:100px;" type="text"/><img id="Img1"
                                                                                                             style="vertical-align: top; padding: 0pt 0pt 0pt 8px; height: 20px; width: 70px "
                                                                                                             src="${ctx}/valid"
                                                                                                             onclick="this.src='/valid?t='+new Date().getTime()"
                                                                                                             border="0"/>
                        <span class="sty03 ">看不清，请点击图片换一张</span>
                        <span class="Reginput" id="CheckValidateCode"
                              style="width: 220px;color: red">${msgvalide}</span></td>
                </tr>
                <tr>
                    <td>　</td>
                    <td align="right"><input type="submit" value=""
                                             style="height: 25px; width: 91px; border: 0px; background:url(/images/submit.gif)"/>
                    </td>
                    <td>　</td>
                </tr>
                <tr>
                    <td colspan="3">&nbsp;</td>
                </tr>
                </tbody>
            </table>

        </div>
        <br class="spacer" />
    </div>
    </form:form>
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
    </div><!--footer end -->
    <!--body end -->
</div><!--box-->
</body>
</html>
