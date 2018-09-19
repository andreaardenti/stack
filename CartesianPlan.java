public class CartesianPlan {

    public int[][] array;

    public CartesianPlan(int size) {
        this.array = new int[size][2];
        for (int i=0; i<array.length; i++) {
            this.array[i][0] =(int) (Math.random() * 100);
            this.array[i][1] =(int) (Math.random() * 100);
        }
    }

    public void shift(int x, int y) {
        // scorro l'array
        for(int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        //associo ad una nuova variabile newPosition di tipo array le nuove posizioni di "x" e "y"
        int[] newPosition = new int[2];
        newPosition[0] = x;
        newPosition[1] = y;

        //assegno alla posizione 0 dell'array iniziale le due nuove coordinate di "x" e "y"
        array[0] = newPosition;
    }

    public int getNear() {
        //calcolo col teorema di pitagora la media di x e y
        double distance = Math.sqrt(Math.pow(this.array[0][0], 2) + Math.pow(this.array[0][1], 2));
        int index = 0;
        for (int i=1; i < this.array.length; i++) {
            //confronto di ogni valore iesimo dell'array
            double distanceIesime =  Math.sqrt(Math.pow(this.array[i][0], 2) + Math.pow(this.array[i][1], 2));
            if (distanceIesime < distance) {
                index = i;
                distance = distanceIesime;
            }
        }
        return index;
    }

    public void sort() {
        int[][] sortedArray = new int[this.array.length][2];
        for (int i=0; i < this.array.length; i++) {
            int nearPosition = this.getNear();
            sortedArray[i] = this.array[nearPosition];

            //creo un array "big" con i valori più alti di x e y
            int[] big = new int[2];
            big[0] = 100;
            big[1] = 100;

            //sovrascrivo la posizione presa con una più grande.
            this.array[nearPosition] = big;
        }
        this.array = sortedArray;
    }
}
