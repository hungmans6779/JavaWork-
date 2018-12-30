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
    int cols=0; //�O����ƪ����X������
    int totalRows=0; //�O����ƪ�@���X�����
    boolean addNewData=true;
    int switchSearch=0;
    String rec="";
    String table="";
    
    //�غc�l
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
            
            //�L�ᰵ�n����...�]�u�O�Ψ���ܥثe�O�έ���Driver��Ū����Ʈw�^
            if(dataBase.indexOf("databaseName")!=-1) 
            {     
             String temp[]=dataBase.split(";");
             int dl=temp[1].length();
             db="�z�LSQLServer �X�ʵ{���s�� ";
             db+=temp[1].substring(temp[1].indexOf("=")+1);
            }
            else
            {  
             db="�z�LODBC �s�� ";
             db+=dataBase.substring(dataBase.lastIndexOf(":")+1);
            } 

            frame=new JFrame(db+" ��Ʈw�� \""+table+"\" ��ƪ�Ҳ��ͪ�����");

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
            
            //�]�w�Ҧ�JButton�]�w��
            EventHandler eh=new EventHandler();
            //String caption[]={"|<","<",">",">|","�s�W","�s��","�ק�","�R��","�d��"};
            String caption[]={"�Ĥ@��","�W�@��","�U�@��","����","�s�W","�s��","�ק�","�R��","�d��"};
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
            
            //�]�w�Ҧ�JTextField���󪺳]�w��
            for(int i=1;i<=cols;i++) {
                label[i-1]=new JLabel(rsmd.getColumnName(i)+" �G ");
                label[i-1].setHorizontalAlignment(JTextField.RIGHT);
                tf[i-1]=new JTextField();
                tf[i-1].setColumns(3);
                tf[i-1].setFont(new Font(Font.SERIF,Font.PLAIN,12));
                tf[i-1].setForeground(Color.BLUE);
                p21.add(label[i-1]);
                p22.add(tf[i-1]);
                p23.add(new JLabel("               "));
            }
            
            for(int i=0;i<cols;tf[i].setEditable(false),i++); //�N�Ҧ���ܪ����]�w����s��
            
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
            disableButton(0,1,5); //�N�Ĥ@���B�W�@���Φs�ɫ��s����
            showData();
            frame.setVisible(true);
            
        } catch (Exception ex) {
            System.out.println("�o�ͨҥ~����]�O�G"+ex.getMessage());
        }
    }
    
    
    //�W�[��ť��
    public class EventHandler implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            JButton b=(JButton)ae.getSource();
            int item=Integer.parseInt(b.getActionCommand());
            try {
                //0:�Ĥ@���F1:�W�@���F2:�U�@���F3:�̫�@���F4:�s�W�F5:�s�ɡF6:�ק�F7:�R��
                switch(item) {
                    case 0://�Ĥ@��
                        rs.first();
                        showData();
                        if(switchSearch!=1)
                            disableButton(0,1,5); //�N�Ĥ@���B�W�@���Φs�ɫ��s����
                        else
                            disableButton(0,1,4,5,6,7);
                        break;
                    case 1: //�W�@��
                        if(!rs.isFirst()) {
                            rs.previous();
                            disableButton(5); //�s�ɫ��s����
                            showData();
                        }
                        
                        // switchSearch==1 �O��ܥثe���A�O�b�D�d�ߪ��A�U��
                        if(rs.getRow()==1 && switchSearch!=1)
                            disableButton(0,1,5); //�N�Ĥ@���B�W�@���Φs�ɫ��s����
                        else if(rs.getRow()>1 && switchSearch!=1)
                            disableButton(5);  //�N�s�ɫ��s����
                        else if(rs.getRow()>1)
                            disableButton(4,5,6,7); //�s�W�B�s�ɡB�ק�B�R�����s����
                        else
                            disableButton(0,1,4,5,6,7);  //�Ĥ@���B�W�@���B�s�W�B�s�ɡB�ק�B�R�����s����
                        
                        break;
                    case 2: //�U�@��
                        if(!rs.isLast()) {
                            rs.next();
                            disableButton(5); //�s�ɫ��s����
                            showData();
                        }
                        
                        // switchSearch==1 �O��ܥثe���A�O�b�D�d�ߪ��A�U��
                        if(rs.getRow()==totalRows && switchSearch!=1)
                            disableButton(2,3,5); //�N�Ĥ@���B�W�@���Φs�ɫ��s����
                        else if(rs.getRow()<totalRows && switchSearch!=1)
                            disableButton(5);  //�N�s�ɫ��s����
                        else if(rs.getRow()<totalRows)
                            disableButton(4,5,6,7);  //�s�W�B�s�ɡB�ק�B�R�����s����
                        else
                            disableButton(2,3,4,5,6,7); //�N�U�@���B�̫�@���B�s�W�B�s�ɡB�ק�B�R�����s����
                        break;
                    case 3: //�̫�@��
                        rs.last();
                        showData();
                        if(switchSearch!=1)
                            disableButton(2,3,5);  //�N�U�@���B�̫�@���Φs�ɫ��s����
                        else
                            disableButton(2,3,4,5,6,7);
                        break;
                    case 4:  //�s�W�\��
                        disableTextField(0);
                        rec=tf[0].getText(); //�O�����U�s�W�s�ɭ�����Ǹ���쪺�O��
                        for(int i=1;i<cols;tf[i].setText(""),i++);
                        rs.last();
                        tf[0].setText((Integer.parseInt(rs.getString(1))+1)+""); //�N��ƪ��̤@�����Ǹ������X�A�[�@
                        disableButton(0,1,2,3,4,6,7,8); //���F�s�ɫ��s�P��~�A��l���s����
                       
                        addNewData=true;
                        break;
                    case 5: //�s�ɥ\��
                        /*
                        for(int i=1;i<=cols;i++)
                            System.out.println(rsmd.getColumnClassName(i));
                         */
                        if(addNewData) //����N�s�W����Ʀs��
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
                            new JOptionPane().showMessageDialog(null,"\""+tf[0].getText()+"\" ��Ʒs�W���\...");
                            totalRows++;
                            if(count==1)
                                disableButton(0,1,5); //�N�Ĥ@���B�W�@���Φs�ɫ��s����
                            else
                                disableButton(5); //�N�s�ɫ��s����
                            for(int i=0;i<cols;tf[i].setEditable(false),i++); //�N�Ҧ���ܪ����]�w����s��
                            showData();
                        } else //����N�ק�᪺��Ʀs��
                        {
                            int recRow=rs.getRow();
                            
                            String sqlStr="update "+table+" set ";
                            for(int i=1;i<cols-1;sqlStr+=rsmd.getColumnName(i+1)+"='"+tf[i].getText()+"',",i++);
                            sqlStr+=rsmd.getColumnName(cols)+"='"+tf[cols-1].getText()+"'";
                            sqlStr+=" where "+rsmd.getColumnName(1)+"="+tf[0].getText();
                            
                            stmt.executeUpdate(sqlStr);
                            rs=stmt.executeQuery("select * from "+table);
                            rsmd=rs.getMetaData();
                            new JOptionPane().showMessageDialog(null,"\""+tf[0].getText()+"\" ��ƭק令�\...");
                            rs.absolute(recRow);
                            if(recRow==1)
                                disableButton(0,1,5); //�N�Ĥ@���B�W�@���Φs�ɫ��s����
                            else if(recRow==totalRows)
                                disableButton(2,3,5);  //�N�U�@���B�̫�@���Φs�ɫ��s����
                            else
                                disableButton(5); //�N�s�ɫ��s����
                            
                            for(int i=0;i<cols;tf[i].setEditable(false),i++); //�N�Ҧ���ܪ����]�w����s��
                            showData();
                        }
                        break;
                    case 6:  //�ק��ƥ\��
                        disableTextField(0);
                        disableButton(0,1,2,3,4,6,7); //���F�s�ɫ��s�P��~�A��l���s����
                        addNewData=false;
                        break;
                    case 7:  //�R����ƥ\��
                        int checkDelete=new JOptionPane().showConfirmDialog(null,"�O�_�n�R�� \""+tf[1].getText()+"\" �����","��ƧR����ܲ�",JOptionPane.OK_CANCEL_OPTION);
                        switch(checkDelete) {
                            case 0: //�T�w�R�����
                                String sqlStr="delete from "+table+" where "+rsmd.getColumnName(1)+"="+tf[0].getText();
                                int recRow=rs.getRow()-1; //�O���R����Ʈɪ��W�@����Ƶ���
                                stmt.executeUpdate(sqlStr);
                                rs=stmt.executeQuery("select * from "+table);
                                rsmd=rs.getMetaData();
                                if(recRow!=0) {
                                    rs.absolute(recRow);
                                    if(recRow==1)
                                        disableButton(0,1,5); //�N�Ĥ@���B�W�@���Φs�ɫ��s����
                                } else
                                    rs.absolute(1);
                                totalRows--;
                                showData();
                                break;
                            case 2: //�����R�����
                                break;
                        }
                        break;
                    case 8: //�d�߸�ƥ\��
                        switchSearch++;
                        
                        if(switchSearch%2==1)  //����d�ߪ��\��
                        {
                            button[8].setLabel("�����d��");
                            //disableTextField(0,2,3);
                            String data=new JOptionPane().showInputDialog(null,"�п�J�n�d�ߪ��m�W(�ļҽk�j�M)","��Ƭd�߹�ܲ�",JOptionPane.QUESTION_MESSAGE);
                            if(data.equals("")) //�p�G����J���
                            {
                                new JOptionPane().showMessageDialog(null,"�z����J�n�d�ߪ���ơI�I�I");
                                button[8].setLabel("�d��");
                                switchSearch=0;
                            } else //�����Ƭd��
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
                                    new JOptionPane().showMessageDialog(null,"��p�I�j�M����z��J�����");
                                    button[8].setLabel("�d��");
                                    switchSearch=0;
                                }
                            }
                            
                        } else //�����d�ߪ��\��
                        {
                            button[8].setLabel("�d��");
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
                } //switch ����
            } catch(NullPointerException e){
                button[8].setLabel("�d��");
                switchSearch=0;
            } catch(SQLException sqle) {
                sqle.printStackTrace();
            }
        } //actionPerformed��k����
    }
    
    //�N��ƪ��������ܥX��
    public void showData() {
        try {
            tfShowRow.setText(rs.getRow()+" / "+totalRows);
            for(int i=1;i<=cols; tf[i-1].setText(rs.getString(i)),i++);
        } catch(SQLException sqle) {
            System.out.println("�o�ͨҥ~����]�O�G"+sqle.getMessage()); }
    }
    
    //�N���w��button���󰣯�
    public void disableButton(int...b){
        for(int i=0;i<button.length;button[i].setEnabled(true),i++); //�N�Ҧ���Button���󰣯�
        //�N���w������P��
        for(int value:b)
            button[value].setEnabled(false);
    }
    
    public void disableTextField(int... t) {
        for(int i=0;i<cols;tf[i].setEditable(true),i++); //�N�Ҧ���ܪ����]�w����s��
        //�N���w������]�w����s��
        for(int value:t)
            tf[value].setEditable(false);
    }
    
    public static void main(String argv[]) {
   
        //�覡�@�G�z�L ODBC ��Driver�s����Ʈw
        new DataBase4("sun.jdbc.odbc.JdbcOdbcDriver","jdbc:odbc:BigDatabase","�����u�@��");
        
        
        //�覡�G�G�z�L SQLServer 2005 ��Driver�s����Ʈw
         new DataBase4("com.microsoft.sqlserver.jdbc.SQLServerDriver","jdbc:sqlserver://localhost:1433;databaseName=MyDB;user=sa;password=123;","score");
         new DataBase4("com.microsoft.sqlserver.jdbc.SQLServerDriver","jdbc:sqlserver://localhost:1433;databaseName=MyDB;user=sa;password=123;","student");
        
        
        // new DataBase4("com.microsoft.sqlserver.jdbc.SQLServerDriver","jdbc:sqlserver://localhost:1433;databaseName=MyDB;user=sa;password=HUNG CHIA HUNG;","student");
         
    }
}
