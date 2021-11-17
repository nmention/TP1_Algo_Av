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
            cells[cells.length - 1] = value; // si index est plus grand ou égale que la taille du tableau, on insère la valeur au dernier élément
        }
    }

    public int remove(int index) {
        // si index non valide : on renvoie -1
        // sinon supprime (avec décalage) et retourne la valeur en index
    }

    public String toString() {
        // renvoie le contenu du tableau sous forme de String
    }
}


