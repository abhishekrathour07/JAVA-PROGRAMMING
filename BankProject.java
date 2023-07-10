class bankdetails{
     double bal;
    double Trans;
    String customerName;
    String customerId;
   bankdetails(String customerName,String customerId){
        this.customerName=customerName;
        this.customerId=customerId;
    }

    void deposit(double amt){
        if(amt!=0){
            bal+=amt;
            Trans=amt;
        }
    }
    void withdraw(double amt){
        if(amt!=0 && bal>=amt){
            bal-=amt;
            Trans=-amt;
        }
        else if(bal<amt){
            System.out.println("Bank balance insufficient");
        }
    }
     void getPreviousTrans(){
        if(Trans>0){
            System.out.println("Deposited: "+Trans);
        }
        else{
            System.out.println("No transaction occured");
        }
    }

}

public class BankProject {
    
}
