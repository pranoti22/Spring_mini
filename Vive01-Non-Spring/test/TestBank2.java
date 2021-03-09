import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bank.iserver.internal.service.AccountRepository;
import bank.server.Bank;
import bank.server.internal.Account;
import bank.server.internal.AccountRepositoryImpl;
import bank.server.internal.BankImpl;


public class TestBank2 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		AccountRepository repos = new AccountRepositoryImpl();
		Bank bank = new BankImpl(repos);
		bank.withdraw(50, 1234);
		Account acct = repos.findAccountByAcctNumber(1234);
		System.out.println("Balance after withdrawal "+acct.getBalance());
		
	
	
		

	}

}
