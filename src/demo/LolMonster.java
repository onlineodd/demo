package demo;

public class LolMonster {
private int monstergrade;//�ȼ�
private int monsterlife;


public LolMonster(int monstergrade) {
	super();
	this.monstergrade =monstergrade;
	
	if(monstergrade>0)//ͨ���ȼ�������������ֵ
	{
		monsterlife=monstergrade*1000;
	}
}
public int getMonstergrade() {
	return monstergrade;
}
public void setMonstergrade(int monstergrade) {
	this.monstergrade = monstergrade;
}
public int getMonsterlife() {
	return monsterlife;
}
public void setMonsterlife(int monsterlife) {
	this.monsterlife = monsterlife;
}
@Override
public String toString() {
	return "LolMonster [monsterlife=" + monsterlife + "]";
}
public static void main(String []agrs) 
{
LolMonster monster=new LolMonster(2);
System.out.println(monster.toString());
}
}
