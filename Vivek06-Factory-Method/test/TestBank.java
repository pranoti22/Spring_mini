import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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
		Bank bank1 =  ctx.getBean("b",Bank.class);
		Bank bank2 =  ctx.getBean("b",Bank.class);
		System.out.println("Is it a singleton "+(bank1==bank2));
	  //  System.out.println(ctx.getClass().getName());
		//System.out.println("New Balance after withdrawal= "+bank1.withdraw(50, 1234));
		((ConfigurableApplicationContext)ctx).close();//desotry-method is called if closed for singleton
		System.out.println("Is it a singleton "+(bank1==bank2));

	}

}
