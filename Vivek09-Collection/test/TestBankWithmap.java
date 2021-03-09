import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bank.iserver.internal.service.AccountRepository;
import bank.iserver.internal.service.AccountService;
import bank.server.Bank;
import bank.server.internal.Account;
import bank.server.internal.AccountRepositoryImpl;
import bank.server.internal.BankImpl;


public class TestBankWithmap {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
	
		
		//ApplicationContext ctx =new ClassPathXmlApplicationContext("application-list.config.xml");
		ApplicationContext ctx =new ClassPathXmlApplicationContext("application-Map.config.xml");
		//ApplicationContext ctx =new ClassPathXmlApplicationContext("application-Set.config.xml");
		Bank bank1 = (Bank) ctx.getBean("bankService");
		Bank bank2 = (Bank) ctx.getBean("bankService");
		System.out.println("Is it a singleton "+(bank1==bank2));
	  //  System.out.println(ctx.getClass().getName());
		System.out.println("New Balance after withdrawal= "+bank1.withdraw(50, 1234));
		Map<String,AccountService> accountTypes = bank1.showAccountServicesByName();
		System.out.println(accountTypes);
		
		for(String acctType :accountTypes.keySet() ){
			System.out.println("Account Service with map Acocunt Type ="+acctType+" Details "+accountTypes.get(acctType));
		}
		

	}

}
