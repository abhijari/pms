/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSFBean;

import ejb.UserSessionBeanLocal;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.security.enterprise.AuthenticationStatus;
import javax.security.enterprise.SecurityContext;
import static javax.security.enterprise.authentication.mechanism.http.AuthenticationParameters.withParams;
import javax.security.enterprise.credential.Credential;
import javax.security.enterprise.credential.Password;
import javax.security.enterprise.credential.UsernamePasswordCredential;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author abhishek jariwala
 */
@Named(value = "loginManagedBean")
@SessionScoped
public class LoginManagedBean implements Serializable{

    /**
     * Creates a new instance of LoginManagedBean
     */
    @EJB
    private UserSessionBeanLocal userSessionBean;

    @Inject
    private SecurityContext sc;
    
    private AuthenticationStatus status;

    public LoginManagedBean(){
            FacesContext context=FacesContext.getCurrentInstance();
        Integer UserName=(Integer) context.getExternalContext().getSessionMap().get("userID");
        System.out.println(UserName);
        
    }
    public AuthenticationStatus getStatus() {
        return status;
    }

    public void setStatus(AuthenticationStatus status) {
        this.status = status;
    }
    
    private String username,password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
    
      public void login(){
        
           System.out.println(this.username);
          System.out.println(this.password);
          
          try {
        HttpServletRequest req = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        HttpServletResponse res = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
//        Credential credential = new UsernamePasswordCredential(this.username, new Password(this.password));
//        AuthenticationStatus status = sc.authenticate(req, res, withParams().credential(credential));

       // CredentialValidationResult result = identityStoreHandler.validate(credential);
//         System.out.println(status);       
                         
req.getSession().setAttribute("userID", 11);
          }
          catch(Exception e){
              e.printStackTrace();
          }
         // System.out.println(result);

    }
}
