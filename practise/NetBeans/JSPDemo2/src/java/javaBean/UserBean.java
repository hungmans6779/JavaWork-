package javaBean;
public class UserBean
{
 private String name;
 private String password;
 private String email;
 
 public void setName(String name)
 { this.name=name; }
 public String getName()
 { return name; }
 
 public void setPassword(String password)
 { this.password=password; }
 public String getPassword()
 { return password; }
 

 public void setEmail(String email)
 { this.email=email; }
 public String getEmail()
 { return email; }
 
 public boolean validatePassword(String password)
 {
  if(this.password.equals(password))
  { return true;   }
  return false;
 }
}