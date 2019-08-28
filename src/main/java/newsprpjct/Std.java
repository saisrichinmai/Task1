package newsprpjct;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Std {	

		public static void main(String[] args)
		{
			 ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml"); 
			  
			 Pojo1 p =(Pojo1)context.getBean("s1");  
	         p.display();  


		}
			
	}
