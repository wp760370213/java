package yigebao;

public class ChooseCourseByStu {
	 
	 /**
	  * ѡ�ι���ϵͳ
	  */
	 public static void main(String[] args) {
	  Student stu0 = new Student(1001,"a");
	  Student stu1 = new Student(1002,"b");
	  Student stu2 = new Student(1003,"c");
	  Student stu3 = new Student(1004,"d");
	  Course cour0 = new Course(001,"����");
	  Course cour1 = new Course(002,"��ɢ");
	  Course cour2 = new Course(003,"Ӣ��");
	  stu0.addCourse(cour0);
	  stu0.addCourse(cour2);
	  stu0.addCourse(cour1);
	  stu1.addCourse(cour2);
	  stu1.addCourse(cour0);
	  stu2.addCourse(cour1);
	  stu3.addCourse(cour0);
	  stu3.addCourse(cour1);
	  stu1.removeCourse(cour2);
	  stu0.displayCourse();
	  cour0.removeStudent(stu1);
	  cour1.displayStudent();
	 }
	 
	}