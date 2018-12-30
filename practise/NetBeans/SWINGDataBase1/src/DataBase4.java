import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class DataBase4 {
    static int x=0;
    static int y=0;
    Connection dbCon=null;
    Statement stmt=null;
    ResultSet rs=null;
    ResultSetMetaData rsmd=null;
    
    JButton [] button;
    JLabel [] label;
    JTextField [] tf;
    JTextField tfShowRow;
    JFrame frame;
    int cols=0; //記錄資料表內有幾個欄位值
    int totalRows=0; //記錄資料表共有幾筆資料
    boolean addNewData=true;
    int switchSearch=0;
    String rec="";
    String table="";
    
    //建構子
    public DataBase4(String driver_type,String dataBase,String table) {
        this.table=table;
        
        try {
            Class.forName(driver_type);
            dbCon=DriverManager.getConnection(dataBase);
            stmt=dbCon.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE); 
            
            rs=stmt.executeQuery("select * from "+table);
            rsmd=rs.getMetaData();
            cols=rsmd.getColumnCount();
      
            rs.last();
            totalRows=rs.getRow();
            rs.first();
           
            button=new JButton[9];
            label=new JLabel[cols];
            tf=new JTextField[cols];
            tfShowRow=new JTextField(6);
            tfShowRow.setHorizontalAlignment(JTextField.CENTER);

            String db="";
            
            //無聊做好玩的...（只是用來顯示目前是用哪個Driver來讀取資料庫）
            if(dataBase.indexOf("databaseName")!=-1) 
            {     
             String temp[]=dataBase.split(";");
             int dl=temp[1].length();
             db="透過SQLServer 驅動程式連結 ";
             db+=temp[1].substring(temp[1].indexOf("=")+1);
            }
            else
            {  
             db="透過ODBC 連結 ";
             db+=dataBase.substring(dataBase.lastIndexOf(":")+1);
            } 

            frame=new JFrame(db+" 資料庫內 \""+table+"\" 資料表所產生的視窗");

            frame.setLayout(new BorderLayout());            
            //frame.setLocation(200+500*(x%2),10+250*(y<2?0:1));
            frame.setLocation(200+500*(x%2),10+270*(y<2?0:(y<4?1:2)));
            x++;
            y++;
            frame.setSize(450,150+cols*20);
            
            frame.setResizable(false);
            
            //JPanel p1=new JPanel(new FlowLayout());
            JPanel p1=new JPanel(new GridLayout(2,5));
            
            JPanel p2=new JPanel(new BorderLayout());
            JPanel p21=new JPanel(new GridLayout(cols,1));
            JPanel p22=new JPanel(new GridLayout(cols,1));
            JPanel p23=new JPanel(new GridLayout(cols,1));
            
            JPanel p3=new JPanel(new GridLayout(2,5));
            for(int i=0;i<=4;i++,p3.add(new JLabel("")));
            
            //設定所有JButton設定值
            EventHandler eh=new EventHandler();
            //String caption[]={"|<","<",">",">|","新增","存檔","修改","刪除","查詢"};
            String caption[]={"第一頁","上一頁","下一頁","末頁","新增","存檔","修改","刪除","查詢"};
            for(int i=0;i<caption.length;i++) {
                button[i]=new JButton(caption[i]);
                button[i].setActionCommand(String.valueOf(i));
                button[i].addActionListener(eh);
                if(i==2)
                    p1.add(tfShowRow);
                if(i<=3)
                    p1.add(button[i]);
                else
                    p3.add(button[i]);
            }
            
            for(int i=0;i<=4;i++,p1.add(new JLabel("")));
            
            //設定所有JTextField元件的設定值
            for(int i=1;i<=cols;i++) {
                label[i-1]=new JLabel(rsmd.getColumnName(i)+" ： ");
                label[i-1].setHorizontalAlignment(JTextField.RIGHT);
                tf[i-1]=new JTextField();
                tf[i-1].setColumns(3);
                tf[i-1].setFont(new Font(Font.SERIF,Font.PLAIN,12));
                tf[i-1].setForeground(Color.BLUE);
                p21.add(label[i-1]);
                p22.add(tf[i-1]);
                p23.add(new JLabel("               "));
            }
            
            for(int i=0;i<cols;tf[i].setEditable(false),i++); //將所有顯示的欄位設定不能編輯
            
            p2.add(p21,BorderLayout.WEST);
            p2.add(p22,BorderLayout.CENTER);
            p2.add(p23,BorderLayout.EAST);
            
            frame.add(p1,BorderLayout.NORTH);
            frame.add(p2,BorderLayout.CENTER);
            frame.add(p3,BorderLayout.SOUTH);
            frame.addWindowListener(new WindowAdapter() {
                public  void  windowClosing(WindowEvent e) {
                    try {
                        rs.close();
                        stmt.close();
                        dbCon.close();
                        System.exit(0);
                        //frame.dispose();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            });
            disableButton(0,1,5); //將第一頁、上一頁及存檔按鈕除能
            showData();
            frame.setVisible(true);
            
        } catch (Exception ex) {
            System.out.println("發生例外的原因是："+ex.getMessage());
        }
    }
    
    
    //增加監聽器
    public class EventHandler implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            JButton b=(JButton)ae.getSource();
            int item=Integer.parseInt(b.getActionCommand());
            try {
                //0:第一頁；1:上一頁；2:下一頁；3:最後一頁；4:新增；5:存檔；6:修改；7:刪除
                switch(item) {
                    case 0://第一頁
                        rs.first();
                        showData();
                        if(switchSearch!=1)
                            disableButton(0,1,5); //將第一頁、上一頁及存檔按鈕除能
                        else
                            disableButton(0,1,4,5,6,7);
                        break;
                    case 1: //上一頁
                        if(!rs.isFirst()) {
                            rs.previous();
                            disableButton(5); //存檔按鈕除能
                            showData();
                        }
                        
                        // switchSearch==1 是表示目前狀態是在非查詢狀態下時
                        if(rs.getRow()==1 && switchSearch!=1)
                            disableButton(0,1,5); //將第一頁、上一頁及存檔按鈕除能
                        else if(rs.getRow()>1 && switchSearch!=1)
                            disableButton(5);  //將存檔按鈕除能
                        else if(rs.getRow()>1)
                            disableButton(4,5,6,7); //新增、存檔、修改、刪除按鈕除能
                        else
                            disableButton(0,1,4,5,6,7);  //第一頁、上一頁、新增、存檔、修改、刪除按鈕除能
                        
                        break;
                    case 2: //下一頁
                        if(!rs.isLast()) {
                            rs.next();
                            disableButton(5); //存檔按鈕除能
                            showData();
                        }
                        
                        // switchSearch==1 是表示目前狀態是在非查詢狀態下時
                        if(rs.getRow()==totalRows && switchSearch!=1)
                            disableButton(2,3,5); //將第一頁、上一頁及存檔按鈕除能
                        else if(rs.getRow()<totalRows && switchSearch!=1)
                            disableButton(5);  //將存檔按鈕除能
                        else if(rs.getRow()<totalRows)
                            disableButton(4,5,6,7);  //新增、存檔、修改、刪除按鈕除能
                        else
                            disableButton(2,3,4,5,6,7); //將下一頁、最後一頁、新增、存檔、修改、刪除按鈕除能
                        break;
                    case 3: //最後一頁
                        rs.last();
                        showData();
                        if(switchSearch!=1)
                            disableButton(2,3,5);  //將下一筆、最後一筆及存檔按鈕除能
                        else
                            disableButton(2,3,4,5,6,7);
                        break;
                    case 4:  //新增功能
                        disableTextField(0);
                        rec=tf[0].getText(); //記錄按下新增鈕時原先的學號欄位的記錄
                        for(int i=1;i<cols;tf[i].setText(""),i++);
                        rs.last();
                        tf[0].setText((Integer.parseInt(rs.getString(1))+1)+""); //將資料表中最一筆的學號欄位取出再加一
                        disableButton(0,1,2,3,4,6,7,8); //除了存檔按鈕致能外，其餘按鈕除能
                       
                        addNewData=true;
                        break;
                    case 5: //存檔功能
                        /*
                        for(int i=1;i<=cols;i++)
                            System.out.println(rsmd.getColumnClassName(i));
                         */
                        if(addNewData) //執行將新增的資料存檔
                        {
                            String sqlStr="insert into "+table+" values('";
                            for(int i=0;i<cols-1;sqlStr+=tf[i].getText()+"','",i++);
                            sqlStr+=tf[cols-1].getText()+"')";
                            
                            stmt.executeUpdate(sqlStr);
                            rs=stmt.executeQuery("select * from "+table);
                            rsmd=rs.getMetaData();
                            int count=0;
                            while(rs.next()) {
                                count++;
                                if(rec.equals(rs.getString(1)))
                                    break;
                            }
                            rs.absolute(count);
                            new JOptionPane().showMessageDialog(null,"\""+tf[0].getText()+"\" 資料新增成功...");
                            totalRows++;
                            if(count==1)
                                disableButton(0,1,5); //將第一頁、上一頁及存檔按鈕除能
                            else
                                disableButton(5); //將存檔按鈕除能
                            for(int i=0;i<cols;tf[i].setEditable(false),i++); //將所有顯示的欄位設定不能編輯
                            showData();
                        } else //執行將修改後的資料存檔
                        {
                            int recRow=rs.getRow();
                            
                            String sqlStr="update "+table+" set ";
                            for(int i=1;i<cols-1;sqlStr+=rsmd.getColumnName(i+1)+"='"+tf[i].getText()+"',",i++);
                            sqlStr+=rsmd.getColumnName(cols)+"='"+tf[cols-1].getText()+"'";
                            sqlStr+=" where "+rsmd.getColumnName(1)+"="+tf[0].getText();
                            
                            stmt.executeUpdate(sqlStr);
                            rs=stmt.executeQuery("select * from "+table);
                            rsmd=rs.getMetaData();
                            new JOptionPane().showMessageDialog(null,"\""+tf[0].getText()+"\" 資料修改成功...");
                            rs.absolute(recRow);
                            if(recRow==1)
                                disableButton(0,1,5); //將第一頁、上一頁及存檔按鈕除能
                            else if(recRow==totalRows)
                                disableButton(2,3,5);  //將下一筆、最後一筆及存檔按鈕除能
                            else
                                disableButton(5); //將存檔按鈕除能
                            
                            for(int i=0;i<cols;tf[i].setEditable(false),i++); //將所有顯示的欄位設定不能編輯
                            showData();
                        }
                        break;
                    case 6:  //修改資料功能
                        disableTextField(0);
                        disableButton(0,1,2,3,4,6,7); //除了存檔按鈕致能外，其餘按鈕除能
                        addNewData=false;
                        break;
                    case 7:  //刪除資料功能
                        int checkDelete=new JOptionPane().showConfirmDialog(null,"是否要刪除 \""+tf[1].getText()+"\" 的資料","資料刪除對話盒",JOptionPane.OK_CANCEL_OPTION);
                        switch(checkDelete) {
                            case 0: //確定刪除資料
                                String sqlStr="delete from "+table+" where "+rsmd.getColumnName(1)+"="+tf[0].getText();
                                int recRow=rs.getRow()-1; //記錄刪除資料時的上一筆資料筆數
                                stmt.executeUpdate(sqlStr);
                                rs=stmt.executeQuery("select * from "+table);
                                rsmd=rs.getMetaData();
                                if(recRow!=0) {
                                    rs.absolute(recRow);
                                    if(recRow==1)
                                        disableButton(0,1,5); //將第一頁、上一頁及存檔按鈕除能
                                } else
                                    rs.absolute(1);
                                totalRows--;
                                showData();
                                break;
                            case 2: //取消刪除資料
                                break;
                        }
                        break;
                    case 8: //查詢資料功能
                        switchSearch++;
                        
                        if(switchSearch%2==1)  //執行查詢的功能
                        {
                            button[8].setLabel("結束查詢");
                            //disableTextField(0,2,3);
                            String data=new JOptionPane().showInputDialog(null,"請輸入要查詢的姓名(採模糊搜尋)","資料查詢對話盒",JOptionPane.QUESTION_MESSAGE);
                            if(data.equals("")) //如果未輸入資料
                            {
                                new JOptionPane().showMessageDialog(null,"您未輸入要查詢的資料！！！");
                                button[8].setLabel("查詢");
                                switchSearch=0;
                            } else //執行資料查詢
                            {
                                String sqlStr="select * from "+table+" where "+rsmd.getColumnName(2)+" like '%"+data+"%'";
                                rs=stmt.executeQuery(sqlStr);
                                rsmd=rs.getMetaData();
                                
                                rs.last();
                                totalRows=rs.getRow();
                                if(totalRows>=1) {
                                    rs.first();
                                    if(totalRows>1)
                                        disableButton(0,1,4,5,6,7);
                                    else
                                        disableButton(0,1,2,3,4,5,6,7);
                                    showData();
                                } else {
                                    new JOptionPane().showMessageDialog(null,"抱歉！搜尋不到您輸入的資料");
                                    button[8].setLabel("查詢");
                                    switchSearch=0;
                                }
                            }
                            
                        } else //結束查詢的功能
                        {
                            button[8].setLabel("查詢");
                            //disableTextField(0,1,2,3);
                            String sqlStr="select * from "+table;
                            rs=stmt.executeQuery(sqlStr);
                            rsmd=rs.getMetaData();
                            rs.last();
                            totalRows=rs.getRow();
                            rs.first();
                            disableButton(0,1,5);
                            showData();
                        }
                        
                        break;
                } //switch 結尾
            } catch(NullPointerException e){
                button[8].setLabel("查詢");
                switchSearch=0;
            } catch(SQLException sqle) {
                sqle.printStackTrace();
            }
        } //actionPerformed方法結尾
    }
    
    //將資料表內的資料顯示出來
    public void showData() {
        try {
            tfShowRow.setText(rs.getRow()+" / "+totalRows);
            for(int i=1;i<=cols; tf[i-1].setText(rs.getString(i)),i++);
        } catch(SQLException sqle) {
            System.out.println("發生例外的原因是："+sqle.getMessage()); }
    }
    
    //將指定的button元件除能
    public void disableButton(int...b){
        for(int i=0;i<button.length;button[i].setEnabled(true),i++); //將所有的Button元件除能
        //將指定的元件致能
        for(int value:b)
            button[value].setEnabled(false);
    }
    
    public void disableTextField(int... t) {
        for(int i=0;i<cols;tf[i].setEditable(true),i++); //將所有顯示的欄位設定不能編輯
        //將指定的元件設定不能編輯
        for(int value:t)
            tf[value].setEditable(false);
    }
    
    public static void main(String argv[]) {
   
        //方式一：透過 ODBC 的Driver連接資料庫
        new DataBase4("sun.jdbc.odbc.JdbcOdbcDriver","jdbc:odbc:BigDatabase","飛狐工作室");
        
        
        //方式二：透過 SQLServer 2005 的Driver連接資料庫
         new DataBase4("com.microsoft.sqlserver.jdbc.SQLServerDriver","jdbc:sqlserver://localhost:1433;databaseName=MyDB;user=sa;password=123;","score");
         new DataBase4("com.microsoft.sqlserver.jdbc.SQLServerDriver","jdbc:sqlserver://localhost:1433;databaseName=MyDB;user=sa;password=123;","student");
        
        
        // new DataBase4("com.microsoft.sqlserver.jdbc.SQLServerDriver","jdbc:sqlserver://localhost:1433;databaseName=MyDB;user=sa;password=HUNG CHIA HUNG;","student");
         
    }
}
