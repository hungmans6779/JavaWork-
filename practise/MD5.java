import com.caucho.server.security.PasswordDigest;

public class MD5 
{
 public static void main(String argv[])
 {
  String username="hacker";
  String password="hacker";
  String realm = "resin";

  PasswordDigest passwordDigest = PasswordDigest();

  String digest = passwordDigest.getPasswordDigest(username, password, realm);
  System.out.println("±K½X¡G"+digest);
 }
}  