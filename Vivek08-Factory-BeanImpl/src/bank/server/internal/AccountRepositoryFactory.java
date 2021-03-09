package bank.server.internal;

import org.springframework.beans.factory.FactoryBean;

import bank.iserver.internal.service.AccountRepository;
import bank.server.Bank;

public class AccountRepositoryFactory implements FactoryBean<AccountRepository> {
	public AccountRepository  getObject(){
		System.out.println("Factory Method called for RepositoryFactory class");
		return new AccountRepositoryImpl();
		
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		System.out.println("GetObject Type called on AccountRepoFactory");
		return AccountRepository.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		//This method is called at least once during ApplicationContext creation.
		System.out.println("Is Singleton Called on accountRepoFactory ");
		return false;
	}
	

}
