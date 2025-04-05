package _12_Collection._1_List._1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class _5_store_object_in_ArrayList {
    public static void main(String[] args) {
        Student st1=new Student(101,"Raju");
        Student st2=new Student(102,"Dash");
        Student st3=new Student(103,"Dibyalochan");
        Student st4=new Student(104,"Mohapatra");
        ArrayList<Student> stList=new ArrayList<>();
        stList.add(st1);
        stList.add(st2);
        stList.add(st3);
        stList.add(st4);
        System.out.println(stList);
        //For iterating student data call to student list
        Iterator itr=stList.iterator();
        while(itr.hasNext()){
            Student st=(Student)itr.next();
            System.out.println(st.id+"    "+st.name);
        }
    }
}
class Student{
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
}
