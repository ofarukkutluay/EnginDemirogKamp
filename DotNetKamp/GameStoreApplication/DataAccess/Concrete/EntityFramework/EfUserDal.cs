using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;
using Entities.Concrete;

namespace DataAccess.Concrete.EntityFramework
{
    public class EfUserDal
    {
        public List<User> GetAll()
        {
            using (EmlakCrmDbContext context = new EmlakCrmDbContext())
            {
                return context.Set<User>().ToList();

            }
        }
    }
}
