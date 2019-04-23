package project.ui;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import project.entity.Student;
import project.service.StudentService;
import project.service.impl.StudentServiceImpl;

public class StudentMainFrame extends JFrame {

	private JTable table;
	//����
	private Object [][] dataobObjects;
	private List<Student> list;
	private JTextField txtSno;
	private JTextField txtSname;
	private JTextField txtSbirthday;
	private JTextField txtSphone;
	private JTextField txtSaddres;
	private JTextField txtSheight;
	private JTextField txtSid;
	private StudentService studentService;
	private int rowNum=-1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StudentMainFrame();
	}
public StudentMainFrame(){
	setTitle("���");
	setSize(800, 800);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(new BorderLayout());
	//���ñ��ı�����
	String [] columuNameStrings={"���","ѧ��","����","��������","�绰����","��ͥסַ","���"};
	//ģ��һ������
	studentService=new StudentServiceImpl();
	List<Student>list=studentService.findAll();
	dataobObjects=new Object[list.size()][columuNameStrings.length];
	for(int i=0;i<list.size();i++){
		Student student=list.get(i);
		dataobObjects[i][0]=student.getId();
		dataobObjects[i][1]=student.getStuNo();
		dataobObjects[i][2]=student.getStuName();
		dataobObjects[i][3]=student.getStuBirthday();
		dataobObjects[i][4]=student.getStuPhone();
		dataobObjects[i][5]=student.getStuAddres();
		dataobObjects[i][6]=student.getStuHeight();	
		
	}
	DefaultTableModel defaultTableModel=new DefaultTableModel(dataobObjects,columuNameStrings){

		@Override
		public boolean isCellEditable(int row, int column) {
			// TODO Auto-generated method stub
			return false;
		}
		
		
	};
	table=new JTable(defaultTableModel);
	//�������Ӽ�������Ӧ���
	table.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
//			System.out.println("��굥����");
			//������
		
			if(e.getClickCount()==2){
				System.out.println("���˫����");
				//���˫�������е�����
				rowNum=table.rowAtPoint(e.getPoint());
				System.out.println("˫���ˣ��±�"+rowNum+"����");
				//ͨ���±�������
				System.out.println("������"+dataobObjects[rowNum][2]);
				System.out.println(list.get(rowNum));
				Student student=list.get(rowNum);
				txtSid.setText(String.valueOf(student.getId()));
				txtSno.setText(student.getStuNo());
				txtSname.setText(student.getStuName());
				txtSbirthday.setText(student.getStuBirthday());
				txtSphone.setText(student.getStuPhone());
				txtSaddres.setText(student.getStuAddres());
				txtSheight.setText(String.valueOf(student.getStuHeight()));
				
		
			}
		}
	});
	//������ݱȽ϶࣬������Ҫһ�����Թ��������
	JScrollPane jScrollPane=new JScrollPane(table);
	jScrollPane.setPreferredSize(new Dimension(0,300));
	add(jScrollPane,BorderLayout.NORTH);
	JPanel panel=new JPanel();
	panel.setPreferredSize(new Dimension(0,270));
	add(panel,BorderLayout.SOUTH);
	panel.setLayout(null);
	JLabel lblsno=new JLabel("ѧ�����");
	lblsno.setBounds(20, 30, 70, 30);
	panel.add(lblsno);
	txtSno=new JTextField();
	txtSno.setBounds(100, 30, 120, 30);
	panel.add(txtSno);
	panel.setLayout(null);
	JLabel lblsname=new JLabel("ѧ��������");
	lblsname.setBounds(250, 30, 70, 30);
	panel.add(lblsname);
	txtSname=new JTextField();
	txtSname.setBounds(330, 30, 120, 30);
	panel.add(txtSname);
	JLabel lblSbirthday=new JLabel("ѧ�����գ�");
	lblSbirthday.setBounds(480,30,70,30);
	panel.add(lblSbirthday);
	txtSbirthday=new JTextField();
	txtSbirthday.setBounds(560, 30, 120, 30);
	panel.add(txtSbirthday);
	JLabel lblsphone=new JLabel("ѧ���绰��");
	lblsphone.setBounds(20, 100, 70, 30);
	panel.add(lblsphone);
	txtSphone=new JTextField();
	txtSphone.setBounds(100, 100, 120, 30);
	panel.add(txtSphone);
	JLabel lblsaddres=new JLabel("��ͥסַ��");
	lblsaddres.setBounds(250, 100, 70, 30);
	panel.add(lblsaddres);
	txtSaddres=new JTextField();
	txtSaddres.setBounds(330, 100, 120, 30);
	panel.add(txtSaddres);
	JLabel lblSheight=new JLabel("ѧ����ߣ�");
	lblSheight.setBounds(480,100,70,30);
	panel.add(lblSheight);
	txtSheight=new JTextField();
	txtSheight.setBounds(560, 100, 120, 30);
	panel.add(txtSheight);
	txtSid=new JTextField();
	panel.add(txtSid);
	JButton butadd=new JButton("����ѧ��");
	butadd.setBounds(60, 170, 100, 30);
	panel.add(butadd);
	butadd.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//����ѧ����Ϣ
			//�õ������ѧ����Ϣ
			String sno=txtSno.getText();
			String sname=txtSname.getText();
			String sbirthday=txtSbirthday.getText();
			String sphone=txtSphone.getText();
			String saddres=txtSaddres.getText();
			String sheight=txtSheight.getText();
			//��ҪУ��
			if((!"".equals(sno))&&(!"".equals(sname))&&(!"".equals(sbirthday))&&(!"".equals(sphone))&&(!"".equals(saddres))
					&&(!"".equals(sheight))){
				//ʵ��һ��Student����
				Student student=new Student();
				student.setStuNo(sno);
				student.setStuName(sname);
				student.setId(0);
				student.setStuBirthday(sbirthday);
				student.setStuPhone(sphone);
				student.setStuAddres(saddres);
				student.setStuHeight(Double.parseDouble(sheight));
				//ʵ��һ��StudentSerivice,��ɲ������
				StudentService studentService=new StudentServiceImpl();
				boolean isok = studentService.save(student);
				if(isok){
					//�ɹ�
					//ˢ�±�񣬰��µ�������ʾ����
					DefaultTableModel defaultTableModel = refreshTableData(columuNameStrings, studentService);
					//��������table�е���ģ��
					table.setModel(defaultTableModel);
					//����UI
					table.updateUI();
					txtSno.setText("");
					txtSname.setText("");
					txtSbirthday.setText("");
					txtSphone.setText("");
					txtSaddres.setText("");
					txtSheight.setText("");
				}else{
					//ʧ��
					JOptionPane.showMessageDialog(null, "����ʧ��");;
				}
				
				
			}
		}

		
	});
	JButton butUpdate=new JButton("�޸�ѧ��");
	butUpdate.setBounds(240, 170, 100, 30);
	panel.add(butUpdate);
	butUpdate.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(rowNum>-1){
				System.out.println("ѡ���˼�¼");
				Student student=list.get(rowNum);
				String sno=txtSno.getText();
				String sname=txtSname.getText();
				String sbirthday=txtSbirthday.getText();
				String sphone=txtSphone.getText();
				String saddres=txtSaddres.getText();
				String sheight=txtSheight.getText();
				//��ҪУ��
				if((!"".equals(sno))&&(!"".equals(sname))&&(!"".equals(sbirthday))&&(!"".equals(sphone))&&(!"".equals(saddres))
						&&(!"".equals(sheight))){
					student.setStuNo(sno);
					student.setStuName(sname);
					student.setStuBirthday(sbirthday);
					student.setStuPhone(sphone);
					student.setStuAddres(saddres);
					student.setStuHeight(Double.parseDouble(sheight));
					StudentService studentService=new StudentServiceImpl();
					boolean isok = studentService.update(student);
				if(isok){
					DefaultTableModel defaultTableModel=refreshTableData(columuNameStrings, studentService);
					table.setModel(defaultTableModel);
					//����UI
					table.updateUI();
					txtSno.setText("");
					txtSname.setText("");
					txtSbirthday.setText("");
					txtSphone.setText("");
					txtSaddres.setText("");
					txtSheight.setText("");
					rowNum=-1;
				}else {
					JOptionPane.showMessageDialog(null, "�޸�ʧ�ܣ�");
				}
				}
			}else{
				System.out.println("δѡ���¼");
			}
			
		}
	});
	JButton butdelete=new JButton("ɾ��ѧ��");
	butdelete.setBounds(420, 170, 100, 30);
	panel.add(butdelete);
	butdelete.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(rowNum>-1){
				System.out.println("ѡ���˼�¼");
				Student student=list.get(rowNum);
				String id=txtSid.getText();
			
					StudentService studentService=new StudentServiceImpl();
					boolean isok = studentService.delete(Integer.parseInt(id));
					if(isok){
						DefaultTableModel defaultTableModel=refreshTableData(columuNameStrings, studentService);
						table.setModel(defaultTableModel);
						//����UI
						table. updateUI();
						txtSno.setText("");
						txtSname.setText("");
						txtSbirthday.setText("");
						txtSphone.setText("");
						txtSaddres.setText("");
						txtSheight.setText("");
						rowNum=-1;
					}else {
						JOptionPane.showMessageDialog(null, "ɾ��ʧ�ܣ�");
					}	
				}else{
					System.out.println("δѡ���¼");
				}
		}
			
	});
	JButton butselect=new JButton("��ѯѧ��");
	butselect.setBounds(600, 170, 100, 30);
	panel.add(butselect);
	butselect.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			List<Student> list = studentService.findAll();
			list.forEach(System.out::println);
		}
	});
//	jScrollPane.setSize(500,400);
	add(jScrollPane);
	setVisible(true);
}
private DefaultTableModel refreshTableData(String[] columuNameStrings, StudentService studentService) {
		 	list = studentService.findAll();
			//��list����ת�浽dataobObjects��
			dataobObjects=new Object[list.size()][columuNameStrings.length];
			for(int i=0;i<list.size();i++){
				Student student1=list.get(i);
				dataobObjects[i][0]=student1.getId();
				dataobObjects[i][1]=student1.getStuNo();
				dataobObjects[i][2]=student1.getStuName();
				dataobObjects[i][3]=student1.getStuBirthday();
				dataobObjects[i][4]=student1.getStuPhone();
				dataobObjects[i][5]=student1.getStuAddres();
				dataobObjects[i][6]=student1.getStuHeight();	
				
			}
			DefaultTableModel defaultTableModel=new DefaultTableModel(dataobObjects,columuNameStrings);
			return defaultTableModel;
		}
}
