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
	//数据
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
	setTitle("表格");
	setSize(800, 800);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(new BorderLayout());
	//设置表格的标题栏
	String [] columuNameStrings={"编号","学号","姓名","出生日期","电话号码","家庭住址","身高"};
	//模拟一下数据
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
	//给表格添加监听，相应点击
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
//			System.out.println("鼠标单击了");
			//检测鼠标
		
			if(e.getClickCount()==2){
				System.out.println("鼠标双击了");
				//获得双击了那行的数据
				rowNum=table.rowAtPoint(e.getPoint());
				System.out.println("双击了，下标"+rowNum+"数据");
				//通过下标拿数据
				System.out.println("姓名："+dataobObjects[rowNum][2]);
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
	//表格数据比较多，所以需要一个可以滚动的面板
	JScrollPane jScrollPane=new JScrollPane(table);
	jScrollPane.setPreferredSize(new Dimension(0,300));
	add(jScrollPane,BorderLayout.NORTH);
	JPanel panel=new JPanel();
	panel.setPreferredSize(new Dimension(0,270));
	add(panel,BorderLayout.SOUTH);
	panel.setLayout(null);
	JLabel lblsno=new JLabel("学生编号");
	lblsno.setBounds(20, 30, 70, 30);
	panel.add(lblsno);
	txtSno=new JTextField();
	txtSno.setBounds(100, 30, 120, 30);
	panel.add(txtSno);
	panel.setLayout(null);
	JLabel lblsname=new JLabel("学生姓名：");
	lblsname.setBounds(250, 30, 70, 30);
	panel.add(lblsname);
	txtSname=new JTextField();
	txtSname.setBounds(330, 30, 120, 30);
	panel.add(txtSname);
	JLabel lblSbirthday=new JLabel("学生生日：");
	lblSbirthday.setBounds(480,30,70,30);
	panel.add(lblSbirthday);
	txtSbirthday=new JTextField();
	txtSbirthday.setBounds(560, 30, 120, 30);
	panel.add(txtSbirthday);
	JLabel lblsphone=new JLabel("学生电话：");
	lblsphone.setBounds(20, 100, 70, 30);
	panel.add(lblsphone);
	txtSphone=new JTextField();
	txtSphone.setBounds(100, 100, 120, 30);
	panel.add(txtSphone);
	JLabel lblsaddres=new JLabel("家庭住址：");
	lblsaddres.setBounds(250, 100, 70, 30);
	panel.add(lblsaddres);
	txtSaddres=new JTextField();
	txtSaddres.setBounds(330, 100, 120, 30);
	panel.add(txtSaddres);
	JLabel lblSheight=new JLabel("学生身高：");
	lblSheight.setBounds(480,100,70,30);
	panel.add(lblSheight);
	txtSheight=new JTextField();
	txtSheight.setBounds(560, 100, 120, 30);
	panel.add(txtSheight);
	txtSid=new JTextField();
	panel.add(txtSid);
	JButton butadd=new JButton("保存学生");
	butadd.setBounds(60, 170, 100, 30);
	panel.add(butadd);
	butadd.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//保存学生信息
			//拿到输入的学生信息
			String sno=txtSno.getText();
			String sname=txtSname.getText();
			String sbirthday=txtSbirthday.getText();
			String sphone=txtSphone.getText();
			String saddres=txtSaddres.getText();
			String sheight=txtSheight.getText();
			//需要校验
			if((!"".equals(sno))&&(!"".equals(sname))&&(!"".equals(sbirthday))&&(!"".equals(sphone))&&(!"".equals(saddres))
					&&(!"".equals(sheight))){
				//实例一个Student对象
				Student student=new Student();
				student.setStuNo(sno);
				student.setStuName(sname);
				student.setId(0);
				student.setStuBirthday(sbirthday);
				student.setStuPhone(sphone);
				student.setStuAddres(saddres);
				student.setStuHeight(Double.parseDouble(sheight));
				//实例一个StudentSerivice,完成插入操作
				StudentService studentService=new StudentServiceImpl();
				boolean isok = studentService.save(student);
				if(isok){
					//成功
					//刷新表格，把新的数据显示出来
					DefaultTableModel defaultTableModel = refreshTableData(columuNameStrings, studentService);
					//重新设置table中的新模型
					table.setModel(defaultTableModel);
					//更新UI
					table.updateUI();
					txtSno.setText("");
					txtSname.setText("");
					txtSbirthday.setText("");
					txtSphone.setText("");
					txtSaddres.setText("");
					txtSheight.setText("");
				}else{
					//失败
					JOptionPane.showMessageDialog(null, "插入失败");;
				}
				
				
			}
		}

		
	});
	JButton butUpdate=new JButton("修改学生");
	butUpdate.setBounds(240, 170, 100, 30);
	panel.add(butUpdate);
	butUpdate.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(rowNum>-1){
				System.out.println("选择了记录");
				Student student=list.get(rowNum);
				String sno=txtSno.getText();
				String sname=txtSname.getText();
				String sbirthday=txtSbirthday.getText();
				String sphone=txtSphone.getText();
				String saddres=txtSaddres.getText();
				String sheight=txtSheight.getText();
				//需要校验
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
					//更新UI
					table.updateUI();
					txtSno.setText("");
					txtSname.setText("");
					txtSbirthday.setText("");
					txtSphone.setText("");
					txtSaddres.setText("");
					txtSheight.setText("");
					rowNum=-1;
				}else {
					JOptionPane.showMessageDialog(null, "修改失败！");
				}
				}
			}else{
				System.out.println("未选择记录");
			}
			
		}
	});
	JButton butdelete=new JButton("删除学生");
	butdelete.setBounds(420, 170, 100, 30);
	panel.add(butdelete);
	butdelete.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(rowNum>-1){
				System.out.println("选择了记录");
				Student student=list.get(rowNum);
				String id=txtSid.getText();
			
					StudentService studentService=new StudentServiceImpl();
					boolean isok = studentService.delete(Integer.parseInt(id));
					if(isok){
						DefaultTableModel defaultTableModel=refreshTableData(columuNameStrings, studentService);
						table.setModel(defaultTableModel);
						//更新UI
						table. updateUI();
						txtSno.setText("");
						txtSname.setText("");
						txtSbirthday.setText("");
						txtSphone.setText("");
						txtSaddres.setText("");
						txtSheight.setText("");
						rowNum=-1;
					}else {
						JOptionPane.showMessageDialog(null, "删除失败！");
					}	
				}else{
					System.out.println("未选择记录");
				}
		}
			
	});
	JButton butselect=new JButton("查询学生");
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
			//把list数据转存到dataobObjects中
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
