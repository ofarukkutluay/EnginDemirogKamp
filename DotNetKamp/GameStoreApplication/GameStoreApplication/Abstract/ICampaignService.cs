using System;
using System.Collections.Generic;
using System.Text;
using GameStoreApplication.Entities;

namespace GameStoreApplication.Abstract
{
    interface ICampaignService
    {
            void Add(Campaign campaign);
            void Update(Campaign campaign);
            void Delete(Campaign campaign);
            void GetAll();
            void Get(Campaign campaign);
    }

}
