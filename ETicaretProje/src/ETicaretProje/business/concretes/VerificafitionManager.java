package ETicaretProje.business.concretes;

import ETicaretProje.business.abstracts.UserService;
import ETicaretProje.business.abstracts.UserValidationService;
import ETicaretProje.core.VerificationService;
import ETicaretProje.entities.concretes.User;

public class VerificafitionManager implements VerificationService {
	UserService userService;
	UserValidationService userValidationService;

	public VerificafitionManager(UserService userService, UserValidationService userValidationService) {
		super();
		this.userService = userService;
		this.userValidationService = userValidationService;
	}

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		User user = new User(id,firstName,lastName,email,password);
		if(!userValidationService.validate(user)) {
			System.out.println("��lem ba�ar�s�z Tekrar deneyiniz .");
			return;
		}
		System.out.println("��lem ba�ar�l�");
		
	}

	@Override
	public void login(String email, String password) {
		System.out.println("Giri� i�lemi ba�ar�l� .");
		
	}
	

}
