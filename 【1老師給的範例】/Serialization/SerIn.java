import java.io.*;
public class SerIn{
	public static void main(String[] args)throws IOException,ClassNotFoundException{		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Test.ser"));
		SerTest st=(SerTest)ois.readObject();
		st.d=new Dog("finy");
		//SerTest st=new SerTest();
		//st=st.readObject(ois);
		System.out.println(st.name+ ":" + st.age + ":" + st.d.name);
		
	}
}