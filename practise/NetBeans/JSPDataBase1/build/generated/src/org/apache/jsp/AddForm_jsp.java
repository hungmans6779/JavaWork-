package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html; charset=UTF-8 ");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>AddForm.jsp</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"form1\" method=\"post\" action=\"AddProcess.jsp\">\r\n");
      out.write("  <table width=\"328\" border=\"1\" align=\"center\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td width=\"115\" bgcolor=\"#99CCFF\">學號：</td>\r\n");
      out.write("      <td width=\"197\"><label>\r\n");
      out.write("        <input name=\"studno\" type=\"text\" id=\"studno\">\r\n");
      out.write("      </label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td bgcolor=\"#99CCFF\">姓名：</td>\r\n");
      out.write("      <td><input name=\"name\" type=\"text\" id=\"name\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td bgcolor=\"#99CCFF\">月考代號：</td>\r\n");
      out.write("      <td><input name=\"examno\" type=\"text\" id=\"examno\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td bgcolor=\"#99CCFF\">國文成績：</td>\r\n");
      out.write("      <td><input name=\"chi\" type=\"text\" id=\"chi\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td bgcolor=\"#99CCFF\">英文成績：</td>\r\n");
      out.write("      <td><input name=\"eng\" type=\"text\" id=\"eng\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td bgcolor=\"#99CCFF\">數學成績：</td>\r\n");
      out.write("      <td><input name=\"math\" type=\"text\" id=\"math\"></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td colspan=\"2\"><label>\r\n");
      out.write("          <div align=\"center\">\r\n");
      out.write("            <input name=\"send\" type=\"submit\" id=\"send\" value=\"送出資料\">\r\n");
      out.write("            <input name=\"reset\" type=\"reset\" id=\"reset\" value=\"清除資料\">\r\n");
      out.write("          </div>\r\n");
      out.write("        </label></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
