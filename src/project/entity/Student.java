package project.entity;

public class Student {
private Integer id;
private String stuNo;
private String StuName;
private String stuBirthday;
private String stuPhone;
private String stuAddres;
private double stuHeight;
public String getStuPhone() {
	return stuPhone;
}
public void setStuPhone(String stuPhone) {
	this.stuPhone = stuPhone;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(Integer id, String stuNo, String stuName, String stuBirthday, String stuPhone, String stuAddres,
		Double stuHeight) {
	super();
	this.id = id;
	this.stuNo = stuNo;
	StuName = stuName;
	this.stuBirthday = stuBirthday;
	this.stuPhone = stuPhone;
	this.stuAddres = stuAddres;
	this.stuHeight = stuHeight;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getStuNo() {
	return stuNo;
}
public void setStuNo(String stuNo) {
	this.stuNo = stuNo;
}
public String getStuName() {
	return StuName;
}
public void setStuName(String stuName) {
	StuName = stuName;
}
public String getStuBirthday() {
	return stuBirthday;
}
public void setStuBirthday(String stuBirthday) {
	this.stuBirthday = stuBirthday;
}
public String getStuAddres() {
	return stuAddres;
}
public void setStuAddres(String stuAddres) {
	this.stuAddres = stuAddres;
}
public Double getStuHeight() {
	return stuHeight;
}
public void setStuHeight(Double stuHeight) {
	this.stuHeight = stuHeight;
}
@Override
public String toString() {
	return "Student [id=" + id + ", stuNo=" + stuNo + ", StuName=" + StuName + ", stuBirthday=" + stuBirthday
			+ ", stuPhone=" + stuPhone + ", stuAddres=" + stuAddres + ", stuHeight=" + stuHeight + "]";
}

}