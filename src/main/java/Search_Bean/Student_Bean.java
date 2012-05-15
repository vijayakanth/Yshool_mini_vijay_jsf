/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Search_Bean;


import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;


import Student_DB.Student_Search;
import Student_DB.Student;


/**
 *
 * @author G Vijayakanth
 */
@ManagedBean
@RequestScoped
public class Student_Bean {

   
    private Student_Search searchStd;
    private List<Student_Search> users;
    private String name;
    private String stgrade;
    
    
    private String message;

    public Student_Bean() {
        
        searchStd=new Student_Search();
         name =searchStd.getStudentName();
        stgrade =searchStd.getGrade();
         users=Student.getUsers() ;
    }

    public void Search() {
        Student st=new Student();
        searchStd=st.findStudent(name, stgrade); 
        
         FacesContext.getCurrentInstance().addMessage(null, 
                     new FacesMessage(FacesMessage.SEVERITY_INFO, "Student detail successfully searched.", null));
    }
   public String searchResponse(){
        if(searchStd==null)
        {
            return "Error";
        }
        else{
            return "Searchedstudent";
        } 
   }
  

    public List<Student_Search> getUsers() {
        return users;
    }

    public void setUsers(List<Student_Search> users) {
        this.users = users;
    }

    public Student_Search getSearchStudent() {
        return searchStd;
    }

    public void setSearchStudent(Student_Search searchStd) {
        this.searchStd = searchStd;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the stgrade
     */
    public String getStgrade() {
        return stgrade;
    }

    /**
     * @param stgrade the stgrade to set
     */
    public void setStgrade(String stgrade) {
        this.stgrade = stgrade;
    }
    
    }

