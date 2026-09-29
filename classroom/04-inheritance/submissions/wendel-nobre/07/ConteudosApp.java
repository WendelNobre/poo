public class ConteudosApp {
    public static void main(String[] args) {
        ConteudoDigital livro = new LivroDigital("Estruturas de Dados em Java", 49.90, 15.00);
        ConteudoDigital curso = new CursoOnline("Programação Orientada a Objetos", 100.00, 40, 2.50);

        System.out.println("--- " + livro.getTitulo() + " ---");
        System.out.println("Preço Base: R$ " + livro.getPrecoBase());
        System.out.printf("Preço Final: R$ %.2f\n\n", livro.calcularPrecoFinal());

        System.out.println("--- " + curso.getTitulo() + " ---");
        System.out.println("Preço Base: R$ " + curso.getPrecoBase());
        System.out.printf("Preço Final: R$ %.2f\n", curso.calcularPrecoFinal());
    }
}