import java.io.*;
public class SerTest implements Serializable{
	String name;
	int age;
	Dog d=new Dog("Jime");
	public SerTest(){
		this("Guest",18);
	}
	public SerTest(String name,int age){
		this.name=name;
		this.age=age;
	}
	public SerTest readObject(ObjectInputStream ois){
		SerTest st=(SerTest)ois.readObject();
		st.d=new Dog("Jime");
		return st;
	}
	public void writeObject(ObjectOutputStream oos){
		oos.writeBtyes(name);
		oos.writeInt(age);
	}
}
class Dog{
	String name;
	Dog(String name){
		this.name=name;
	}
}