package top.tamlong.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import top.tamlong.helloworld.HelloWorld;
import top.tamlong.helloworld.HelloWorldService;



public class HelloProgram {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
		HelloWorldService helloWorldService=(HelloWorldService) applicationContext.getBean("helloWorldService");
		HelloWorld helloWorld=helloWorldService.getHelloWorld();
		helloWorld.sayhello();
	}
}
