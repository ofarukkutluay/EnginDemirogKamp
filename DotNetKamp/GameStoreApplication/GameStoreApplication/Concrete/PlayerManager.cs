using System;
using System.Collections.Generic;
using System.Text;
using GameStoreApplication.Abstract;
using GameStoreApplication.Adapters;
using GameStoreApplication.Entities;

namespace GameStoreApplication.Concrete
{
    public class PlayerManager:IPlayerService
    {
        private IPlayerCheckService _playerCheckService = new MernisServiceAdapter();
        public List<Player> _players = new List<Player>();
        public void Save(Player player)
        {
            
            if (_playerCheckService.CheckIfRealPerson(player))
            {
                _players.Add(player);
            }
            else
            {
                Console.WriteLine("Kimlik doğrulama sağlanamadı!!");
            }
            
        }

        public void Update(Player player)
        {
            foreach (var plyr in _players)
            {
                if (plyr==player)
                {
                    int index = _players.IndexOf(plyr);
                    Console.WriteLine("{0} indexteki {1} id {2} {3} adında {4} Tc Numaralı kayıt bulundu.", index,
                        plyr.Id, plyr.FirstName, plyr.LastName, plyr.TcNo);
                    Console.Write("Neyi güncellemek istiyorsunuz? 1- Adı Soyadı 2-Tc No");
                    var secim = Console.ReadLine();
                    int secimInt = Convert.ToInt32(secim);
                    if (secimInt == 1)
                    {
                        Console.Write("Yeni adı giriniz = ");
                        var updateFirstName = Console.ReadLine();
                        Console.Write("Yeni soyadı giriniz = ");
                        var updateLastName = Console.ReadLine();
                        _players[index].FirstName = updateFirstName;
                        _players[index].LastName = updateLastName;
                        
                    }
                    else if (secimInt == 2)
                    {
                        Console.Write("Yeni TC Numarası giriniz = ");
                        var updateTC = Console.ReadLine();
                        _players[index].TcNo = Convert.ToInt64(updateTC);
                    }
                    else
                    {
                        Console.WriteLine("Hatalı seçim yaptınız!");
                    }
                    Get(plyr);
                    break;
                }
              
            }
            Console.WriteLine("Kayıt Bulunamadı!!!!");

        }

        public void Get(Player player)
        {
            Console.WriteLine("{0} id {1} {2} adında {3} Tc Numaralı kayıtlıdır",player.Id, player.FirstName, player.LastName, player.TcNo);
        }

        public void Delete(Player player)
        {
            foreach (var plyr in _players)
            {
                if (plyr == player)
                {
                    int index = _players.IndexOf(plyr);
                    Console.WriteLine("{0} indexteki {1} id Kayıt silindi!", index, plyr.Id);
                    _players.Remove(plyr);
                    break;
                }
                else
                {
                    Console.WriteLine("Kayıt Bulunamadı!!!!");
                }
            }
        }

        public void GetAll()
        {
            Console.WriteLine("----------- Tüm Oyuncular -------------");
            foreach (Player plyr in _players)
            {
                Console.WriteLine("{0} id, adı {1} {2}, TC No: {3}",
                    plyr.Id, plyr.FirstName, plyr.LastName, plyr.TcNo);
            }
            Console.WriteLine("----------- --------------- -------------");
        }
    }
}
