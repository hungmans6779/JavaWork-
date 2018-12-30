import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class DataBase2 extends javax.swing.JFrame {
    int count=1;
    int total=0;
    int rec=0;
    boolean updataCheck=false;
    
    Connection dbCon=null;
    Statement stmt=null;
    ResultSet rs=null;
    ResultSetMetaData rsmd=null;
    public DataBase2() {
        initComponents();
        HandlerEvent he=new HandlerEvent();
        setLocation(500,150);
        first.setActionCommand("1");
        previous.setActionCommand("2");
        next.setActionCommand("3");
        last.setActionCommand("4");
        first.addActionListener(he);
        previous.addActionListener(he);
        next.addActionListener(he);
        last.addActionListener(he);
        first.setEnabled(false);
        previous.setEnabled(false);
        
        
        addData.setActionCommand("5");
        addData.addActionListener(he);
        saveData.setActionCommand("6");
        saveData.addActionListener(he);
        updateData.setActionCommand("7");
        updateData.addActionListener(he);
        deleteData.setActionCommand("8");
        deleteData.addActionListener(he);
        
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            dbCon=DriverManager.getConnection("jdbc:odbc:Access_MyDB");
            stmt=dbCon.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs=stmt.executeQuery("select * from Score");
            rs.last();
            total=rs.getRow();
            rs.first();
            //tfShowCount.setText(String.valueOf(1)+" /  "+total);
            tfShowCount.setText(rs.getRow()+" / "+total);
            tfMember.setText(rs.getString("studno"));
            tfName.setText(rs.getString("name"));
            tfID.setText(rs.getString("examno"));
            tfChi.setText(rs.getString("chi"));
            tfEng.setText(rs.getString("eng"));
            tfMath.setText(rs.getString("math"));
            checkButton();
        } catch(Exception e) {
            System.out.println("�o�ͨҥ~����]�G"+e.getMessage());
        }
    }
    
    public class HandlerEvent implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton b=(JButton)e.getSource();
            int selectItem=Integer.parseInt(b.getActionCommand());
            try {
                switch(selectItem) {
                    case 1:  // ����Ĥ@�����
                        rs.first();
                        count=1;
                        showData();
                        checkButton();
                        break;
                    case 2: //����W�@�����
                        if(!rs.isFirst()) {
                            rs.previous();
                            count--;
                            showData();
                            checkButton();
                        } else {
                            JOptionPane.showMessageDialog(null,"�o�O�Ĥ@���O���I�I�I");
                        }
                        break;
                    case 3: //����U�@�����
                        if(!rs.isLast()) {
                            rs.next();
                            count++;
                            showData();
                            checkButton();
                        }
                        break;
                    case 4: //����̫�@��
                        rs.last();
                        count=total;
                        showData();
                        checkButton();
                        break;
                    case 5: //�s�W�@�����
                        updataCheck=false;
                        try {
                            rec=Integer.parseInt(tfMember.getText());
                            rs.last();
                        } // �O�����������ܪ��Ǹ�
                        catch(NumberFormatException nfe) {
                            rec=850301; } finally {
                                first.setEnabled(false);
                                previous.setEnabled(false);
                                next.setEnabled(false);
                                last.setEnabled(false);
                            }
                            
                            int newMember=0;
                            try {
                                newMember=Integer.parseInt(rs.getString("studno"))+1; } catch(Exception nfe) {
                                    newMember=850301; }
                            tfMember.setText(String.valueOf(newMember));
                            tfName.setText("");
                            tfID.setText("");
                            tfChi.setText("");
                            tfEng.setText("");
                            tfMath.setText("");
                            tfName.setEditable(true);
                            tfID.setEditable(true);
                            tfChi.setEditable(true);
                            tfEng.setEditable(true);
                            tfMath.setEditable(true);
                            saveData.setEnabled(true);
                            addData.setEnabled(false);
                            updateData.setEnabled(false);
                            deleteData.setEnabled(false);
                            break;
                    case 6: //��Ʀs��
                        int studno=Integer.parseInt(tfMember.getText());
                        String name=tfName.getText();
                        String sqlStr="";
                        tfName.setForeground(Color.BLACK);
                        tfID.setForeground(Color.BLACK);
                        tfChi.setForeground(Color.BLACK);
                        tfEng.setForeground(Color.BLACK);
                        tfMath.setForeground(Color.BLACK);
                        tfName.setBackground(Color.WHITE);
                        tfID.setBackground(Color.WHITE);
                        tfChi.setBackground(Color.WHITE);
                        tfEng.setBackground(Color.WHITE);
                        tfMath.setBackground(Color.WHITE);
                        if(  tfName.getText().equals("") ||  tfID.getText().equals("") ||  tfChi.getText().equals("") ||  tfEng.getText().equals("")  || tfMath.getText().equals("") ) {
                            String errorMessage1="";
                            if(tfName.getText().equals("")) {
                                errorMessage1+="�i�m�W�j";
                                tfName.setBackground(Color.YELLOW);
                            }
                            if(tfID.getText().equals("")) {
                                errorMessage1+="�i��ҥN���j";
                                tfID.setBackground(Color.YELLOW);
                            }
                            if(tfChi.getText().equals("")) {
                                errorMessage1+="�i��妨�Z�j";
                                tfChi.setBackground(Color.YELLOW);
                            }
                            if(tfEng.getText().equals("")) {
                                errorMessage1+="�i�^�妨�Z�j";
                                tfEng.setBackground(Color.YELLOW);
                            }
                            if(tfMath.getText().equals("")) {
                                errorMessage1+="�i�ƾǦ��Z�j";
                                tfMath.setBackground(Color.YELLOW);
                            }
                            
                            JOptionPane.showMessageDialog(null,errorMessage1+" ��줣�o���ť�");  
                        } else if( !tfName.getText().matches("[^0-9a-zA-Z]*") || !tfID.getText().matches("\\d*") || !tfChi.getText().matches("\\d*") || !tfEng.getText().matches("\\d*") || !tfMath.getText().matches("\\d*")) {
                            String errorMessage="";
                            if( !tfName.getText().matches("[^0-9a-zA-Z]*"))
                            {
                               tfName.setForeground(Color.RED);
                               errorMessage+="�i�m�W�j"; 
                            }
                            
                            if(!tfID.getText().matches("\\d*")) {
                                tfID.setForeground(Color.RED);
                                errorMessage+="�i��ҥN���j";
                            }
                            if(!tfChi.getText().matches("\\d*")) {
                                tfChi.setForeground(Color.RED);
                                errorMessage+="�i��妨�Z�j";
                            }
                            if(!tfEng.getText().matches("\\d*")) {
                                tfEng.setForeground(Color.RED);
                                errorMessage+="�i�^�妨�Z�j";
                            }
                            if(!tfMath.getText().matches("\\d*")) {
                                tfMath.setForeground(Color.RED);
                                errorMessage+="�i�ƾǦ��Z�j";
                            }
                            new JOptionPane().showMessageDialog(null,errorMessage+"�榡���šA�п�J�Ʀr���A����ơI�I�I");
                        } else {
                            int examno=Integer.parseInt(tfID.getText());
                            int chi=Integer.parseInt(tfChi.getText());
                            int eng=Integer.parseInt(tfEng.getText());
                            int math=Integer.parseInt(tfMath.getText());
                            if((examno <0 || examno>255) || (chi <0 || chi>100) || (eng <0 || eng>100) || (math <0 || math>100)) {
                                String errorMessage="";
                                String errorMessage1="";
                                if(examno <0 || examno>255) {
                                    errorMessage1=",�i��ҥN���j���ȶ��b1-255�d��";
                                    tfID.requestFocus();
                                    tfID.setForeground(Color.RED);
                                }
                                
                                if(chi <0 || chi>100) {
                                    errorMessage+="�i��妨�Z�j";
                                    tfChi.requestFocus();
                                    tfChi.setForeground(Color.RED);
                                }
                                
                                if(eng <0 || eng>100) {
                                    ;
                                    errorMessage+="�i�^�妨�Z�j";
                                    tfEng.requestFocus();
                                    tfEng.setForeground(Color.RED);
                                }
                                if(math <0 || math>100) {
                                    
                                    errorMessage+="�i�ƾǦ��Z�j";
                                    tfMath.requestFocus();
                                    tfMath.setForeground(Color.RED);
                                }
                                new JOptionPane().showMessageDialog(null,errorMessage+"���b0��100���d�򤺡I�I�I"+errorMessage1);
                            } else {
                                //�s�W���
                                if(!updataCheck) {
                                    sqlStr="insert into score values("+studno+",'"+name+"',"+examno+","+chi+","+eng+","+math+")";
                                    stmt.executeUpdate(sqlStr);
                                    JOptionPane.showMessageDialog(null,"�ӵ� \""+name+"\" ��Ʒs�W���\");
                                    total++;
                                }
                                //��s���
                                else {
                                    sqlStr="update score set examno="+examno+",chi="+chi+",eng="+eng+",math="+math+" where studno="+studno;
                                    stmt.executeUpdate(sqlStr);
                                    JOptionPane.showMessageDialog(null,"�ӵ� \""+name+"\" ��ƭק令�\");
                                }
                                saveData.setEnabled(false);
                                addData.setEnabled(true);
                                updateData.setEnabled(true);
                                deleteData.setEnabled(true);
                                rs=stmt.executeQuery("select * from score");
                                //�j�M�����U�s�W�s���e������ܪ����
                                rs.first();
                                for(int i=1;i<total;i++) {
                                    rs.next();
                                    if(rec==Integer.parseInt(rs.getString("studno"))) {
                                        count=i+1;
                                        break;
                                    }
                                }
                                if(count!=0)
                                {    
                                 rs.absolute(count); //�^��ϥΪ̭�����ӵ��O��
                                  checkButton();
                                }
                                 showData();
                               
                            }
                        }
                        break;
                    case 7:  //�N�ӵ���ƭק�
                        updataCheck=true;
                        rec=Integer.parseInt(tfMember.getText());  // �O�����������ܪ��Ǹ�
                        tfID.setEditable(true);
                        tfChi.setEditable(true);
                        tfEng.setEditable(true);
                        tfMath.setEditable(true);
                        addData.setEnabled(false);
                        updateData.setEnabled(false);
                        deleteData.setEnabled(false);
                        saveData.setEnabled(true);
                        
                        first.setEnabled(false);
                        previous.setEnabled(false);
                        next.setEnabled(false);
                        last.setEnabled(false);
                        break;
                    case 8:  //�N�ӵ���ƧR��
                        JOptionPane k=new JOptionPane();
                        int currentCount=rs.getRow();
                        int i=k.showConfirmDialog(null,"�T�w�O�_�n�R�� \""+tfName.getText()+" \" �����","��ƧR����ܲ�",JOptionPane.OK_CANCEL_OPTION);
                        studno=Integer.parseInt(tfMember.getText());
                        switch(i) {
                            //�T�{�R���ӵ����
                            case 0:
                                sqlStr="delete from score where studno="+studno;
                                stmt.executeUpdate(sqlStr);
                                rs=stmt.executeQuery("select * from score");
                                rs.last();
                                total=rs.getRow();
                                rs.first();
                                count=currentCount;
                                count--;
                                
                                if(currentCount>=2) {
                                    rs.absolute(currentCount-1);
                                    showData();
                                } else if(count==0 && currentCount==1 && total==0)//��ܨS����ƤF
                                {
                                    tfMember.setText("");
                                    tfName.setText("");
                                    tfID.setText("");
                                    tfChi.setText("");
                                    tfEng.setText("");
                                    tfMath.setText("");
                                    tfShowCount.setText("");
                                } else {
                                    count=1;
                                    rs.absolute(1);
                                    showData();
                                }
                                
                                checkButton();
                                break;
                                //�����R���ӵ����
                            case 2:
                                break;
                        }
                        break;
                }
            } catch(SQLException sqle) {
                System.out.println("�o�ͨҥ~����]�O�G");
                sqle.printStackTrace();
            }
            
        }
    }
    
    public void showData() {
        try {
            tfShowCount.setText(String.valueOf(rs.getRow())+" /  "+total);
            tfMember.setText(rs.getString("studno"));
            tfName.setText(rs.getString("name"));
            tfID.setText(rs.getString("examno"));
            tfChi.setText(rs.getString("chi"));
            tfEng.setText(rs.getString("eng"));
            tfMath.setText(rs.getString("math"));
            tfName.setEditable(false);
            tfID.setEditable(false);
            tfChi.setEditable(false);
            tfEng.setEditable(false);
            tfMath.setEditable(false);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void checkButton() {
        first.setEnabled(false);
        previous.setEnabled(false);
        next.setEnabled(false);
        last.setEnabled(false);
        if(count>1) {
            first.setEnabled(true);
            previous.setEnabled(true);
        }
        if(count<total) {
            next.setEnabled(true);
            last.setEnabled(true);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc=" �ظm���N�X ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        first = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        tfShowCount = new javax.swing.JTextField();
        next = new javax.swing.JButton();
        last = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfMember = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfID = new javax.swing.JTextField();
        tfChi = new javax.swing.JTextField();
        tfEng = new javax.swing.JTextField();
        tfMath = new javax.swing.JTextField();
        addData = new javax.swing.JButton();
        saveData = new javax.swing.JButton();
        updateData = new javax.swing.JButton();
        deleteData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("\u5b78\u751f\u6210\u7e3e\u67e5\u8a62\uff08\u8cc7\u6599\u5eab\u904b\u7528\uff09");
        first.setText("|<");
        first.setName("first");
        jPanel1.add(first);

        previous.setText("<");
        previous.setName("previous");
        jPanel1.add(previous);

        tfShowCount.setColumns(5);
        tfShowCount.setText("1");
        tfShowCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfShowCountActionPerformed(evt);
            }
        });

        jPanel1.add(tfShowCount);

        next.setText(">");
        next.setName("next");
        jPanel1.add(next);

        last.setText(">|");
        last.setName("last");
        jPanel1.add(last);

        jLabel1.setText("\u5b78\u865f\uff1a");

        jLabel2.setText("\u59d3\u540d\uff1a");

        jLabel3.setText("\u6708\u8003\u4ee3\u865f\uff1a");

        jLabel4.setText("\u570b\u6587\uff1a");

        jLabel5.setText("\u82f1\u6587\uff1a");

        jLabel6.setText("\u6578\u5b78\uff1a");

        tfMember.setColumns(3);
        tfMember.setEditable(false);
        tfMember.setName("tf1");

        tfName.setColumns(3);
        tfName.setEditable(false);
        tfName.setName("tf1");

        tfID.setColumns(3);
        tfID.setEditable(false);
        tfID.setName("tf1");

        tfChi.setColumns(3);
        tfChi.setEditable(false);
        tfChi.setName("tf1");

        tfEng.setColumns(3);
        tfEng.setEditable(false);
        tfEng.setName("tf1");

        tfMath.setColumns(3);
        tfMath.setEditable(false);
        tfMath.setName("tf1");

        addData.setText("\u65b0\u589e");

        saveData.setText("\u5b58\u6a94");
        saveData.setEnabled(false);

        updateData.setText("\u4fee\u6539");

        deleteData.setText("\u522a\u9664");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfMath, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEng, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfChi, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMember, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteData)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfEng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfMath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addData)
                    .addComponent(saveData)
                    .addComponent(updateData)
                    .addComponent(deleteData))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void tfShowCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfShowCountActionPerformed
// TODO �N�b���B�[�J�z���B�z�N�X�G
        int a;
        try {
            a=Integer.parseInt(tfShowCount.getText());
        } catch(Exception e) {
            a=1; }
        
        try {
            if(a>=1 && a<=total) {
                count=a;
                rs.absolute(a);
                showData();
            } else {
                if(a<=0)
                    count=1;
                else
                    count=total;
                tfShowCount.setText(String.valueOf(count));
                rs.absolute(count);
                showData();
            }
        } catch(SQLException sqle) {
            System.out.println("�o�ͨҥ~����]�O�G"+sqle.getMessage());
        }
        checkButton();
    }//GEN-LAST:event_tfShowCountActionPerformed
    
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataBase2().setVisible(true);
            }
        });
        
    }
    
    // �ܼƫŧi - ���i��ק�//GEN-BEGIN:variables
    private javax.swing.JButton addData;
    private javax.swing.JButton deleteData;
    private javax.swing.JButton first;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton last;
    private javax.swing.JButton next;
    private javax.swing.JButton previous;
    private javax.swing.JButton saveData;
    private javax.swing.JTextField tfChi;
    private javax.swing.JTextField tfEng;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfMath;
    private javax.swing.JTextField tfMember;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfShowCount;
    private javax.swing.JButton updateData;
    // �ܼƫŧi����//GEN-END:variables
    
}
