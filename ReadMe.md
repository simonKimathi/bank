**1.	BankAccount class**\
a.	Create a BankAccount base class\
b.	In BankAccount base class, create these methods. You have to make them work\
_•	Properties_\
o	AccountNumber (text)\
	Add validation to make this to be of length = 6\
o	Name (text)\
o	Balance (decimal)\
	Add validation to make sure this cannot be negative\
o	DateCreated (date)\
	Add validation to make sure this cannot be a future date\
_•	Constructors_\
o	Create a constructor without any parameters\
	Set DateCreated to the current date\
o	Create a constructor with 3 parameters\
	Set DateCreated to the current date\
_•	DisplayAccountInfo()_
o	This method will display Account Number, Name and Balance\
_•	Deposit()_
o	Takes 1 input parameter “amount” of type decimal\
o	Adds amount to Balance\
o	Write Balance to Console\
_•	Withdraw()_\
o	Takes 1 input parameter “amount” of type decimal\
	If Balance is > amount, then subtract amount from Balance \
	Else write an error to console\
o	Write Balance to Console\
_•	CalculateInterest()_\
o	Write to Console “This method will calculate Interest”\
**SavingsAccount – Derived class from BankAccount base class**\
_•	Properties_\
o	Balance (decimal\
	Add validation to make sure this cannot be less than 2500\
_•	Constructors_\
o	Create a constructor without any parameters\
	Call the base class constructor\
o	Create a constructor with 3 parameters\
	Call the base class constructor\
_•	CalculateInterest()_\
o	Calculate 5% interest per year and addthis interest to Balance \
o	Write to Console “Added interest and updated Balance”\
_•	Withdraw() method_\
o	If Balance is < 2500, write to Console an error message “Insufficient balance”\
o	Else call the Withdraw method of the base class\
**CheckingAccount – Derived class**\
_•	Properties_\
o	Balance (decimal)\
	Add validation to make sure this cannot be less than 500\
_•	Constructors_\
o	Create a constructor without any parameters\
	Call the base class constructor\
o	Create a constructor with 3 parameters
	Call the base class constructor\
_•	CalculateInterest()_\
o	Calculate 0.75% interest per year and add this interest to Balance \
o	Write to Console “Added interest and updated Balance”\
_•	Withdraw() method_\
o	If Balance is < 500, write to Console an error message “Insufficient balance”\
o	Else call the Withdraw method of the base class\
There are exceptions to handle account length,withdraws,negative bal,and accounts creation requirements(checking and savings)\ 

