package springframework.Lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) //main method
    {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config3.xml");
        Employee e1=(Employee)context.getBean("Emp1");
        System.out.println(e1);
    	}
}
