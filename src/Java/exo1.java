public class exo1 {
    public static void main(String[] args) {
        String chaine = "";
        for (int i = 0; i < args.length ; i++) {
            chaine += args[i] + " ";
        }
        System.out.println(chaine);
    }
}
