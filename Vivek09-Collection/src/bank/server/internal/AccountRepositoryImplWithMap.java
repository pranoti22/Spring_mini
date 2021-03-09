package bank.server.internal;

import static java.lang.String.format;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import bank.iserver.internal.service.AccountRepository;

public class AccountRepositoryImplWithMap implements AccountRepository {

	Map<String, Account> accounts = new HashMap<String, Account>();
	public AccountRepositoryImplWithMap() {
		System.out.println("AccountRepository Impl constructor called");
	   Account acct1 = new Account(100, "Vivek", 1234);
	   accounts.put("saving",acct1);
	   Account acct2 = new Account(200, "Krishna", 12345);
	   accounts.put("current", acct2);
	   Account acct3 = new Account(300, "Shriram", 123456);
	   accounts.put("loan", acct3);
	}
	@Override
	public Account findAccountByAcctNumber(int acctNo) {
		for(String acct : accounts.keySet()){
			if( accounts.get(acct).getAcctNo() == acctNo)
			return accounts.get(acct);
		}
		return null;
	}
	public  Account createAccount(String name, int balance, int acctNo){
		return new Account(balance,name,acctNo);
	}

}
