/*
<AVDISPLAYRQ>
   <AGENTINFO>
    <AGENTID>12034926</AGENTID>
    <AGENTACCT>b2b2c</AGENTACCT>
    <AGENTPWD>123456</AGENTPWD>
   </AGENTINFO>
   <TRIPINFO>
    <BOARD_POINT>TSA</BOARD_POINT>
    <OFF_POINT>KHH</OFF_POINT>
    <TRIP>1</TRIP>
    <DEPARTURE_DATE>2008-02-28</DEPARTURE_DATE>
    <PASSENGER_NUMBER>1</PASSENGER_NUMBER>
    <FORWARDPAGE>N</FORWARDPAGE>
   </TRIPINFO>
</AVDISPLAYRQ>
*/
import org.dom4j.*;
public class XmlTest2
{
 public static void main(String argv[])
 {
  final String AGENTID = "12034926"; //online.server.ID
	final String AGENTACCT = "b2b2c";
	final String AGENTPWD = "123456"; //online.server.Pwd
	
  Element root=DocumentHelper.createElement("AVDISPLAYRQ");
  Element agentInfo=DocumentHelper.createElement("AGENTINFO");
  agentInfo.add(DocumentHelper.createElement("AGENTID").addText(AGENTID));
  agentInfo.add(DocumentHelper.createElement("AGENTACCT").addText(AGENTACCT));
  agentInfo.add(DocumentHelper.createElement("AGENTPWD").addText(AGENTPWD));
  root.add(agentInfo);
  Element tripInfo=DocumentHelper.createElement("TRIPINFO");
  tripInfo.add(DocumentHelper.createElement("BOARD_POINT").addText("TSA"));
  tripInfo.add(DocumentHelper.createElement("OFF_POINT").addText("KHH"));
  tripInfo.add(DocumentHelper.createElement("TRIP").addText("1"));
  tripInfo.add(DocumentHelper.createElement("DEPARTURE_DATE").addText("2008-02-28"));
  tripInfo.add(DocumentHelper.createElement("PASSENGER_NUMBER").addText("1"));
  tripInfo.add(DocumentHelper.createElement("FORWRDPAGE").addText("N"));
  root.add(tripInfo);
  Document doc=DocumentHelper.createDocument();
  doc.add(root);
  System.out.println(doc.asXML());
 }
}