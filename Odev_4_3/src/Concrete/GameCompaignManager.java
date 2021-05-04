package Concrete;

import Entities.Compaign;
import abstracts.GameCompaignService;

public class GameCompaignManager implements GameCompaignService{

	@Override
	public void addCampaign(Compaign compaign) {
		System.out.println(compaign.getCompaignId()+" id'li kampanya eklendi");
		
	}

	@Override
	public void updateCampaign(Compaign compaign) {
		System.out.println(compaign.getCompaignId()+" id'li kampanya güncellendi");
		
	}

	@Override
	public void deleteCampaign(Compaign compaign) {
		System.out.println(compaign.getCompaignId()+" id'li kampanya silindi");
		
	}

}
