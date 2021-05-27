/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSFBean;

import ejb.AdminSessionBeanLocal;
import entity.User;
import entity.Usersgroup;
import java.io.Serializable;
import java.util.*;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author abhishek jariwala
 */
@Named(value = "adminManagedBean")
@SessionScoped
public class AdminManagedBean implements Serializable{

    @EJB
    private AdminSessionBeanLocal adminSessionBean;

    /**
     * Creates a new instance of AdminManagedBean
     */
    
    public AdminManagedBean() {
    }
    
    public List<Usersgroup> allStudents(){
        return this.adminSessionBean.getAllStudents();
    }
    
    public List<Usersgroup> allCompanies(){
        return this.adminSessionBean.getAllCompanies();
    }
    
    public List<Usersgroup> companyRequest(){
        return this.adminSessionBean.getCompanyRequest();
    }
    
    public void updateRequest(boolean isAccept,int userid){
        System.out.println("is="+isAccept);        
        System.out.println(userid);
        
       this.adminSessionBean.updateRequest(userid, isAccept);
    }
    
    
}
