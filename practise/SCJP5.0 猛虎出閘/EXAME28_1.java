class Car
{
 protected int wheelCount;
 private String vin;
 public Car(String vin)
 {
  this.vin=vin;
  this.wheelCount=4;
 }
 public String drive()
 {
  return "zoom-zoom";
 }
 public String getInfo()
 {
  return "VIN : "+vin+"wheels:"+wheelCount;
 }
}

public class EXAME28_1 extends Car
{
 public EXAME28_1(String vin)
 {
 	super(vin);
  this.wheelCount=3;
 }
 public static void main(String argv[])
 {
 	new EXAME28_1("2");
 }	
}