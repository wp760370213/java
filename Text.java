package www;
 
public class Text{ 
private static String name; 
public static void main(String args[]){ 
Student xs= new Student(); 
Secourse c=new Secourse(); 
xs.setNumber("111"); 
xs.setName("zz"); 
xs.setSex("��"); 
xs.setAge(18); 
Teacher js= new Teacher(); 
js.setNumber("741"); 
js.setName("xx"); 
js.setSex("��"); 
js.setAge(53); 
Secourse kc= new Secourse(); 
kc.setCoursenumber("857"); 
kc.setCoursename("java");  
kc.setPlace("ͼ���"); 
kc.setTime("10:00"); 
kc.setTeacher("xx"); 
System.out.println("ѧ�����:"+xs.getNumber()); 
System.out.println("ѧ������:"+xs.getName()); 
System.out.println("�Ա�:"+xs.getSex()); 
System.out.println("����:"+xs.getAge()); 
System.out.println("��ʦ���:"+js.getNumber()); 
System.out.println("��ʦ����:"+js.getName()); 
System.out.println("�Ա�:"+js.getSex()); 
System.out.println("����:"+js.getAge()); 
System.out.println("�γ̱��:"+kc.getNumber()); 
System.out.println("�γ�����:"+kc.getCoursename()); 
System.out.println("�Ͽεص�:"+kc.getPlace()); 
System.out.println("�Ͽ�ʱ��:"+kc.getTime()); 
System.out.println("�ڿ���ʦ:"+kc.getTeacher()); 
System.out.println("--------------------------------------------"); 
c.xuanke(name); 
System.out.println("---------------------------------------------"); 
c.tuike(name); 
}
} 