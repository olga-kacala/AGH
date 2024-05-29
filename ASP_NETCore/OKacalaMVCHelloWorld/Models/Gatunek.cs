using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace OKacalaMVCHelloWorld.Models
{
    public class Gatunek
    {
        public int Id { get; set; }

        [Required(ErrorMessage = "Nazwa gatunku jest wymagana.")]
        public string Nazwa { get; set; }

        public DateTime BirthDate {get;set;}

    }
}