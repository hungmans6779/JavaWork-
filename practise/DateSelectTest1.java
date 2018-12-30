import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class DateSelect extends Panel
{
 private Date date; 
 public Choice chYear;
 public Choice chMonth;
 public Choice chDate;
 public DateSelect()
 {
  date=new Date();
  chYear=new Choice();
  chMonth=new Choice();
  chDate=new Choice();
 }
}