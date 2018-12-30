import org.dom4j.*;
import org.apache.commons.logging.*;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.PostMethod;
public class XmlTest1
{
 public static void main(String argv[])
 {
 	Element root = DocumentHelper.createElement("HTML");
 	Element tit=DocumentHelper.createElement("HEAD");
 	tit.add(DocumentHelper.createElement("TITLE").addText("´ú¸Õºô­¶"));
 	root.add(tit);
 	Element bod=DocumentHelper.createElement("BODY").addText("TEST");
 	root.add(bod);
 	Document doc= DocumentHelper.createDocument();
 	doc.add(root);
  String str=doc.asXML();
 	Log log=LogFactory.getLog(XmlTest1.class);
 	log.info(str);
 	
 	
 	HttpClient client = new HttpClient();
	client.setTimeout(20000);
	client.setConnectionTimeout(20000);
	client.setHttpConnectionFactoryTimeout(20000);
	
	final String SEARCH_FITFLIGHT_URL="http://203.74.224.48/servlet/b2b2c.servlet.AvDisplayRQ";
	
	PostMethod authpost = new PostMethod(SEARCH_FITFLIGHT_URL);
	/*
	authpost.getParams().setContentCharset("UTF-8");
  NameValuePair[] formvalues = new NameValuePair[1];
  formvalues[0]=new NameValuePair("inputxml", str);
  */
 }		
}	