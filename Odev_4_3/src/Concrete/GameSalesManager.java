package Concrete;

import Entities.Compaign;
import Entities.Sales;
import abstracts.GameSalesService;

public class GameSalesManager implements GameSalesService {

	@Override
	public void sellGame(Sales sales, Compaign cmpaign) {
		System.out.println(cmpaign.getCompaignId()+" kampanya id si ile "+sales.getSaleId()+" id'li satis gerceklestirildi.");
		
	}

}
