package abstracts;
import Entities.*;
public interface GamerService {
	void signIn(Gamer gamer);
	void update(Gamer gamer);
	void delete(Gamer gamer);

}
