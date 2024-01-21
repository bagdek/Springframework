package springframework.Lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{

	public static void main(String[] args) //main method
    {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("config2.xml");
        Student s1=(Student)context.getBean("stud1");
        System.out.println(s1);
    	}
}
