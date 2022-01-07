using System;
using System.Collections.Generic;
using System.Text;

namespace GameStoreApplication.Entities
{
    public class Player
    {
        public int Id { get; set; }
        public long TcNo { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public DateTime DateOfBirth { get; set; }
    }
}
