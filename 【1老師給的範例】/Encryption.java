public class Encryption{
	public static String encryption(String value){
		StringBuffer sb=new StringBuffer(value);
		if(value.length()>2)
			sb.insert(1,'y');
		if(value.length()>4)
			sb.insert(3,'u');
		if(value.length()>6)
			sb.insert(5,'n');
		if(value.length()>8)
			sb.insert(7,'g');

		byte[] array=sb.toString().getBytes();
		for(int a=0;a<array.length;a++){
			array[a]^=5;
		}
		return new String(array);
	}
	public static String unEncryption(String value){
		byte[] array=value.getBytes();
		for(int a=0;a<array.length;a++){
			array[a]^=5;
		}
		value=new String(array);
		StringBuffer sb=new StringBuffer(value);

		if(value.length()-4>8){
			if(value.charAt(7)=='g'){
				sb.deleteCharAt(7);
			}else{
				return null;
			}
		}
		if(value.length()-3>6){
			if(value.charAt(5)=='n'){
				sb.deleteCharAt(5);
			}else{
				return null;
			}
		}
		if(value.length()-2>4){
			if(value.charAt(3)=='u'){
				sb.deleteCharAt(3);
			}else{
				return null;
			}
		}
		if(value.length()-1>2){
			if(value.charAt(1)=='y'){
				sb.deleteCharAt(1);
			}else{
				return null;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args){
		String s="Hsu YuYung";
		String s2=encryption(s);
		System.out.println(s2);
		System.out.println(unEncryption(s2));
	}
}