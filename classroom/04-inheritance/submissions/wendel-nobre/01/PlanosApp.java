public class PlanosApp {
    public static void main(String[] args) {
        PlanoAssinatura planoBasico = new PlanoAssinatura("Plano Básico", 29.90);
        PlanoProfissional planoPro = new PlanoProfissional("Plano Pro", 99.90, 5);

        System.out.println("Plano: " + planoBasico.getNome());
        System.out.println("Mensalidade: R$ " + planoBasico.getMensalidade());

        System.out.println("\nPlano: " + planoPro.getNome());
        System.out.println("Mensalidade: R$ " + planoPro.getMensalidade());
        System.out.println("Limite de usuários: " + planoPro.getLimiteUsuarios());
    }
}