/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_DB;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G Vijayakanth
 */
public class Student {
    

   private final static List< Student_Search> stdnt;
    
    static
    {
      Student_Search st1=new Student_Search("vijay","one","Ganesh","pointpedro");
      Student_Search st2=new Student_Search("vanas","two","krish","punnalai");
      Student_Search st3=new Student_Search("ramanan","three","velu","nelliyady");
      Student_Search st4=new Student_Search("thenu","four","sri","vavuniya");
      Student_Search st5=new Student_Search("nilash","five","namsi","poonthoddam");
      
      stdnt = new ArrayList< Student_Search>();
      stdnt.add(st1);
      stdnt.add(st2);
      stdnt.add(st3);
      stdnt.add(st4);
      stdnt.add(st5);
      
    }
    public static List<Student_Search> getUsers(){
		return stdnt;
	}
    public Student_Search findStudent(String name,String grade)
    {
        Student_Search st=null;
        for(int i=0;i<stdnt.size();i++)
        {
            if(stdnt.get(i).getStudentName().equals(name) && stdnt.get(i).getGrade().equals(grade))
            {
                st=stdnt.get(i);
            }
        }
       // System.out.print(st);
        return st;
        
           
     }   
}

    

