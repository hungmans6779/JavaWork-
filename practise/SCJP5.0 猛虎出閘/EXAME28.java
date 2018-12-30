class Car
{
 private int wheelCount;
 private String vin;
 public Car(String vin)
 {
  this.vin=vin;
  this.wheelCount;
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

public class EXAME28 extends Car
{
 public EXAME28(String vin)
 {
  this.wheelCount=3;
 }
}