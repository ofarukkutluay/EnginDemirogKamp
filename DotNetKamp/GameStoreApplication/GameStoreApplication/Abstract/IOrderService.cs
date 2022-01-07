using System;
using System.Collections.Generic;
using System.Text;
using GameStoreApplication.Entities;

namespace GameStoreApplication.Abstract
{
    interface IOrderService
    {
        void Buy(int id,Game game,Player player,int quantitiy, Campaign campaign);
        void Get(Order order);
        void GelAll();

    }
}
