public class ArrayDeLivros {

    public static void main(String[] args) {

        String[] filmes = new String[]{"Piratas do Caribe", "Crepúsculo", "Harry Potter", "O Senhor dos Anéis", "Star Wars", "O Dia do Terror"};

        String[] livros = new String[]{"Crepúsculo", "Harry Potter", "Star Wars", "Gossip Girl"};

        for (int i = 0; i < filmes.length; i++) {
            for (int j = 0; j < livros.length; j++){
                if (filmes[i].equals(livros[j])) {
                    System.out.printf("O filme %s possui também o livro %s.\n", filmes[i], livros[j]);
                    break;
                }
            }
        }
        System.out.print("Os demais filmes não possuem seus respectivos livros.");
    }
}