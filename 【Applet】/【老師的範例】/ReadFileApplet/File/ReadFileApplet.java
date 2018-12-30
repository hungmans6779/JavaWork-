import java.awt.*;
import java.applet.*;
import java.io.*;
import java.net.*;
public class ReadFileApplet extends Applet{
	private String filePath=null;	//�nŪ�����ɦW�θ��|
	private URL url=null;
	private BufferedReader br=null;
	private StringBuffer file=new StringBuffer();	//�ɮפ��e

	public void init(){
		try{
			filePath=getParameter("FilePath");	//���oHTML�ɰѼ�
			url=new URL(getCodeBase() + "/" + filePath);	//�إ߳s�u
			br=new BufferedReader(new InputStreamReader(url.openStream()));	//�إ�Ū�ɪ���
			while(true){
				String temp=br.readLine();
				if(temp==null)
					break;
				file.append(temp);
				file.append("\n");
				//�H�欰Ū�����,�å[�W����Ÿ�
			}
		}catch(FileNotFoundException e){
			file.append(e.getMessage());
		}catch(MalformedURLException e){
			file.append(e.getMessage());
		}catch(IOException e){
			file.append(e.getMessage());
		}catch(Exception e){
			file.append(e.getMessage());
		}finally{
			try{
				br.close();
			}catch(IOException e){
				file.append(e.getMessage());
			}
		}
	}
	public void paint(Graphics g){
		g.setFont(new Font(null,0,16));
		String[] s=file.toString().split("\n");
		for(int a=1;a<=s.length;a++){
			g.drawString(s[a-1],10,a*20);
		}
	}
}