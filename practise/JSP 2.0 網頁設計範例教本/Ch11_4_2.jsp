<!-- JSP程式：Ch11_4_2.jsp -->
<%@ page contentType="text/html; charset=MS950"
         import="java.sql.*"%>
<html>
<head><title>Ch11_4_2.jsp</title></head>
<%!
// 轉換成Unicode字串
String toUnicode(String s) { 
   if (s == null || s.length() == 0) { 
      return null;  // 空字串
   } 
   byte[] buffer = new byte[s.length()];
   int i, j;
   // 字元轉換的迴圈
   for (i = 0, j = 0; i < s.length(); i++) { 
      if ( s.charAt(i) >= 0x100 ) { 
         char c = (char) s.charAt(i); 
         byte[] buf = (""+c).getBytes(); 
         buffer[j++] = (byte) buf[0]; 
         buffer[j++] = (byte) buf[1]; 
      } 
      else 
         buffer[j++] = (byte) s.charAt(i); 
   } 
   return new String(buffer,0,j); 
} 
%>
<body>
<h2>顯示資料表的記錄資料</h2><hr>
<table border="1">
<%
Connection dbCon = null;  // 宣告物件變數
Statement stmt = null;
ResultSet rs = null;
// JDBC驅動程式參數
String sDriver = "com.mysql.jdbc.Driver";
String sCon = "jdbc:mysql://localhost:3306/" + 
              "school?user=root&password=12345&useUnicode=true&characterEncoding=MS950";
try {
   // 載入 JDBC driver 
   Class.forName(sDriver);
   // 建立資料連結和Statement物件
   dbCon = DriverManager.getConnection(sCon);
   stmt = dbCon.createStatement();
   // 建立SQL指令
   String sSQL = "SELECT * FROM students";
   rs = stmt.executeQuery(sSQL);
   while ( rs.next() ) { // 使用迴圈顯示記錄資料 
      out.print("<tr>");
      out.print("<td>"+rs.getString("stdno")+"</td>");
      out.print("<td>"+toUnicode(rs.getString("name"))+"</td>");
      out.print("<td>"+toUnicode(rs.getString("address"))+"</td>");
      out.print("<td>"+rs.getDate("birthday")+"</td>");
      out.print("<td>"+rs.getInt("totalcredit")+"</td>");      
      out.print("</tr>");
   }
   stmt.close();   // 關閉Statement物件
   dbCon.close();  // 關閉連結
}
catch(SQLException e) {
   out.print(e);   
}
%>
</table>
</body>
</html>