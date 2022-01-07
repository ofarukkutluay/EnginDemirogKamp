using System;
using System.Collections.Generic;
using System.Text;
using GameStoreApplication.Abstract;
using GameStoreApplication.Entities;
using MernisServiceReference;


namespace GameStoreApplication.Adapters
{
    public class MernisServiceAdapter:IPlayerCheckService
    {
        public bool CheckIfRealPerson(Player player)
        {

            return true;
        }
    }
}
