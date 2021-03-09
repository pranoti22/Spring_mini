


import java.util.Collection;
import java.util.Properties;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import bank.iserver.internal.service.AccountService;
import bank.server.Bank;




public class TestBank {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
	
		
		
		ApplicationContext ctx =new ClassPathXmlApplicationContext("application-Props.config.xml");
		
		Bank bank1 = (Bank) ctx.getBean("sbi");
		Bank bank11 = (Bank) ctx.getBean("sbi");
		Bank bank2 = (Bank) ctx.getBean("axis");
		System.out.println(bank1);
		System.out.println(bank2);
	//  This will throw	 org.springframework.beans.factory.BeanIsAbstractException:
	//	Bank bank3 = (Bank) ctx.getBean("bankService");
		System.out.println("Is SBI a singleton "+(bank1==bank11));
		System.out.println("Is SBI and axis singleton "+(bank1==bank2));
	  
		//System.out.println("New Balance after withdrawal= "+bank1.getBankName());
		Collection<AccountService> accountTypes = bank1.showAccountServices();
		System.out.println(accountTypes);
		
		for(AccountService acctType :accountTypes ){
			System.out.println("Account Service Acocunt Type ="+acctType);
		}
		

	}

}
