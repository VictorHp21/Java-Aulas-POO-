 public class Timevolei{
    
    
            private Jogador []vetorjogadores;
            private int totaljogadores;
    
            public Timevolei() 
            {
                vetorjogadores = new Jogador[6];
                totaljogadores = 0;
            }
    
    
        public void inserejogador(String n, int i, float alt)
        {
            if(totaljogadores < 6)
            {
                vetorjogadores[totaljogadores] = new Jogador(n, i, alt);
                totaljogadores++;
            }
            return;
        }
    
        public String jogadormenoraltura()
        {
            float menoraltura = 999999;
            String nomejogador = "";
    
            for (int i = 0; i < totaljogadores; i++)
            {
                if(vetorjogadores[i].retornaAltura() < menoraltura)
                {
                    menoraltura = vetorjogadores[i].retornaAltura();
                    nomejogador = vetorjogadores[i].retornaNome();
                }
            }
            return nomejogador;
        }


        //exercicioo 3

        public String jogadormaisalto()
        {
            float maioraltura = 01;
            String nomejogador = "";

            for (int i = 0; i < totaljogadores; i++)
            {
                if(vetorjogadores[i].retornaAltura() > maioraltura)
                {
                    maioraltura = vetorjogadores[i].retornaAltura();
                    nomejogador = vetorjogadores[i].retornaNome();
                }
            }
            return nomejogador;

        }

        public String jogadorAlturaIdade(int i)
        {
            float maioraltura = 01;
            String nomejogador = "";
           

           for (int h = 0; h < totaljogadores; h++)
           {
               if((vetorjogadores[h].retornaAltura() > maioraltura) && (vetorjogadores[h].retornaIdade() > i))
               {
                   maioraltura = vetorjogadores[h].retornaAltura();
                   nomejogador = vetorjogadores[h].retornaNome();
               }
           }
           return nomejogador;

        }

        public int jogadorescertaidade(int i)
        {
           int jogadoreidade = 0;

           for (int h = 0; h < totaljogadores; h++)
           {
            if(vetorjogadores[h].retornaIdade() == i )
            {
                jogadoreidade++;
            }

           }
        return jogadoreidade;
        }

        public int jogadoresalturausuario(float a)
        {
            int jogadoresidade = 0;

            for (int h = 0; h < totaljogadores; h++)
           {
            if(vetorjogadores[h].retornaAltura() > a )
            {
                jogadoresidade++;
            }

           }

           return jogadoresidade;
        }

        public double mediaIdade()
        {
            double media = 0;
            int idades = 0;

            for(int h = 0; h < totaljogadores; h++)
            {
               idades += vetorjogadores[h].retornaIdade();
            }
            media = idades / 6;

            return media;
        }

        
        
    }
