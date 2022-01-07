using System;
using System.Collections.Generic;
using System.Text;
using GameStoreApplication.Abstract;
using GameStoreApplication.Entities;

namespace GameStoreApplication.Concrete
{
    public class CampaignManager:ICampaignService
    {
        private List<Campaign> _campaigns = new List<Campaign>();
        public void Add(Campaign campaign)
        {
            _campaigns.Add(campaign);
        }

        public void Update(Campaign campaign)
        {
            foreach (var cmpgn in _campaigns)
            {
                if (cmpgn == campaign)
                {
                    int index = _campaigns.IndexOf(cmpgn);
                    Console.WriteLine("{0} indexteki {1} id {2} adında ki kampanyanın indirim oranı: {3}", index,
                        cmpgn.Id, cmpgn.CampaignName, cmpgn.DiscountPercentage);
                    Console.Write("Neyi güncellemek istiyorsunuz? 1- Kampanya Adı 2-İndirim Oranı");
                    var secim = Console.ReadLine();
                    int secimInt = Convert.ToInt32(secim);
                    if (secimInt == 1)
                    {
                        Console.Write("Yeni adı giriniz = ");
                        var updateGameName = Console.ReadLine();
                        _campaigns[index].CampaignName = updateGameName;

                    }
                    else if (secimInt == 2)
                    {
                        Console.Write("Yeni Stok giriniz = ");
                        var updateStock = Console.ReadLine();
                        _campaigns[index].DiscountPercentage = Convert.ToInt32(updateStock);

                    }
                    else
                    {
                        Console.WriteLine("Hatalı seçim yaptınız!");
                    }
                    Get(cmpgn);
                    break;
                }

            }
            Console.WriteLine("Kayıt Bulunamadı!!!!");
        }

        public void Delete(Campaign campaign)
        {
            foreach (var cmpgn in _campaigns)
            {
                if (cmpgn == campaign)
                {
                    int index = _campaigns.IndexOf(cmpgn);
                    Console.WriteLine("{0} indexteki {1} id kampanya silindi!", index, cmpgn.Id);
                    _campaigns.Remove(cmpgn);
                    break;
                }
                else
                {
                    Console.WriteLine("Kayıt Bulunamadı!!!!");
                }
            }
            
        }

        public void GetAll()
        {
            Console.WriteLine("----------- Tüm Kampanyalar -------------");
            foreach (Campaign cmpgn in _campaigns)
            {
                Console.WriteLine("{0} id, adı {1}, İndirim oranı: {2}",
                    cmpgn.Id, cmpgn.CampaignName, cmpgn.DiscountPercentage);
            }
            Console.WriteLine("----------- --------------- -------------");
        }

        public void Get(Campaign campaign)
        {
            throw new NotImplementedException();
        }
    }
}
