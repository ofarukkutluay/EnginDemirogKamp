using System;
using System.Collections.Generic;
using System.Text;
using GameStoreApplication.Entities;

namespace GameStoreApplication.Abstract
{
    public interface IPlayerCheckService
    {
        bool CheckIfRealPerson(Player player);
    }
}
