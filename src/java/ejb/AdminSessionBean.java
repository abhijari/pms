/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.User;
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
    public List<User> getAllStudents() {
        return em.createNamedQuery("Usersgroup.findByGroupId").setParameter("groupId", 2).getResultList();
    }

    @Override
    public List<User> getAllCompanies() {
        return em.createNamedQuery("Usersgroup.findByGroupId").setParameter("groupId", 3).getResultList();
    }

}
