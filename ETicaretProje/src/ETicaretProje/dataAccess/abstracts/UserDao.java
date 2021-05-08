package ETicaretProje.dataAccess.abstracts;

import java.util.List;

import ETicaretProje.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	User getId(int id);
	User getByEmail(String email);
	List<User> getAll();

}
