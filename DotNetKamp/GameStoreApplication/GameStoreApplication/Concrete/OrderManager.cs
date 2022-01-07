using System;
using System.Collections.Generic;
using System.Text;
using GameStoreApplication.Abstract;
using GameStoreApplication.Entities;

namespace GameStoreApplication.Concrete
{
    public class OrderManager:IOrderService
    {
        private List<Order> _orders = new List<Order>();
        

        public void Buy(int id,Game game, Player player, int quantitiy ,Campaign campaign)
        {
            double payment = Convert.ToDouble(quantitiy * Convert.ToInt32(game.Price) * (campaign.DiscountPercentage / 100));
            Order order = new Order
            {
                Id = id,
                GameId = game.Id,
                PlayerId = player.Id,
                Quantitiy = quantitiy,
                Payment = payment
            };
            _orders.Add(order);
            
        }


        public void Get(Order order)
        {
            Console.WriteLine(order);
        }

        public void GelAll()
        {
            Console.WriteLine("----------- Tüm Siparişler -------------");
            
            foreach (var ordr in _orders)
            {
                Console.WriteLine("{0} id, {1} GameID, {2} PlayerID, {3} Adet , {4} tutarında oyun alındı.",ordr.Id,
                    ordr.GameId,ordr.PlayerId,ordr.Quantitiy,ordr.Payment);
            }
            Console.WriteLine("----------- --------------- -------------");
        }
    }
}
