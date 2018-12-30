import org.dom4j.*;
public class ToXmlTest1
{
 public static void main(String argv[])
 {
  Element root=DocumentHelper.createElement("AVDISPLAYRQ");
  Element agentInfo=DocumentHelper.createElement("AGENTINFO");
  root.add(agentInfo);
  Document doc=DocumentHelper.createDocument();
  
  doc.add(root);
  System.out.println(doc.asXML());
 }
}