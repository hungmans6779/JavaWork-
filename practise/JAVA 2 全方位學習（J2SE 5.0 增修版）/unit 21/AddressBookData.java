import java.io.*;
public class AddressBookData implements Serializable
{
 static private int serialNumber;       //�s��
 static private String name;            //�m�W
 static private String birtyday;        //�ͤ�
 static private String homeTelephone;   //�a�̹q��
 static private String officeTelephone; //�줽�ǹq��
 static private String videophone;      //�ǯu�q��
 static private String cellPhone;       //������X
 static private String webSite;         //����
 static private String email;           //�q�l�H�c
 static private String address;         //�ӤH��}
 static private String companyAddress;  //���q��}
 static private String concern;         //���Y
 static private String remarks;         //�Ƶ�

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
   bufferAdd[i].name="�x�ŧ�";
   bufferAdd[i].homeTelephone="06-2831998";
   bufferAdd[i].officeTelephone="06-2591817";
   bufferAdd[i].videophone="06-2831998";
   bufferAdd[i].cellPhone="0917503815";
   bufferAdd[i].webSite="http://www.hungmans6779.com.tw";
   bufferAdd[i].email="hungmans6779@yahoo.com.tw";
   bufferAdd[i].address="�x�n���_�Ϧ��w���妨�G��212��5��15��";
   bufferAdd[i].companyAddress="�x�n���P�s�W�C��ӤH�u�@��";
   bufferAdd[i].concern="�ۤv";
   bufferAdd[i].remarks="���ե�";	
 	}
 	bufferAdd[0].printData();	
 	//AddressBookData aad=new AddressBookData(1,"2","3","4","5","6","7","8","9","10","11","12");
 	//aad.printData();
 	
 }	
 public void printData()
 {
 	System.out.println("�s    ��   �G "+serialNumber);
 	System.out.println("�m    �W   �G "+name);
 	System.out.println("�a�̹q��   �G "+homeTelephone);
 	System.out.println("�줽�ǹq�� �G "+officeTelephone);
 	System.out.println("�ǯu�����X �G "+videophone);
 	System.out.println("������X   �G "+cellPhone);
 	System.out.println("��    �}   �G "+webSite);
 	System.out.println("�q�l�H�c   �G "+email);
 	System.out.println("�ӤH��}   �G "+address);
 	System.out.println("���q��}   �G "+companyAddress);
 	System.out.println("��    �Y   �G "+concern);
 	System.out.println("��    ��   �G "+remarks); 	
 }          
 
} 