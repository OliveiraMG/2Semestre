package empresa;

/**
 *
 * @author Admin
 */
public class TesteColaborador {

    public static void main(String[] args) {
        Colaborador colab01 = new Colaborador();
        colab01.setSalario(1000.0);
        colab01.setCargo("Estágio");
        colab01.setNome("Xampson");

        Colaborador colab02 = new Colaborador();
        colab02.setSalario(10100.00);
        colab02.setCargo("Gerente");
        colab02.setNome("William");

        RecursosHumanos rh = new RecursosHumanos();

        System.out.println(
                String.format(
                        "Coloborador: "
                        + "\nNome: %s"
                        + "\nCargo: %s"
                        + "\nSalário: %.2f\n",
                        colab01.getNome(),
                        colab01.getCargo(),
                        colab01.getSalario()));

        System.out.println(
                String.format(
                        "Colaborador: "
                        + "\nNome: %s"
                        + "\nCargo: %s"
                        + "\nSalário: %.2f\n",
                        colab02.getNome(),
                        colab02.getCargo(),
                        colab02.getSalario()));
        
        rh.promoverColaborador(colab01, "Dev Jr.", 3500.0);
        rh.promoverColaborador(colab02, "Diretor", 9500.0);
        
        rh.reajustarSalario(colab01, 500.0);
        
          System.out.println(
                String.format(
                        "Coloborador: "
                        + "\nNome: %s"
                        + "\nCargo: %s"
                        + "\nSalário: %.2f\n",
                        colab01.getNome(),
                        colab01.getCargo(),
                        colab01.getSalario()));

        System.out.println(
                String.format(
                        "Colaborador: "
                        + "\nNome: %s"
                        + "\nCargo: %s"
                        + "\nSalário: %.2f\n",
                        colab02.getNome(),
                        colab02.getCargo(),
                        colab02.getSalario()));
        
        System.out.println(
                String.format(
                        "Recursos Humanos:"
                                + "\nTotal de Reajustes: %d"
                                + "\nTotal de Promoções: %d", 
                        rh.getTotalSalariosReajustados(),
                        rh.getTotalPromocoes()));
    }
}
