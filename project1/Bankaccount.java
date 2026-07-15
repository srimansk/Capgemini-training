package project1;

public class Bankaccount {
	    private int accno;
	    private String name;
	    private double amount;
	    static final double DAILY_LIMIT =100000;

	    public Bankaccount(int accno,String name,double amount){
	        this.accno=accno;
	        this.name=name;
	        this.amount=amount;
	    }

	    public int getAccno(){
	        return accno;
	    }
	    public  String getName(){
	        return name;
	    }
	    public double getAmount(){
	        return amount;
	    }
	    public void deposit(double amo) throws invalidamount{
	        if(amo<=0){
	            throw new invalidamount("Deposit amoutn is "+amo+" greater then zero");
	        }
	        amount=amo;
	    }
	    public void with(double amo) throws invalidamount,invalidaccount,balanceException,dailylimit{
	        if(amo<=0){
	            throw new invalidamount("greater then zero");
	        }
	        if(amo>amount){
	            throw new balanceException("Invalid Account balance");
	        }
	        if(DAILY_LIMIT<amo){
	            throw new dailylimit("Daily limit is only "+DAILY_LIMIT+" the ");
	        }
	        amount-=amo;
	        System.out.println("Withdraw Successfully "+amo);
	        System.out.println("Balance is: "+amount);

	    }

	    public void  transfer(Bankaccount data, double amount) throws
	            invalidamount,invalidaccount,dailylimit,balanceException{
	        with(amount);
	        data.amount+=amount;
	        System.out.println("Successfully transfer");
	    }
	    public void display(){
	        System.out.println("-----------------------------------------");
	        System.out.println("Account number : "+accno);
	        System.out.println("Account Holder name : "+name);
	        System.out.println("Balance : "+amount);
	    }
	}

