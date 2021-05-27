package entity;

import entity.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-13T19:55:22")
@StaticMetamodel(Educationdetail.class)
public class Educationdetail_ { 

    public static volatile SingularAttribute<Educationdetail, String> universityName;
    public static volatile SingularAttribute<Educationdetail, User> studentId;
    public static volatile SingularAttribute<Educationdetail, Integer> year;
    public static volatile SingularAttribute<Educationdetail, Double> percentage;
    public static volatile SingularAttribute<Educationdetail, String> degreeName;
    public static volatile SingularAttribute<Educationdetail, Integer> id;
    public static volatile SingularAttribute<Educationdetail, Double> cgpa;

}