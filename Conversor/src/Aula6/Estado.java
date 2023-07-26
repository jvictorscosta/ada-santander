package Aula6;


    public enum Estado {
        MG(1.07),
        RJ(1.15),
        SP(1.12);

        final double taxa;
        Estado(double taxa){

            this.taxa = taxa;
        }

        public double getTaxa() {
            return taxa;
        }
    }

