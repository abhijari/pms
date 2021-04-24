/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSFBean;

import ejb.AdminSessionBeanLocal;
import entity.User;
import java.util.*;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author abhishek jariwala
 */
@Named(value = "adminManagedBean")
@RequestScoped
public class AdminManagedBean {

    @EJB
    private AdminSessionBeanLocal adminSessionBean;

    /**
     * Creates a new instance of AdminManagedBean
     */
    
    public AdminManagedBean() {
    }
    
    public List<User> allStudents(){
        return this.adminSessionBean.getAllStudents();
    }
    
    public List<User> allCompanies(){
        return this.adminSessionBean.getAllCompanies();
    }
    
    
    
}
