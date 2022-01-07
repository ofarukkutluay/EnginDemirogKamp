package Concrete;

import java.util.ArrayList;
import java.util.List;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {
	List<Campaign> campaigns = new ArrayList<Campaign>();
	

	@Override
	public void add(Campaign campaign) {
		this.campaigns.add(campaign);
		System.out.println(campaign.getName() + " kampanya eklendi!");
	}

	@Override
	public void update(Campaign campaign) {
		
			boolean dataGeldiMi=false;
			int index = 0;
			for (int i=0; i<this.campaigns.size();i++) {
				Campaign campaign1 = this.campaigns.get(i);
				if (campaign.getId()==campaign1.getId()) {
					index = i;
					dataGeldiMi=true;
					break;
				}
			}
			
			if (dataGeldiMi) {
				this.campaigns.set(index, campaign);
				System.out.println(campaign.getName() + " kampanya güncellendi!");
			}else {			
				System.err.println("Data bulunamadý!");
			}
		

	}

	@Override
	public void delete(Campaign campaign) {
		this.campaigns.remove(campaign);
		System.out.println(campaign.getName() + " kampanya silindi!");
	}

	@Override
	public void getAll() {
		for (Campaign campaign : campaigns) {
			System.out.println("Id : " + campaign.getId() + " Adý : " + campaign.getName() + " Ýndirim kodu : "
					+ campaign.getDiscountCode() + " Ýndirim Oraný% : " + campaign.getDiscountRate());
		}

	}

	@Override
	public Campaign getByDiscountCode(String discountCode) {
		int index = 0;
		boolean dataGeldiMi=false;
		for (int i=0; i<this.campaigns.size();i++) {
			Campaign campaign1 = this.campaigns.get(i);
			if (discountCode==campaign1.getDiscountCode()) {
				index = i;
				dataGeldiMi =true;
				break;
			}
		}
		if (dataGeldiMi) {
			return this.campaigns.get(index);
		}else {		
			System.err.println("Data bulunamadý!");
			return null;
		}
		
	}

}
