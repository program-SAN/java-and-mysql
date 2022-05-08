package revision;

import java.util.Scanner;
class Customer {
    Scanner Cust_data = new Scanner(System.in);
    long ph_no;
    String name,password;
    void readDetails()
    {
        System.out.println("Enter name");
        name=Cust_data.nextLine();
        System.out.println("Enter password");
        password=Cust_data.nextLine();
        System.out.println("Enter phone number");
        ph_no=Cust_data.nextLong();
    }
}
class Accounts {
    Scanner Acct_data = new Scanner(System.in);
    long acct_num,balance;
    String Status;
    void readAcctDetails()
    {
        System.out.println("Enter account number");
        acct_num= Acct_data.nextLong();
        balance=40000;
        Status="Active";
    }
}
class RBI_bank{
    Customer c= new Customer();
    Accounts a= new Accounts();
    float Int_rate,withdrawl_limit;

    public void readData(){
        c.readDetails();
        a.readAcctDetails();
    }
    public float InterestRate()
    {
        Int_rate=5f;
        return Int_rate;
    }
    public float WithdrawalLimit()
    {
        withdrawl_limit=30000f;
        return withdrawl_limit;
    }
}
class SBI_bank extends RBI_bank
{
    //here override the InterestRate and WithdrawalLimit
    public float  InterestRate()
    {
        Int_rate=7.5f;
        return Int_rate;
    }
    public float  WithdrawalLimit()
    {
        withdrawl_limit=25000f;
        return withdrawl_limit;
    }
}
class ICICI_bank extends RBI_bank
{
    //here override the InterestRate and WithdrawalLimit
    public float  InterestRate()
    {
        Int_rate=6.5f;
        return Int_rate;
    }
    public float  WithdrawalLimit()
    {
        withdrawl_limit=25000f;
        return withdrawl_limit;
    }
}
class  assignment_3_ooc
{
    public static void main(String args[])
    {
        RBI_bank r=new RBI_bank();
        r.readData();
        System.out.println("");
        r.WithdrawalLimit();
        System.out.println("Interest Rate for RBI bank="+ r.InterestRate());
        System.out.println("Withdrawl Limit for RBI bank="+ r.WithdrawalLimit());
        System.out.println("");
        SBI_bank s =new SBI_bank();
        System.out.println("Interest Rate for SBI="+ s.InterestRate());
        System.out.println("Withdrawl Limit for SBI="+ s.WithdrawalLimit());
        System.out.println("");
        ICICI_bank i=new ICICI_bank();
        System.out.println("Interest Rate for ICICI="+ i.InterestRate());
        System.out.println("Withdrawl Limit for ICICI="+ i.WithdrawalLimit());

    }
}