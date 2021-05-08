package ETicaretProje.business.abstracts;

import ETicaretProje.entities.concretes.User;

public interface UserValidationService {
	
	boolean validate(User user);
}
