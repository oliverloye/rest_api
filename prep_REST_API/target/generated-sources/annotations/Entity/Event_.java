package Entity;

import Entity.Pet;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-10T22:34:24")
@StaticMetamodel(Event.class)
public class Event_ { 

    public static volatile SingularAttribute<Event, Date> date;
    public static volatile SingularAttribute<Event, Pet> petId;
    public static volatile SingularAttribute<Event, String> remark;
    public static volatile SingularAttribute<Event, Integer> id;
    public static volatile SingularAttribute<Event, String> event;

}