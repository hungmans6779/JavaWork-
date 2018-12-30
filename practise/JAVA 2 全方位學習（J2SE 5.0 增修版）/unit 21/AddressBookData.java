import java.io.*;
public class AddressBookData implements Serializable
{
 static private int serialNumber;       //編號
 static private String name;            //姓名
 static private String birtyday;        //生日
 static private String homeTelephone;   //家裡電話
 static private String officeTelephone; //辦公室電話
 static private String videophone;      //傳真電話
 static private String cellPhone;       //手機號碼
 static private String webSite;         //網頁
 static private String email;           //電子信箱
 static private String address;         //個人住址
 static private String companyAddress;  //公司住址
 static private String concern;         //關係
 static private String remarks;         //備註

 public AddressBookData(int sn,String na,String ht,String ot,String vp,String cp,
                        String ws,String em,String ad,String ca,String co,String re)
 {
 	serialNumber=sn;
 	name=na;
 	homeTelephone=ht;
 	officeTelephone=ot;
 	videophone=vp;
 	cellPhone=cp;
 	webSite=ws;
 	email=em;
 	address=ad;
 	companyAddress=ca;
 	concern=co;
 	remarks=re;	
 }	  	   
 public AddressBookData()
 {
 	
 }	       
 public static void main(String argv[])
 {
 	AddressBookData bufferAdd[]=new AddressBookData[10];
 	for(int i=0;i<=9;i++)
 	{
 	 bufferAdd[i]=new AddressBookData();	
   bufferAdd[i].serialNumber=i; 	
   bufferAdd[i].name="洪嘉宏";
   bufferAdd[i].homeTelephone="06-2831998";
   bufferAdd[i].officeTelephone="06-2591817";
   bufferAdd[i].videophone="06-2831998";
   bufferAdd[i].cellPhone="0917503815";
   bufferAdd[i].webSite="http://www.hungmans6779.com.tw";
   bufferAdd[i].email="hungmans6779@yahoo.com.tw";
   bufferAdd[i].address="台南市北區成德里文成二街212巷5弄15號";
   bufferAdd[i].companyAddress="台南市星龍超媒體個人工作室";
   bufferAdd[i].concern="自己";
   bufferAdd[i].remarks="測試用";	
 	}
 	bufferAdd[0].printData();	
 	//AddressBookData aad=new AddressBookData(1,"2","3","4","5","6","7","8","9","10","11","12");
 	//aad.printData();
 	
 }	
 public void printData()
 {
 	System.out.println("編    號   ： "+serialNumber);
 	System.out.println("姓    名   ： "+name);
 	System.out.println("家裡電話   ： "+homeTelephone);
 	System.out.println("辦公室電話 ： "+officeTelephone);
 	System.out.println("傳真機號碼 ： "+videophone);
 	System.out.println("手機號碼   ： "+cellPhone);
 	System.out.println("網    址   ： "+webSite);
 	System.out.println("電子信箱   ： "+email);
 	System.out.println("個人住址   ： "+address);
 	System.out.println("公司住址   ： "+companyAddress);
 	System.out.println("關    係   ： "+concern);
 	System.out.println("備    註   ： "+remarks); 	
 }          
 
} 