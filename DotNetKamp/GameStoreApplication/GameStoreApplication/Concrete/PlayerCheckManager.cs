using System;
using System.Collections.Generic;
using System.Text;
using GameStoreApplication.Abstract;
using GameStoreApplication.Entities;
using MernisServiceReference;

namespace GameStoreApplication.Concrete
{
    public class PlayerCheckManager:IPlayerCheckService
    {
        public bool CheckIfRealPerson(Player player)
        {

            return true;
        }
    }
}
