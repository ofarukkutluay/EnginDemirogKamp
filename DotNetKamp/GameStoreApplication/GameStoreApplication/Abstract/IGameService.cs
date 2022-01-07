using System;
using System.Collections.Generic;
using System.Text;
using GameStoreApplication.Entities;

namespace GameStoreApplication.Abstract
{
    interface IGameService
    {
        void Save(Game game);
        void Update(Game game);
        void Delete(Game game);
        void Get(Game game);
        void GetAll();

    }
}
