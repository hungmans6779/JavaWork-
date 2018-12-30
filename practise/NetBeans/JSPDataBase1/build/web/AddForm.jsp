<%@ page contentType="text/html; charset=UTF-8 "%>
<%@ page  pageEncoding="UTF-8" %>
<html>
<head>
<title>AddForm.jsp</title>
</head>

<body>
<form name="form1" method="post" action="AddProcess.jsp">
  <table width="328" border="1" align="center">
    <tr>
      <td width="115" bgcolor="#99CCFF">學號：</td>
      <td width="197"><label>
        <input name="studno" type="text" id="studno">
      </label></td>
    </tr>
    <tr>
      <td bgcolor="#99CCFF">姓名：</td>
      <td><input name="name" type="text" id="name"></td>
    </tr>
    <tr>
      <td bgcolor="#99CCFF">月考代號：</td>
      <td><input name="examno" type="text" id="examno"></td>
    </tr>
    <tr>
      <td bgcolor="#99CCFF">國文成績：</td>
      <td><input name="chi" type="text" id="chi"></td>
    </tr>
    <tr>
      <td bgcolor="#99CCFF">英文成績：</td>
      <td><input name="eng" type="text" id="eng"></td>
    </tr>
    <tr>
      <td bgcolor="#99CCFF">數學成績：</td>
      <td><input name="math" type="text" id="math"></td>
    </tr>
    <tr>
      <td colspan="2"><label>
          <div align="center">
            <input name="send" type="submit" id="send" value="送出資料">
            <input name="reset" type="reset" id="reset" value="清除資料">
          </div>
        </label></td>
    </tr>
  </table>
</form>
</body>
</html>
