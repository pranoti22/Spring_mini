package bank.server.internal;

import java.util.Collection;

import bank.iserver.internal.service.AccountRepository;
import bank.iserver.internal.service.AccountService;

public class AxisBank extends BankImpl {
	
	AxisBank(){
		System.out.println("in axisbank construter");
		}
	 AxisBank(AccountRepository accountRepo,Collection<AccountService> acctTypes) {
		super(accountRepo,acctTypes);
		this.accountRepo = accountRepo;
		this.accountTypes = acctTypes;
		System.out.println("Private Overloaded constructor of axisbank called");
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

	@Override
	public AccountRepository getAccountRepo() {
		// TODO Auto-generated method stub
		return super.getAccountRepo();
	}

	@Override
	public void setAccountRepo(AccountRepository accountRepo) {
		// TODO Auto-generated method stub
		super.setAccountRepo(accountRepo);
	}

	@Override
	public int withdraw(int amount, int acctNo) {
		// TODO Auto-generated method stub
		return super.withdraw(amount, acctNo);
	}

	@Override
	public Collection<AccountService> showAccountServices() {
		// TODO Auto-generated method stub
		return super.showAccountServices();
	}
	
	

}
