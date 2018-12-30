import java.io.*;
public class SerOut{
	public static void main(String[] args)throws IOException{
		SerTest st=new SerTest("Yung",20);
		st.d.name="finy";
		System.out.println(st.d.name);

		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Test.ser"));
		oos.writeObject(st);
		//st.writeObject(oos);
		oos.close();
		
	}
}