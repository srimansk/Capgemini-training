package project1;

public class bank {
	    private Bankaccount[] Accounts;
	    private int count;
	    public bank(){
	        Accounts =new Bankaccount[10];
	        count=0;
	    }
	    public  void addaccount(Bankaccount account){
	        Accounts[count++]=account;
	    }

	    public Bankaccount serachaccount(int accno) throws invalidaccount{

	        for (int i=0;i<count;i++){
	            if(Accounts[i].getAccno()==accno){
	                return Accounts[i];
	            }
	        }

	        throw new invalidaccount("Account is not found");
	    }


	}

