package ETicaretProje;

import ETicaretProje.business.concretes.UserManager;
import ETicaretProje.business.concretes.VerificafitionManager;
import ETicaretProje.entities.concretes.User;
import ETicaretProje.dataAccess.concretes.HibermateUserDao;
public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setFirstName("Yusuf");
		user.setLastName("Kukuþ");
		user.setEmail("yusuf@gmail.com");
		user.setPassword("987654321");
		
		UserManager userManager = new UserManager(new HibermateUserDao());
		userManager.add(user);
		
		VerificafitionManager manager = new VerificafitionManager(userManager, null);
		manager.login("Yusuf@gmail.com", "987654321");
		manager.register(1, "Yusuf", "Kukuþ", "yusuf@gmail.com", "987654321");

	}

}
