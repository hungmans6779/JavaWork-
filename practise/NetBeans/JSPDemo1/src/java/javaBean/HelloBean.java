package javaBean;

public class HelloBean {
    private String name="FirstBean";
    private int age;
   
    public HelloBean() {
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
