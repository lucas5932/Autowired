package Basic3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext();
		
		ApplicationContext context = new GenericXmlApplicationContext("car.xml");
		
		Person con = (Person)context.getBean("Consumer");
		
		con.setName("À±¾Æ");
		System.out.println(con.getName());
		System.out.println(con.personDrive());
				
		
	}
}
