package www;
 
public class Text{ 
private static String name; 
public static void main(String args[]){ 
Student xs= new Student(); 
Secourse c=new Secourse(); 
xs.setNumber("111"); 
xs.setName("zz"); 
xs.setSex("男"); 
xs.setAge(18); 
Teacher js= new Teacher(); 
js.setNumber("741"); 
js.setName("xx"); 
js.setSex("男"); 
js.setAge(53); 
Secourse kc= new Secourse(); 
kc.setCoursenumber("857"); 
kc.setCoursename("java");  
kc.setPlace("图书馆"); 
kc.setTime("10:00"); 
kc.setTeacher("xx"); 
System.out.println("学生编号:"+xs.getNumber()); 
System.out.println("学生姓名:"+xs.getName()); 
System.out.println("性别:"+xs.getSex()); 
System.out.println("年龄:"+xs.getAge()); 
System.out.println("教师编号:"+js.getNumber()); 
System.out.println("教师姓名:"+js.getName()); 
System.out.println("性别:"+js.getSex()); 
System.out.println("年龄:"+js.getAge()); 
System.out.println("课程编号:"+kc.getNumber()); 
System.out.println("课程名称:"+kc.getCoursename()); 
System.out.println("上课地点:"+kc.getPlace()); 
System.out.println("上课时间:"+kc.getTime()); 
System.out.println("授课老师:"+kc.getTeacher()); 
System.out.println("--------------------------------------------"); 
c.xuanke(name); 
System.out.println("---------------------------------------------"); 
c.tuike(name); 
}
} 