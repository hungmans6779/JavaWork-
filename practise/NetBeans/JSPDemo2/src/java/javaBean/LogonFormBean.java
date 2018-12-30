package javaBean;
import java.util.Hashtable;
public class LogonFormBean {
    private Hashtable errors=new Hashtable();
    private String name="";
    private String password="";
    
    public LogonFormBean() {
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean validate() {
        boolean result=true;
        if(name.equals("")) {
            errors.put("name","Please Input your name");
            result=false;
        }
        
        if(password.length()<6 || password.length()>10) {
            errors.put("password","Your Password length 6-10 characters");
            result=false;
        }
        return result;
    }
    
    public void setMsg(String err,String errMsg) {
        if(err.length()!=0 && errMsg.length()!=0) {
            errors.put(err,errMsg);  }
    }
    
    public String getMsg(String err) {
        return (String)errors.get(err);  }
    
}
