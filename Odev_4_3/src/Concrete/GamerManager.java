package Concrete;

import Entities.Gamer;
import abstracts.GamerService;
import utils.*;

public class GamerManager implements GamerService{

	@Override
	public void signIn(Gamer gamer) {
		if(EdevletGamerChecker.checkIfPerson(gamer)) {
			System.out.println("Gamer kaydedildi : "+gamer.getFirstName());
		}		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Gamer güncellendi : "+gamer.getLastName());
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer silindi : "+gamer.getLastName());
		
	}

}
