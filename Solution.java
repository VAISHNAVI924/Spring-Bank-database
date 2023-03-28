package collectionconstructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Solution {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext s1=new ClassPathXmlApplicationContext("collectionconstructor/collection.xml");
	Bank b=(Bank)s1.getBean("bank");
	System.out.println(b);

	}

}
