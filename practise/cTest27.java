class Company
{
 public static final Company TAINAN=new Company("台南分公司","台南市","8865252","45434323");
 private static String compName,address,tel,fax;
 private Company(String compName,String address,String tel,String fax)
 {
  this.compName=compName;
  this.address=address;
  this.tel=tel;
  this.fax=fax;
 }
 public String getName()
 {
 	return compName;
 }	
 public String getAddress()
 {
 	return address;
 }	
}

public class cTest27
{
 public static void main(String argv[])
 {
  System.out.println(Company.TAINAN.getName());
 }
}