<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2014/12/26
  Time: 9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script language="JavaScript">
        function valName() {
            var pattern = new RegExp("^[a-z]([a-z0-9])*[-_]?([a-z0-9]+)$", "i");
            var str1 = document.getElementById("name").value;
            if (str1.length >= 8) {
                if (pattern.test(str1)) {
//alert("OK");
                    document.getElementById("namespan").innerHTML = "";
                    return true;
                }
                else {
                    document.getElementById("namespan").innerHTML = "<span class='note'>用户名至少需要8个字符，必须以字母开头，以字母或数字结尾，可以有-和_</span>";
                    return false;
                }
            }
            else {
                document.getElementById("namespan").innerHTML = "<span class='note'>用户名至少需要8个字符，必须以字母开头，以字母或数字结尾，可以有-和_</span>";
                return false;
            }
        }
        function valAge() {
            var str = document.getElementById("age").value;
            var pattern = /\b\d\d{0,1}\b/g;
            if (str.match(pattern) == null) {
                document.getElementById("agespan").innerHTML = "<span class='note'>Age range is 0-99</span>";
                return false;
            }
            else {
                document.getElementById("agespan").innerHTML = "";
                return true;
            }
        }
    </script>
</head>
<body>
<form id="form" action="">
    <table>
        <tr>
            <td>Name<span id="namespan"></span></td>
        </tr>
        <tr>
            <td><input type="text" id="name" name="name" onBlur="valName()"/></td>
        </tr>
        <tr>
            <td>Age<span id="agespan"></span></td>
        </tr>
        <tr>
            <td><input type="text" id="age" name="age" onBlur="valAge()"/></td>
        </tr>
        <tr>
            <td>Birthday<span id="birthdayspan"></span></td>
        </tr>
        <tr>
            <td><input type="text" id="birthday" name="birthday"/></td>
        </tr>
        <tr>
            <td>Email<span id="emailspan"></span></td>
        </tr>
        <tr>
            <td><input type="text" id="email" name="email"/></td>
        </tr>
        <tr>
            <td>Sex<span id="sexspan"></span></td>
        </tr>
        <tr>
            <td><input type="radio" id="sex" name="sex" value="Male" checked="checked"/>Male <input type="radio"
                                                                                                    id="sex" name="sex"
                                                                                                    value="Female"/>Female
            </td>
        </tr>
    </table>
</form>
</body>
</html>
