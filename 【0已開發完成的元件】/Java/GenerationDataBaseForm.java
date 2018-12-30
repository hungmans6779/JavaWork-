import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class GenerationDataBaseForm {
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
    String rec="";
    String table="";
    
    //�غc�l
    public GenerationDataBaseForm(String driver_type,String dataBase,String table) {
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
            button=new JButton[8];
            label=new JLabel[cols];
            tf=new JTextField[cols];
            tfShowRow=new JTextField(6);
            tfShowRow.setHorizontalAlignment(JTextField.CENTER);
            String db=dataBase.substring(dataBase.lastIndexOf(":")+1);
            frame=new JFrame(db+" ��Ʈw�� \""+table+"\" ��ƪ�Ҳ��ͪ�����");
            
            frame.setLayout(new GridLayout(3,1));
            frame.setLocation(500,100);
            frame.setSize(380,180+cols*30);
            frame.setResizable(false);
            
            JPanel p1=new JPanel(new FlowLayout());
            
            JPanel p2=new JPanel(new BorderLayout());
            JPanel p21=new JPanel(new GridLayout(cols,1));
            JPanel p22=new JPanel(new GridLayout(cols,1));
            JPanel p23=new JPanel(new GridLayout(cols,1));
            
            JPanel p3=new JPanel(new GridLayout(2,4));
            for(int i=0;i<=3;i++,p3.add(new JLabel("")));
            
            //�]�w�Ҧ�JButton�]�w��
            EventHandler eh=new EventHandler();
            String caption[]={"|<","<",">",">|","�s�W","�s��","�ק�","�R��"};
            for(int i=0;i<8;i++) {
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
            
            //�]�w�Ҧ�JTextField���󪺳]�w��
            for(int i=1;i<=cols;i++) {
                label[i-1]=new JLabel(rsmd.getColumnName(i)+" �G ");
                label[i-1].setHorizontalAlignment(JTextField.RIGHT);
                tf[i-1]=new JTextField();
                tf[i-1].setColumns(3);
                p21.add(label[i-1]);
                p22.add(tf[i-1]);
                p23.add(new JLabel("               "));
            }
            
            for(int i=0;i<cols;tf[i].setEditable(false),i++); //�N�Ҧ���ܪ����]�w����s��
            
            p2.add(p21,BorderLayout.WEST);
            p2.add(p22,BorderLayout.CENTER);
            p2.add(p23,BorderLayout.EAST);
            
            frame.add(p1);
            frame.add(p2);
            frame.add(p3);
            frame.addWindowListener(new WindowAdapter() {
                public  void  windowClosing(WindowEvent e) {
                    try {
                        rs.close();
                        stmt.close();
                        dbCon.close();
                        System.exit(0);
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
                        disableButton(0,1,5); //�N�Ĥ@���B�W�@���Φs�ɫ��s����
                        break;
                    case 1: //�W�@��
                        if(!rs.isFirst()) {
                            rs.previous();
                            disableButton(5); //�s�ɫ��s����
                            showData();
                        }
                        if(rs.getRow()==1)
                            disableButton(0,1,5); //�N�Ĥ@���B�W�@���Φs�ɫ��s����
                        break;
                    case 2: //�U�@��
                        if(!rs.isLast()) {
                            rs.next();
                            disableButton(5); //�s�ɫ��s����
                            showData();
                        }
                        if(rs.getRow()==totalRows)
                            disableButton(2,3,5); //�N�U�@���B�̫�@���Φs�ɫ��s����
                        break;
                    case 3: //�̫�@��
                        rs.last();
                        showData();
                        disableButton(2,3,5);  //�N�U�@���B�̫�@���Φs�ɫ��s����
                        break;
                    case 4:  //�s�W�\��
                        disableTextField(0);
                        rec=tf[0].getText(); //�O�����U�s�W�s�ɭ�����Ǹ���쪺�O��
                        for(int i=1;i<cols;tf[i].setText(""),i++);
                        rs.last();
                        tf[0].setText((Integer.parseInt(rs.getString(1))+1)+""); //�N��ƪ��̤@�����Ǹ������X�A�[�@
                        disableButton(0,1,2,3,4,6,7); //���F�s�ɫ��s�P��~�A��l���s����
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
                            System.out.println(count);
                            rs.absolute(count);
                            new JOptionPane().showMessageDialog(null,"\""+tf[0].getText()+"\" ��Ʒs�W���\...");
                            totalRows++;
                            if(count==1)
                                disableButton(0,1,5); //�N�Ĥ@���B�W�@���Φs�ɫ��s����
                            else
                                disableButton(5); //�N�s�ɫ��s����
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
                } //switch ����
            } catch(SQLException sqle) {
                sqle.printStackTrace();
            }
        } //actionPerformed��k����
    }
    
    public void showData() {
        try {
            tfShowRow.setText(rs.getRow()+" / "+totalRows);
            for(int i=1;i<=cols;i++)
                tf[i-1].setText(rs.getString(i));
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
        for(int value:t)
            tf[value].setEditable(false);
    }
    
    public static void main(String argv[]) {
        new GenerationDataBaseForm("sun.jdbc.odbc.JdbcOdbcDriver","jdbc:odbc:Access_MyDB","student");
        // new GenerationDataBaseForm("sun.jdbc.odbc.JdbcOdbcDriver","jdbc:odbc:SQL_MyDB","score");
        // new GenerationDataBaseForm("sun.jdbc.odbc.JdbcOdbcDriver","jdbc:odbc:AllData_db","eatMenu");
    }
    
}
