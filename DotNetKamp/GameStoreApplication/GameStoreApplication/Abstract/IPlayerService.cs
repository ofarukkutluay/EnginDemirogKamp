using System;
using System.Collections.Generic;
using System.Text;
using GameStoreApplication.Entities;

namespace GameStoreApplication.Abstract
{
    interface IPlayerService
    {
        void Save(Player player);
        void Update(Player player);
        void Delete(Player player);
        void GetAll();
        void Get(Player player);

    }
}
