using System;
using System.Collections.Generic;
using System.Text;

namespace GameStoreApplication.Entities
{
    public class Order
    {
        public int Id { get; set; }
        public int PlayerId { get; set; }
        public int GameId { get; set; }
        public int Quantitiy { get; set; }
        public double Payment { get; set; }
    }
}
