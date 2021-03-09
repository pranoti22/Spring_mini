package bank.server;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;

import bank.iserver.internal.service.AccountService;

public interface Bank {
	int withdraw(int amount , int acctNo);
	Collection<AccountService> showAccountServices();
	
}
