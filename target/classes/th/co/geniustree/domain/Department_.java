package th.co.geniustree.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import th.co.geniustree.domain.Employee;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-19T18:22:27")
@StaticMetamodel(Department.class)
public class Department_ { 

    public static volatile SingularAttribute<Department, String> deptName;
    public static volatile SingularAttribute<Department, Integer> deptId;
    public static volatile ListAttribute<Department, Employee> employees;

}