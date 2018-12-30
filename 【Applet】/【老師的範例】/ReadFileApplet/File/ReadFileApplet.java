import java.awt.*;
import java.applet.*;
import java.io.*;
import java.net.*;
public class ReadFileApplet extends Applet{
	private String filePath=null;	//要讀取的檔名及路徑
	private URL url=null;
	private BufferedReader br=null;
	private StringBuffer file=new StringBuffer();	//檔案內容

	public void init(){
		try{
			filePath=getParameter("FilePath");	//取得HTML檔參數
			url=new URL(getCodeBase() + "/" + filePath);	//建立連線
			br=new BufferedReader(new InputStreamReader(url.openStream()));	//建立讀檔物件
			while(true){
				String temp=br.readLine();
				if(temp==null)
					break;
				file.append(temp);
				file.append("\n");
				//以行為讀取單位,並加上換行符號
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