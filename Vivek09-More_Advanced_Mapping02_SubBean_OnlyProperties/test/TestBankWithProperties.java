


import java.util.Properties;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import bank.server.Bank;




public class TestBankWithProperties {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
	
		
		
		ApplicationContext ctx =new ClassPathXmlApplicationContext("application-Props.config.xml");
		// Bank b = ctx.getBean(Bank.class); this will throw NoUniqueBean Exception
		//System.out.println("Bank b="+b);
		// Bank b = (Bank) ctx.getBean("bankService");  you will get BeanIsAbstractException:
		
		Bank bank1 = (Bank) ctx.getBean("sbi");
		System.out.println(bank1);
		Bank bank2 = (Bank) ctx.getBean("axis");
		System.out.println(bank2);
	   
		System.out.println("New Balance after withdrawal= "+bank1.withdraw(50, 1234));
		Properties accountTypes = bank2.showAccountServicesByName();
		System.out.println(accountTypes);
		
		for(Object acctType :accountTypes.keySet() ){
			System.out.println("Account Service with map Acocunt Type ="+acctType+" Details "+accountTypes.get(acctType));
		}
		

	}

}
