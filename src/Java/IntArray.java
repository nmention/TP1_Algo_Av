public class IntArray {
    public int[] cells;

    public IntArray(int size) {
        cells = new int[size];
        for (int i = 0; i < size; i++) {
            cells[i] = 0;
        }
        // initialisation des int à 0
    }

    public int get(int index) {
        return cells[index];
    }

    public void put(int index, int value) {
        cells[index] = value;
    }

    public void insert(int index, int value) {
        if(index >= cells.length){
            index = cells.length - 1;
        }

        for (int i = cells.length - 1; i > index; i--) {
            if (index == cells.length) {
                cells[cells.length - 1] = value;
                break;// si index est plus grand ou égale que la taille du tableau, on insère la valeur au dernier élément
            }
            cells[i] = cells[i - 1];

        }
        cells[index] = value;
    }

    public int remove(int index) {
        if ((index < 0) || (index >= cells.length)){
            return -1;
        }
        for(int i = index; i < cells.length; i++){
            if (i != cells.length - 1) {
                cells[i] = cells[i + 1];
            }
            else
                cells[i] = 0;

        }
        return cells[index];

        // si index non valide : on renvoie -1
        // sinon supprime (avec décalage) et retourne la valeur en index
    }

    public String toString() {
        // renvoie le contenu du tableau sous forme de String
        String tableau = "";
        for (int i = 0; i < cells.length ; i++) {
            tableau = tableau + " " + Integer.toString(cells[i]);
        }
        return tableau;
    }
}


