/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Educationdetail;
import entity.Experiencedetail;
import entity.Projects;
import entity.User;
import entity.Usersgroup;
import entity.Userstechnology;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author abhishek jariwala
 */
@Stateless
public class AdminSessionBean implements AdminSessionBeanLocal {

    
    @PersistenceContext(unitName="pmsPU")
    EntityManager em;
    
    @Override
    public List<Usersgroup> getAllStudents() {
        return em.createNamedQuery("Usersgroup.findByGroupId").setParameter("groupId", 2).getResultList();
    }

    @Override
    public List<Usersgroup> getAllCompanies() {
        return em.createNamedQuery("Usersgroup.findVerifiedCompany").setParameter("groupId", 3).getResultList();
    }

    @Override
    public List<Usersgroup> getCompanyRequest() {
        return em.createNamedQuery("Usersgroup.findRequestCompany").setParameter("groupId", 3).getResultList();
    }

    @Override
    public void updateRequest(int userId, boolean isVerified) {
        
        User u = em.find(User.class, userId);
        u.setIsVerified(isVerified);
        em.merge(u);
    }

    @Override
    public void addStudent(User data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateStudent(int userId, User data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteStudent(int userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Educationdetail> getAllEducationDetail(int userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Experiencedetail> getAllExperienceDetail(int userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Projects> getAllProjects(int userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Userstechnology> getAllStudentTechnology(int userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Userstechnology> getAllCompanyTechnology(int userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addCompany(User data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCompany(int userId, User data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteDelete(int userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
