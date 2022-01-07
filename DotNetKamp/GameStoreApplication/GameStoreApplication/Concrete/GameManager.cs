using System;
using System.Collections.Generic;
using System.Text;
using GameStoreApplication.Abstract;
using GameStoreApplication.Entities;

namespace GameStoreApplication
{
    public class GameManager:IGameService
    {
        public List<Game> Games = new List<Game>();
        public void Save(Game game)
        {
            Games.Add(game);
        }

        public void Update(Game game)
        {
            foreach (var gms in Games)
            {
                if (gms == game)
                {
                    int index = Games.IndexOf(gms);
                    Console.WriteLine("{0} indexteki {1} id {2} adında ki oyunun, stok adeti: {3} fiyatı: {4} kayıt bulundu.", index,
                        gms.Id, gms.GameName, gms.Stock, gms.Price);
                    Console.Write("Neyi güncellemek istiyorsunuz? 1- Oyun Adı 2-Stok 3-Fiyat");
                    var secim = Console.ReadLine();
                    int secimInt = Convert.ToInt32(secim);
                    if (secimInt == 1)
                    {
                        Console.Write("Yeni adı giriniz = ");
                        var updateGameName = Console.ReadLine();
                        Games[index].GameName = updateGameName;
                        
                    }
                    else if (secimInt == 2)
                    {
                        Console.Write("Yeni Stok giriniz = ");
                        var updateStock = Console.ReadLine();
                        Games[index].Stock = Convert.ToInt32(updateStock);
                        
                    }
                    else if (secimInt == 3)
                    {
                        Console.Write("Yeni Fiyat giriniz = ");
                        var updatePrice = Console.ReadLine();
                        Games[index].Price = Convert.ToDouble(updatePrice);
                        
                    }
                    else
                    {
                        Console.WriteLine("Hatalı seçim yaptınız!");
                    }
                    Get(gms);
                    break;
                }
                
            }
            Console.WriteLine("Kayıt Bulunamadı!!!!");

        }
        public void Get(Game game)
        {
            Console.WriteLine("{0} id {1} adında {2} stoklu {3} fiyatlı",
                game.Id, game.GameName, game.Stock, game.Price);
        }
        public void Delete(Game game)
        {
            foreach (var gms in Games)
            {
                if (gms == game)
                {
                    int index = Games.IndexOf(gms);
                    Console.WriteLine("{0} indexteki {1} id Kayıt silindi!", index, gms.Id);
                    Games.Remove(gms);
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
            Console.WriteLine("----------- Tüm Oyunlar -------------");
            foreach (Game gms in Games)
            {
                Console.WriteLine("{0} id, {1} adındaki oyun, {2} stok adeti, {3} fiyatı",
                    gms.Id, gms.GameName, gms.Stock, gms.Price);
            }
            Console.WriteLine("----------- -------------- -------------");
        }
    }
}
