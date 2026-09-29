public class FrotaApp {
    public static void main(String[] args) {
       
        Veiculo carro = new Veiculo("ABC-1234", "Flex", 115.0);


        Caminhao caminhao = new Caminhao("XYZ-9876", "Diesel", 420.0, 25.5);

        System.out.println("--- Descrição da Frota ---");
        System.out.println(carro.getDescricao());
        System.out.println(caminhao.getDescricao());
    }
}