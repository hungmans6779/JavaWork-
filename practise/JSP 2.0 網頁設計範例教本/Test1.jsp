<jsp:useBean id="name" class="page.class" scope="page" >
 <jsp:setProperty name="beans_name" property="property_name" value="property_value" />
 <jsp:getProperty name="beans_name" property="property_name" />
</jsp:useBean>

 
<jsp:include page="" flush="true" >
 <jsp:param name="cols" value="5" />
 <jsp:param name="rows" value="4" />
</jsp:include>

<jsp:forward page="" >
 <jsp:param name="" value="" />
</jsp:forward>

<jsp:plugin type="bean | applet" code="物件的檔案名稱或路徑" codebase="物件的基礎路徑" align="對齊方式"
            archive="其它檔案的清單" height="顯示高度" hspace="水平間距" vspace="垂直間距" width="顯示寬度" jreversion="JRE的版本" 
            name="物件名稱" nspluginurl="Netscapte需要使用的Plugin下載位址" iepluginURL="IE需要使用的Plugin下載位址" >
<jsp:params>
 <jsp:param name="" value="" />
 <jsp:fallback> 瀏覽程式並不支援物件的顯示</jsp:fallback>
</jsp:params>
