package abstracts;
import Entities.Compaign;


public interface GameCompaignService {
	void addCampaign(Compaign compaign);
	void updateCampaign(Compaign compaign);
	void deleteCampaign(Compaign compaign);

}
