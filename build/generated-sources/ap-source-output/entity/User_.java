package entity;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-24T23:52:16")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> image;
    public static volatile SingularAttribute<User, String> address;
    public static volatile SingularAttribute<User, String> websiteLink;
    public static volatile SingularAttribute<User, String> gender;
    public static volatile SingularAttribute<User, String> city;
    public static volatile SingularAttribute<User, Boolean> isVerified;
    public static volatile SingularAttribute<User, String> description;
    public static volatile SingularAttribute<User, Boolean> isPlaced;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, Date> createdDate;
    public static volatile SingularAttribute<User, String> linkedinLink;
    public static volatile SingularAttribute<User, Date> dob;
    public static volatile SingularAttribute<User, String> companyname;
    public static volatile SingularAttribute<User, BigInteger> contact;
    public static volatile SingularAttribute<User, String> name;
    public static volatile SingularAttribute<User, String> gitLink;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> username;

}