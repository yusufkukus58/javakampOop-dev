package ETicaretProje.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ETicaretProje.dataAccess.abstracts.UserDao;
import ETicaretProje.entities.concretes.User;

public class HibermateUserDao implements UserDao {
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
	 users.add(user);
	 System.out.println(" Kullanýcý eklendi :"+user.getFirstName()+" " + user.getLastName());
	}

	@Override
	public void delete(User user) {
		 users.add(user);
		 System.out.println(" Kullanýcý silindi :"+user.getFirstName()+" " + user.getLastName());		
	}

	@Override
	public void update(User user) {
		 users.add(user);
		 System.out.println(" Kullanýcý güncellendi :"+user.getFirstName()+" " + user.getLastName());		
	}

	@Override
	public User getId(int id) {
		for(User user : users) {
			if(user.getId()==id) {
				return user;
				
			}
			
		}
		return null;
	}

	@Override
	public User getByEmail(String email) {
		for(User user : users) {
			if(user.getEmail() == email) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
	
		return null;
	}
	

}
