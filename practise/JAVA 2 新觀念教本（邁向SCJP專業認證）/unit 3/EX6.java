class EX6
{
 public static void main(String argv[])
 {
  char level=65;
  System.out.println(level>=60?"���H�A�z�L�F�I":"�S�L�A�z�n�[�o��I");
  level=level<60?'�B':level;
  level=level<70?'��':level;
  level=level<80?'�A':level;
  level=level<90?'��':level;
  level=level<=100?'�u':level;
  System.out.println("�z�����Z�O : "+level);
 }
}