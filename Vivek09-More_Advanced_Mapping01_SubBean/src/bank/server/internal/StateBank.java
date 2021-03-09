package bank.server.internal;

import java.util.Collection;

import bank.iserver.internal.service.AccountRepository;
import bank.iserver.internal.service.AccountService;

public class StateBank  extends BankImpl  {
	
	StateBank(){
		System.out.println("in statebank construter");
		}
	protected StateBank(AccountRepository accountRepo,Collection<AccountService> acctTypes) {
		super(accountRepo,acctTypes);
		this.accountRepo = accountRepo;
		this.accountTypes = acctTypes;
		System.out.println("Private Overloaded constructor of statebank called");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return super.getBankName();
	}

	@Override
	public void setBankName(String bankName) {
		// TODO Auto-generated method stub
		super.setBankName(bankName);
	}

	@Override
	public int getBranchCode() {
		// TODO Auto-generated method stub
		return super.getBranchCode();
	}

	@Override
	public void setBranchCode(int branchCode) {
		// TODO Auto-generated method stub
		super.setBranchCode(branchCode);
	}

	
	

}
