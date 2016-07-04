package spring.example.dependency.injection.starter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.example.dependency.injection.TextEditorConstructorBasedDI;
import spring.example.dependency.injection.TextEditorSetterBasedDI;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("dependency-injection.xml");

		TextEditorSetterBasedDI tesb = (TextEditorSetterBasedDI) context.getBean("textEditorSetterBasedDI");
		
		TextEditorConstructorBasedDI tecb = (TextEditorConstructorBasedDI) context.getBean(TextEditorConstructorBasedDI.class);
		
		tesb.spellCheck();
		
		tecb.spellCheck();
		
		context.close();
		
	}

}
