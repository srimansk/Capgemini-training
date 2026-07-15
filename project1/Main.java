package project1;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	    public static void main(String[] args) {
	        Scanner ob=new Scanner(System.in);
	        bank Bank=new bank();
	        Bank.addaccount(new Bankaccount(93859,"Sriman",500000));
	        Bank.addaccount(new Bankaccount(45166,"Ragul",350000));
	        try{
	            System.out.println("Enter sender Account NO:");
	            int s=ob.nextInt();
	            System.out.println("Enter reciver Account NO: ");
	            int r=ob.nextInt();
	            System.out.println("Enter the Amount: ");
	            double amo=ob.nextDouble();

	            Bankaccount sendobj=Bank.serachaccount(s);
	            Bankaccount recioverobj=Bank.serachaccount(r);
	            sendobj.transfer(recioverobj,amo);
	            sendobj.display();
	            recioverobj.display();
	        }
	        catch (invalidaccount am){
	            System.err.println(am);
	        }
	        catch (invalidamount a){
	            System.err.println(a);
	        }
	        catch (dailylimit d){
	            System.err.println(d);
	        }
	        catch (balanceException bal){
	            System.err.println(bal);
	        }

	    }
	}

