package bank.server.internal;
import bank.iserver.internal.service.AccountRepository;
import bank.server.*;


import bank.server.Bank;

public class BankImpl implements Bank {
	
    AccountRepository accountRepo;
    String bankName;
    int branchCode;
    
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

	private BankImpl() {
		super();
		System.out.println("Private constructor called");
		// TODO Auto-generated constructor stub
	}

	 BankImpl(AccountRepository accountRepo) {
		super();
		this.accountRepo = accountRepo;
		System.out.println("Private Overloaded constructor called");
	}

	@Override
	public int withdraw(int amount, int acctNo) {
		Account acct = accountRepo.findAccountByAcctNumber(acctNo);
		acct.setBalance(acct.getBalance()-amount);
		return acct.getBalance();

	}
   public static Bank  getInstance(AccountRepository acctRepo1,int branchCode){
	   System.out.println("DEBUG : Calling factory method with branchCode"+branchCode);
	   return new BankImpl(acctRepo1);  
   }
   
   public static Bank getInstance()
   {
	   return  new BankImpl();  
   }
   
   public void init()
   {
	   System.out.println("this is init method");
   }
   public void destroy()
   {
	   System.out.println("this is destroy method");
   }
}
