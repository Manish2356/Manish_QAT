package test;

public class CurrentAccount implements BankAccount
	{

		@Override
		public void checkBankBalance() {
			System.out.println("the balance of current account can be viewed here");
			
		}

		@Override
		public void validateUser() {
			System.out.println("Valid current account holder");
		}
}
