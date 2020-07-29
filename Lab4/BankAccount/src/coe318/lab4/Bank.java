package coe318.lab4;

/**
*
* @author Daniel Khan(500898010)
*/

public class Bank {
   private String name;
   /**
    * An array of Accounts managed by
    * this bank.
    */
   private Account [] accounts;
   private int numAccounts;//number of active accounts

   public Bank(String name, int maxNumberAccounts) {
       this.name = name;
       accounts = new Account[maxNumberAccounts];
       numAccounts = 0;
   }


   /**
    * @return the name
    */
   public String getName() {
       return name;
   }

   /**
    * @return the numAccounts
    */
   public int getNumAccounts() {
       return numAccounts;
   }


   public Account[] getAccounts() {
       return accounts;
   }

   /**
    * Return true if the Bank already has an account
    * with this number; otherwise false.
    * @param accountNumber
    * @return
    */
   public boolean hasAccountNumber(int accountNumber) {
	   for (int i = 0; i < numAccounts; i++) {
		   if(accountNumber == accounts[i].getNumber()){
			   return true;
		   }
	   }
	   return false;
   }

   /**
    * Adds the specified account to the Bank if possible. If the account number
    * already exists or the Bank has reached its maximum
    * number of accounts, return false and do not add it; otherwise,
    * add it and return true.
    * @param account
    * @return true if successful
    */
   public boolean add(Account account) {
	   if(!hasAccountNumber(account.getNumber())){
		   accounts[numAccounts] = account;
		   numAccounts += 1;
		   return true;
	   }
	  return false;	  
   }

   @Override
   public String toString() {
       //DO NOT MODIFY THIS CODE
       String s = getName() + ": " + getNumAccounts() +
               " of " + getAccounts().length +
               " accounts open";
       for(Account account : getAccounts()) {
           if (account == null) break;
           s += "\n  " + account;
       }
       return s;
   }
   
   public static void main(String[] args) {
       Bank [] banks = {new Bank("Toronto Dominion", 3),
                        new Bank("Bank of Montreal", 5)};
       Bank td = banks[0];
       Bank bmo = banks[1];
       
       System.out.println(td);
       Account charlie = new Account("Charles", 234, 200.00);
       td.add(charlie);
       
       System.out.println(td);
       Account dora = new Account("Dora", 456, 300.00);
       td.add(dora);
       
       System.out.println("td has account # 456: " +
               td.hasAccountNumber(456));
       Account ed = new Account("Edward", 456, 400.00);
       
       for(Bank bank : banks) {
           if (bank.add(ed)) break;
       }
       
       for(Bank bank : banks) {
           System.out.println(bank);
       }
   }
}