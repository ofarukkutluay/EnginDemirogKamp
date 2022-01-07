using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Entities.Concrete;
using Microsoft.EntityFrameworkCore;

namespace DataAccess.Concrete.EntityFramework
{
    public class EmlakCrmDbContext : DbContext
    {
        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            var connectionString = "server=localhost;port=3306;database=emlakcrm;uid=root;password=omer2309";


            optionsBuilder.UseMySql(connectionString,ServerVersion.AutoDetect(connectionString)).EnableSensitiveDataLogging();

        }

        public DbSet<User> Users { get; set; }
    }
}
