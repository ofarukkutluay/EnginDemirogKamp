using System;
using GameStoreApplication.Concrete;
using GameStoreApplication.Entities;

namespace GameStoreApplication
{
    class Program
    {
        static void Main(string[] args)
        {
            PlayerManager playerManager = new PlayerManager();
            GameManager gameManager = new GameManager();
            OrderManager orderManager = new OrderManager();
            CampaignManager campaignManager = new CampaignManager();

            Player player1 = new Player {Id = 1, FirstName = "Ahmet", LastName = "Kutluay",
                DateOfBirth = new DateTime(1996, 06, 25), TcNo = 112244493993};
            Player player2 = new Player {Id = 2, FirstName = "Ali", LastName = "Kutluay",
                DateOfBirth = new DateTime(2000, 06, 06), TcNo = 11224444444};
            Player player3 = new Player {Id = 3, FirstName = "Agah", LastName = "Kutluay",
                DateOfBirth = new DateTime(2002, 01, 25), TcNo = 112244493222};

            playerManager.Save(player1);
            playerManager.Save(player2);
            playerManager.Save(player3);
            
            playerManager.GetAll();

            Game game1 = new Game {Id = 1, GameName = "Crysis", Stock = 100, Price = 250};
            Game game2 = new Game {Id = 2, GameName = "Counter Strike", Stock = 250, Price = 50};
            Game game3 = new Game {Id = 3, GameName = "Witcher 3", Stock = 50, Price = 300};
            Game game4 = new Game {Id = 4, GameName = "Cyberpunk 2077", Stock = 300, Price = 500};

            gameManager.Save(game1);
            gameManager.Save(game2);
            gameManager.Save(game3);
            gameManager.Save(game4);
            
            gameManager.GetAll();

            Campaign campaign1 = new Campaign {Id = 1, CampaignName = "default", DiscountPercentage = 0};
            Campaign campaign2 = new Campaign { Id = 1, CampaignName = "Black Friday", DiscountPercentage = 50 };
            Campaign campaign3 = new Campaign { Id = 1, CampaignName = "Hafta Sonu", DiscountPercentage = 15 };

            campaignManager.Add(campaign1);
            campaignManager.Add(campaign2);
            campaignManager.Add(campaign3);
            
            campaignManager.GetAll();

            orderManager.Buy(1,game2,player1,2,campaign1);
            orderManager.Buy(2, game1, player2, 1,campaign3);
            orderManager.Buy(3, game3, player3, 4,campaign2);

            orderManager.GelAll();
            
            

        }
    }
}
