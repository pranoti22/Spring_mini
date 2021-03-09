package bank.server.internal;

import bank.iserver.internal.service.AccountRepository;
import bank.server.Bank;

public class BankFactory {
	public Bank  getInstance(AccountRepository acctRepo){
		System.out.println("Factory Method called with repository "+acctRepo);
		BankImpl b = new BankImpl();
		b.setAccountRepo(acctRepo);
		return b;
		
	}

}
