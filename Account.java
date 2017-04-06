import java.util.Scanner;
class Account
{
int balance,no,amount;
Scanner obj =new Scanner(System.in);
public void details()
{
System.out.println("enter account no,balance ");
no=obj.nextInt();
balance=obj.nextInt();
}
public void deposit()
{
System.out.println("enter amount to be deposited");
amount=obj.nextInt();
balance=balance+amount;
}
public void withdraw() throws in

{
System.out.println("enter amount to be withdrawn");
amount=obj.nextInt();
if(amount>balance)
{
int needs;
needs=amount-balance;
throw new in(needs); 
}
else
{balance=balance-amount;}
}
}