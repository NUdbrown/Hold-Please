import edu.neumont.util.Client;
import edu.neumont.util.QueueableService;
import edu.neumont.util.Server;


public class Bank implements QueueableService {
	
	private LinkedList<Client> numCustomers = new LinkedList<Client>();
	private ArrayList<Server> numTellers = new ArrayList<Server>();
	private int numberOfTellers;
	
	public Bank(int numberOfTellers){
		this.numberOfTellers = numberOfTellers;
		
	}

	@Override
	public double getAverageClientWaitTime() {
	
		return 0;
	}

	@Override
	public double getClientWaitTime(Client client) {
		
		return 0;
	}

	@Override
	public boolean addClient(Client client) {
		
		return false;
	}

	@Override
	public void advanceMinute() {
		
		
	}


}
