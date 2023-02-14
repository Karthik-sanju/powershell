
import java.util.Date;
public class Transaction {


    int transactionId;
    int groceryId;
    int customerId;
    String dateOfPurchase;
    
    public Transaction(int tid, int gid, int cid, String  date  ) {
   	 transactionId = tid;
   	 groceryId = gid;
   	 customerId= cid;
   	 dateOfPurchase =date; 
   	 
   	 
   	
   	
    }

}
