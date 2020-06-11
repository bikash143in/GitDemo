package qaclickacademy.MavenJava;

import org.testng.annotations.Test;

public class AppiumTest {

	@Test
	public void test1(){
		System.out.println("Test1");
		//mvn -Dtest=AppiumTest test 
		//mvn test -PRegression
	}
	@Test
	public void test2(){
		System.out.println("Test2");
	}
}
