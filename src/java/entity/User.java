/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author abhishek jariwala
 */
@Entity
@Table(name = "user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
    @NamedQuery(name = "User.findById", query = "SELECT u FROM User u WHERE u.id = :id"),
    @NamedQuery(name = "User.findByName", query = "SELECT u FROM User u WHERE u.name = :name"),
    @NamedQuery(name = "User.findByUsername", query = "SELECT u FROM User u WHERE u.username = :username"),
    @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password"),
    @NamedQuery(name = "User.findByImage", query = "SELECT u FROM User u WHERE u.image = :image"),
    @NamedQuery(name = "User.findByCity", query = "SELECT u FROM User u WHERE u.city = :city"),
    @NamedQuery(name = "User.findByAddress", query = "SELECT u FROM User u WHERE u.address = :address"),
    @NamedQuery(name = "User.findByEmail", query = "SELECT u FROM User u WHERE u.email = :email"),
    @NamedQuery(name = "User.findByWebsiteLink", query = "SELECT u FROM User u WHERE u.websiteLink = :websiteLink"),
    @NamedQuery(name = "User.findByDescription", query = "SELECT u FROM User u WHERE u.description = :description"),
    @NamedQuery(name = "User.findByGender", query = "SELECT u FROM User u WHERE u.gender = :gender"),
    @NamedQuery(name = "User.findByContact", query = "SELECT u FROM User u WHERE u.contact = :contact"),
    @NamedQuery(name = "User.findByDob", query = "SELECT u FROM User u WHERE u.dob = :dob"),
    @NamedQuery(name = "User.findByIsPlaced", query = "SELECT u FROM User u WHERE u.isPlaced = :isPlaced"),
    @NamedQuery(name = "User.findByGitLink", query = "SELECT u FROM User u WHERE u.gitLink = :gitLink"),
    @NamedQuery(name = "User.findByLinkedinLink", query = "SELECT u FROM User u WHERE u.linkedinLink = :linkedinLink"),
    @NamedQuery(name = "User.findByCreatedDate", query = "SELECT u FROM User u WHERE u.createdDate = :createdDate")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "password")
    private String password;
    @Size(max = 100)
    @Column(name = "image")
    private String image;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "address")
    private String address;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "email")
    private String email;
    @Size(max = 100)
    @Column(name = "websiteLink")
    private String websiteLink;
    @Size(max = 1000)
    @Column(name = "description")
    private String description;
    @Size(max = 10)
    @Column(name = "gender")
    private String gender;
    @Column(name = "contact")
    private Integer contact;
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Column(name = "isPlaced")
    private Boolean isPlaced;
    @Size(max = 100)
    @Column(name = "gitLink")
    private String gitLink;
    @Size(max = 100)
    @Column(name = "linkedinLink")
    private String linkedinLink;
    @Basic(optional = false)
    @NotNull
    @Column(name = "createdDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentId")
    private List<Skills> skillsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentId")
    private List<Projects> projectsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentId")
    private List<Experiencedetail> experiencedetailList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "companyId")
    private List<Jobinerviews> jobinerviewsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentId")
    private List<Jobinerviews> jobinerviewsList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "studentId")
    private List<Educationdetail> educationdetailList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "companyId")
    private List<Requestinterviewdates> requestinterviewdatesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private List<Usersgroup> usersgroupList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private List<Userstechnology> userstechnologyList;

    public User() {
    }

    public User(Integer id) {
        this.id = id;
    }

    public User(Integer id, String name, String username, String password, String city, String address, String email, Date createdDate) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.city = city;
        this.address = address;
        this.email = email;
        this.createdDate = createdDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsiteLink() {
        return websiteLink;
    }

    public void setWebsiteLink(String websiteLink) {
        this.websiteLink = websiteLink;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Boolean getIsPlaced() {
        return isPlaced;
    }

    public void setIsPlaced(Boolean isPlaced) {
        this.isPlaced = isPlaced;
    }

    public String getGitLink() {
        return gitLink;
    }

    public void setGitLink(String gitLink) {
        this.gitLink = gitLink;
    }

    public String getLinkedinLink() {
        return linkedinLink;
    }

    public void setLinkedinLink(String linkedinLink) {
        this.linkedinLink = linkedinLink;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @XmlTransient
    public List<Skills> getSkillsList() {
        return skillsList;
    }

    public void setSkillsList(List<Skills> skillsList) {
        this.skillsList = skillsList;
    }

    @XmlTransient
    public List<Projects> getProjectsList() {
        return projectsList;
    }

    public void setProjectsList(List<Projects> projectsList) {
        this.projectsList = projectsList;
    }

    @XmlTransient
    public List<Experiencedetail> getExperiencedetailList() {
        return experiencedetailList;
    }

    public void setExperiencedetailList(List<Experiencedetail> experiencedetailList) {
        this.experiencedetailList = experiencedetailList;
    }

    @XmlTransient
    public List<Jobinerviews> getJobinerviewsList() {
        return jobinerviewsList;
    }

    public void setJobinerviewsList(List<Jobinerviews> jobinerviewsList) {
        this.jobinerviewsList = jobinerviewsList;
    }

    @XmlTransient
    public List<Jobinerviews> getJobinerviewsList1() {
        return jobinerviewsList1;
    }

    public void setJobinerviewsList1(List<Jobinerviews> jobinerviewsList1) {
        this.jobinerviewsList1 = jobinerviewsList1;
    }

    @XmlTransient
    public List<Educationdetail> getEducationdetailList() {
        return educationdetailList;
    }

    public void setEducationdetailList(List<Educationdetail> educationdetailList) {
        this.educationdetailList = educationdetailList;
    }

    @XmlTransient
    public List<Requestinterviewdates> getRequestinterviewdatesList() {
        return requestinterviewdatesList;
    }

    public void setRequestinterviewdatesList(List<Requestinterviewdates> requestinterviewdatesList) {
        this.requestinterviewdatesList = requestinterviewdatesList;
    }

    @XmlTransient
    public List<Usersgroup> getUsersgroupList() {
        return usersgroupList;
    }

    public void setUsersgroupList(List<Usersgroup> usersgroupList) {
        this.usersgroupList = usersgroupList;
    }

    @XmlTransient
    public List<Userstechnology> getUserstechnologyList() {
        return userstechnologyList;
    }

    public void setUserstechnologyList(List<Userstechnology> userstechnologyList) {
        this.userstechnologyList = userstechnologyList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.User[ id=" + id + " ]";
    }
    
}
