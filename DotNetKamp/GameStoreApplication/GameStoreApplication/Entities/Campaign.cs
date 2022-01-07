using System;
using System.Collections.Generic;
using System.Text;

namespace GameStoreApplication.Entities
{
    public class Campaign
    {
        public int Id { get; set; }
        public string CampaignName { get; set; }
        public int DiscountPercentage { get; set; }
    }
}
