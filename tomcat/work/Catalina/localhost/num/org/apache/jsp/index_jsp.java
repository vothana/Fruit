/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.79
 * Generated at: 2022-12-16 18:04:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.OutputStream;
import num.DataSQL;
import java.util.List;
import num.Fruit;
import num.Fruit;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.OutputStream");
    _jspx_imports_classes.add("num.DataSQL");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("num.Fruit");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home PAGE</title>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.2/jquery.min.js\" integrity=\"sha512-tWHlutFnuG0C6nQRlpvrEhE4QpkG1nn2MOUMWmUeRePl4e3Aki0VB6W1v3oLjFtd0hVOtRQ9PHpSfN6u6/QXkQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\"></script>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://getbootstrap.com/docs/5.2/assets/css/docs.css\" rel=\"stylesheet\">\n");
      out.write("        <title>Bootstrap Example</title>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css\" integrity=\"sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\"/>\n");
      out.write("\n");
      out.write("        ");
      num.DataSQL bean = null;
      bean = (num.DataSQL) _jspx_page_context.getAttribute("bean", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (bean == null){
        bean = new num.DataSQL();
        _jspx_page_context.setAttribute("bean", bean, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\n");
      out.write("        ");
      file.upload file = null;
      file = (file.upload) _jspx_page_context.getAttribute("file", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (file == null){
        file = new file.upload();
        _jspx_page_context.setAttribute("file", file, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\n");
      out.write("        ");
      file.get get = null;
      get = (file.get) _jspx_page_context.getAttribute("get", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (get == null){
        get = new file.get();
        _jspx_page_context.setAttribute("get", get, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"parent\">\n");
      out.write("          <div class=\"box_container\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <div class=\"menu\">\n");
      out.write("                    <div class=\"link\">Home</div>\n");
      out.write("                    <div class=\"link\">Store</div>\n");
      out.write("                    <div class=\"link\">\n");
      out.write("                        <p class=\"badge\">2</p>\n");
      out.write("                        <i class=\"fa-solid fa-cart-shopping\"></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"profile\">\n");
      out.write("                    <div class=\"link\" style=\"background: none\">Omega 3</div>\n");
      out.write("                    <div class=\"profileImg\">\n");
      out.write("                        <img src=\"./images/1/Red Cherry .png\" >\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"box\">\n");
      out.write("                \n");
      out.write("<!--                Design home here-->\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("      <div style=\"width: 100%; height: 20px; background: red; margin: 100px 0 20px 0\"></div>\n");
      out.write("      <h2 style=\"text-align: center; width: 100%\">TEST</h2>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("        ");
 
            if(request.getParameter("id") != null){
                boolean result = file.uploadFile(request);
                if(result)
                    out.print("Success upload file");
                else
                    out.print("Fail to upload");
            }
            
        
      out.write("\n");
      out.write("        <form id=\"form\" role=\"form\" action=\"\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("            <div class=\"btn btn-success btn-file\">\n");
      out.write("                    <i class=\"fa fa-cloud-upload\"></i>\n");
      out.write("                     Browse\n");
      out.write("                     <input type=\"file\" name=\"file\" id=\"image\" />\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" value=\"submit\" name='submit'>submit</button>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        ");

            String filename = "1 (12).png";
            String id = "1";
            if(request.getParameter("id") != null){
                filename = request.getParameter("file");
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <img src=\" ");
 out.print(get.getFilePath(filename, id , "home")); 
      out.write("\" width=\"300\" height=\"300\">\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $('input[type=file]').change(function () {\n");
      out.write("                var $fileName =  $('#image').val(); \n");
      out.write("                var $test = \"index.jsp?id=1&file=\" + $fileName.substring($fileName.lastIndexOf(\"\\\\\") + 1, $fileName.length);\n");
      out.write("                $('#form').attr(\"action\", $test);\n");
      out.write("                //alert($test);\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
