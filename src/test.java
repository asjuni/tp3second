public class test {
    public static void main(String[] args) {

        SafeScanner scanner = new SafeScanner();
        System.out.print("Entrez un prénom : ");
        String prenom = scanner.nextLine();
        System.out.println(" Bonjour, "+ prenom +" !");
}
}

