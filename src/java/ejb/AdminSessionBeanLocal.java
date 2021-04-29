/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.User;
import entity.Usersgroup;
import java.util.*;
import javax.ejb.Local;

/**
 *
 * @author abhishek jariwala
 */
@Local
public interface AdminSessionBeanLocal {
    public List<Usersgroup> getAllStudents();
    public List<Usersgroup> getAllCompanies();
    public List<Usersgroup> getCompanyRequest();        


}
