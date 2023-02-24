public class chat {
    public static void main(String[] args){
    SafeScanner scanner = new SafeScanner();
    System.out.println("Veuillez saisir la hauteur");
    int hauteur = scanner.nextInt();
    System.out.println("Veuillez saisir la largeur");
    int largeur = scanner.nextInt();
     for (int i = 0; i < hauteur; i++) {
        for (int j = 0; j < largeur; j++) {
            if(i == 0 || i == hauteur - 1 || j == 0 || j == largeur - 1) {
                System.out.print("-");
            } else {
                System.out.print("0    -    0");
            }
        }
        System.out.println();
    }
}
}
