package Aula6;


    public enum Estado {
        MG(7),
        RJ(15),
        SP(12);

        private  double taxa;
        Estado(double taxa){

            this.taxa = taxa;
        }

        public double getTaxa() {
            return taxa;
        }
    }

