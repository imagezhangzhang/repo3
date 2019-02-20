import jdk.internal.util.xml.impl.Input;

import java.util.Arrays;
import java.util.Scanner;

public class Course {
    {
        studentList=new Student[50];
    }
    private String courseName;
    private Student[] studentList;
    private int studentNumber;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public  void selectCourse(Student student){
        this.studentList[studentNumber]=student;
        studentNumber++;

    }

    public Student[] getStudentList() {
        return this.studentList;
    }

    public int getStudentNumber() {
        return studentNumber;
    }
    public void dropStudent(){
        //遍历学生列表  找到名字一样的那个学生，删除元素
        //找到这个学生后，记录下标吧数组最后一个元素赋值给该下标位置，数组长度缩减 1
        Scanner input=new Scanner(System.in);
        System.out.println("输入要删除的学生");
        String instudent=input.nextLine();
        for (int i=0;i<studentNumber;i++){
            if (studentList[i].equals(instudent)){
                int j=i;
                studentList[j]=studentList[studentList.length-1];
                studentNumber--;
                }
                }
        studentNumber--;
        studentList= Arrays.copyOf(studentList,studentList.length-1);
      // System.out.println(Arrays.toString(studentList));
    }
}
