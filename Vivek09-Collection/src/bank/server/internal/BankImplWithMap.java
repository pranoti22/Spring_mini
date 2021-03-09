package bank.server.internal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import bank.iserver.internal.service.AccountRepository;
import bank.iserver.internal.service.AccountService;
import bank.server.*;


import bank.server.Bank;

public class BankImplWithMap implements Bank {
	
    AccountRepository accountRepo;
    String bankName;
    int branchCode;
    Map<String,AccountService> accountTypes = new HashMap<String, AccountService>();
    
	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}

	public AccountRepository getAccountRepo() {
		return accountRepo;
	}

	public void setAccountRepo(AccountRepository accountRepo) {
		this.accountRepo = accountRepo;
	}

	private BankImplWithMap() {
		super();
		System.out.println("Private constructor called");
		// TODO Auto-generated constructor stub
	}

	private BankImplWithMap(AccountRepository accountRepo,Map<String,AccountService> acctTypes) {
		super();
		this.accountRepo = accountRepo;
		this.accountTypes = acctTypes;
		System.out.println("Private Overloaded constructor called");
	}

	@Override
	public int withdraw(int amount, int acctNo) {
		Account acct = accountRepo.findAccountByAcctNumber(acctNo);
		acct.setBalance(acct.getBalance()-amount);
		return acct.getBalance();

	}

	@Override
	public Map<String, AccountService> showAccountServicesByName() {
		return accountTypes;
	}
	public Collection<AccountService> showAccountServices(){
		return null;
	}

}
