package demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AnonymousInnerClass 
{//�����ڲ���
	private String name= "Jacky";
	private Integer age=24;
	IFoo iFoo=new IFoo(){

		@Override
		public void display() 
		{
			// TODO Auto-generated method stub
			System.out.println("�����ǣ�"+name+"   ���䣺"+age);
			
		}
		
	};
	
	public void a()
	{
		JButton but1=new JButton("abc");
		but1.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
			}
		});
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AnonymousInnerClass anonymousInnerClass=new AnonymousInnerClass();
		anonymousInnerClass.iFoo.display();
	}

}
interface IFoo
{
	public void display();
}
