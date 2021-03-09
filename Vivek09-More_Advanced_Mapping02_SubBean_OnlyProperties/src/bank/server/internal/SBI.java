package bank.server.internal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import bank.iserver.internal.service.AccountRepository;
import bank.iserver.internal.service.AccountService;
import bank.server.*;


import bank.server.Bank;

public class SBI implements Bank {
	
    AccountRepository accountRepo;
    String bankName;
    int branchCode;
    Properties accountTypes;
    
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

	private SBI() {
		super();
		System.out.println("Private constructor called");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SBI [bankName=" + bankName + ", branchCode=" + branchCode + "]";
	}

	private SBI(AccountRepository accountRepo,Properties acctTypes) {
		super();
		this.accountRepo = accountRepo;
		this.accountTypes = acctTypes;
		System.out.println("Private Overloaded constructor SBI called");
	}

	@Override
	public int withdraw(int amount, int acctNo) {
		Account acct = accountRepo.findAccountByAcctNumber(acctNo);
		acct.setBalance(acct.getBalance()-amount);
		return acct.getBalance();

	}

	
	public Properties showAccountServicesByName() {
		return accountTypes;
	}
	public Collection<AccountService> showAccountServices(){
		return null;
	}

}
