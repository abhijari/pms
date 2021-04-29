package entity;

import entity.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-24T23:52:16")
@StaticMetamodel(Requestinterviewdates.class)
public class Requestinterviewdates_ { 

    public static volatile SingularAttribute<Requestinterviewdates, Date> datetime;
    public static volatile SingularAttribute<Requestinterviewdates, User> companyId;
    public static volatile SingularAttribute<Requestinterviewdates, Boolean> isAccept;
    public static volatile SingularAttribute<Requestinterviewdates, Integer> id;

}