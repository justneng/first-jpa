package th.co.geniustree.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import th.co.geniustree.domain.Department;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-19T18:22:27")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, Integer> empId;
    public static volatile SingularAttribute<Employee, String> empName;
    public static volatile SingularAttribute<Employee, Double> salary;
    public static volatile SingularAttribute<Employee, Department> department;

}