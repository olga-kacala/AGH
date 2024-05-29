using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.EntityFrameworkCore;
using OKacalaMVCHelloWorld.Models;

namespace OKacalaMVCHelloWorld.Data
{
    public class GatunekContext : DbContext
    {
        public GatunekContext(DbContextOptions<GatunekContext> options) : base(options)
        {
        }

        public DbSet<Gatunek> Gatunki { get; set; }
    }
}