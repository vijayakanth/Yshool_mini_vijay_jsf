/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_DB;

/**
 *
 * @author G Vijayakanth
 */
public class Student_Search {
    
                private String studentName;
                private  String grade;
                private   String parentName;
                private   String address;  
 public  Student_Search(String studentName,String grade,String parentName,String address)
            {
                     this.studentName=studentName;
                    this.grade=grade;
                    this.parentName=parentName;
                    this.address=address; 
             }
  public  Student_Search()
               {
                     
               }              

    /**
     * @return the StudentName
     */
    public String getStudentName() {
        return studentName;
    }
    /**
     * @param StudentName the StudentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    /**
     * @return the Grade
     */
    public String getGrade() {
        return grade;
    }
    /**
     * @param Grade the Grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }
     public String getParentName() {
        return parentName;
    }    
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
     public String getAddress() {
        return address;
    }  
    public void setAddress(String address) {
        this.address = address;
    }  
   
}
    