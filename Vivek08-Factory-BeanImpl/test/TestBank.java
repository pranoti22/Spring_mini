import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bank.iserver.internal.service.AccountRepository;
import bank.server.Bank;
import bank.server.internal.Account;
import bank.server.internal.AccountRepositoryImpl;
import bank.server.internal.BankImpl;


public class TestBank {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
	
		
		ApplicationContext ctx =new ClassPathXmlApplicationContext("application-config.xml");
		Bank bank1 = (Bank) ctx.getBean("bankService");
	//	Bank bank2 = (Bank) ctx.getBean("bankService");
		//System.out.println("Is it a singleton "+(bank1==bank2));
	  //  System.out.println(ctx.getClass().getName());
		System.out.println("New Balance after withdrawal= "+bank1.withdraw(50, 1234));
		

	}

}
