package www;
 
class Personnel { 
private String number; 
private String name; 
private String sex; 
private int age; 
public String getNumber() { 
return number; 
} 
public void setNumber(String number) { 
this.number = number; 
} 
public String getName() { 
return name; 
} 
public void setName(String name) { 
this.name = name; 
} 
public String getSex() { 
return sex; 
} 
public void setSex(String sex) { 
this.sex = sex; 
}  
public int getAge() { 
return age; 
} 
public void setAge(int age) { 
this.age = age; 
} 
} 
class Student extends Personnel{ 
String course; 
public String getCourse() { 
return course; 
} 
public void setCourse(String course) { 
this.course = course; 
} 
} 
class Teacher extends Personnel{ 
String teaching; 
public String getTeaching() { 
return teaching; 
} 
public void setTeaching(String teaching) { 
this.teaching = teaching; 
} 
} 
class Secourse{ 
String name; 
private String coursenumber; 
private String coursename; 
private String place; 
private String time; 
private String teacher; 
String [] a= {"java","java web","java"}; 
public String getNumber() { 
return coursenumber; 
} 
public void setCoursenumber(String coursenumber) { 
this.coursenumber = coursenumber; 
} 
public String getCoursename() { 
return coursename; 
} 
public void setCoursename(String coursename) { 
this.coursename = coursename; 
} 
public String getPlace() { 
return place; 
} 
public void setPlace(String place) { 
this.place = place; 
} 
public String getTime() { 
return time; 
} 
public void setTime(String time) { 
this.time = time; 
} 
public String getTeacher() { 
return teacher; 
} 
public void setTeacher(String teacher) {
this.teacher = teacher; 
} 
public void xuanke(String name){ 
Student xuesheng=new Student(); 
xuesheng.getName(); 
xuesheng.setNumber("111"); 
xuesheng.setName("zz");  
xuesheng.getNumber(); 
if(xuesheng.getNumber()=="111") { 
place="ͼ���";time="10��40"; 
 System.out.println("ѧ��������"+xuesheng.getName());
 System.out.println("ѧ��ѡ��Ŀγ� ��"+a[2]);
 System.out.println("�Ͽεص㣺"+place+"����");
 System.out.println("�Ͽ�ʱ�䣺"+time);  
	     }
	     else  {
	      System.out.println("������Ŀγ�����");
	     }
	 }
	 public void tuike(String name) {
	  Student xuesheng=new Student();
	  xuesheng.getName();
	  xuesheng.setNumber("111");
	  xuesheng.setName("zz");
	  xuesheng.getNumber();
	  if(xuesheng.getNumber()=="111") {
	   System.out.println("ѧ��������"+xuesheng.getName());
	   System.out.println("���Ѿ��˿��ˣ�������ѡ��");
	  }
	 }
}