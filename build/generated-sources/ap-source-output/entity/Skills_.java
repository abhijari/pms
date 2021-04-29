package entity;

import entity.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-24T23:52:16")
@StaticMetamodel(Skills.class)
public class Skills_ { 

    public static volatile SingularAttribute<Skills, User> studentId;
    public static volatile SingularAttribute<Skills, String> description;
    public static volatile SingularAttribute<Skills, Integer> id;
    public static volatile SingularAttribute<Skills, String> technology;
    public static volatile SingularAttribute<Skills, Double> points;

}