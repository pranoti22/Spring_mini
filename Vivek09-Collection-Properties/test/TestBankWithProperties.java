


import java.util.Properties;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import bank.server.Bank;




public class TestBankWithProperties {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
	
		
		
		ApplicationContext ctx =new ClassPathXmlApplicationContext("application-Props.config.xml");
		
		Bank bank1 = (Bank) ctx.getBean("bankService");
		Bank bank2 = (Bank) ctx.getBean("bankService");
		System.out.println("Is it a singleton "+(bank1==bank2));
	  
		System.out.println("New Balance after withdrawal= "+bank1.withdraw(50, 1234));
		Properties accountTypes = bank1.showAccountServicesByName();
		System.out.println(accountTypes);
		
		for(Object acctType :accountTypes.keySet() ){
			System.out.println("Account Service with map Acocunt Type ="+acctType+" Details "+accountTypes.get(acctType));
		}
		

	}

}
