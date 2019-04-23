package demo;

public class LolMonster {
private int monstergrade;//等级
private int monsterlife;


public LolMonster(int monstergrade) {
	super();
	this.monstergrade =monstergrade;
	
	if(monstergrade>0)//通过等级计算怪物的生命值
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
