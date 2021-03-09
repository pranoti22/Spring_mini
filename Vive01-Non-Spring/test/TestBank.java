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
		AccountRepository acctRepo = 
			new AccountRepositoryImpl();
	    Bank bank = new BankImpl(acctRepo);
		int balance = bank.withdraw(50, 1234);
		System.out.println("New balance = "+balance);

	}

}
