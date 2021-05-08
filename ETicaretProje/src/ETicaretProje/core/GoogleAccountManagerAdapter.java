package ETicaretProje.core;

public class GoogleAccountManagerAdapter implements VerificationService {

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
     GoogleAccountManagerAdapter manager = new GoogleAccountManagerAdapter();
     manager.register(id, firstName, lastName, email, password);
		
	}

	@Override
	public void login(String email, String password) {
		   GoogleAccountManagerAdapter manager = new GoogleAccountManagerAdapter();
		   manager.login(email, password);
	
		
	}

}
