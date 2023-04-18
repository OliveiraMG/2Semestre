package empresa;

/**
 *
 * @author Admin
 */
public class RecursosHumanos {

    private Integer totalPromocoes;
    private Integer totalSalariosReajustados;

    public RecursosHumanos() {
        this.totalPromocoes = 0;
        this.totalSalariosReajustados = 0;
    }

    public void reajustarSalario(Colaborador colab, Double valorReajuste) {
        if (valorReajuste > 0.0) {
            Double novoSalario = colab.getSalario() + valorReajuste;
            colab.setSalario(novoSalario);
            totalSalariosReajustados++;
            System.out.println("Salário reajustado!");
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void promoverColaborador(Colaborador colab,
            String novoCargo,
            Double novoSalario) {

        if (novoSalario > colab.getSalario()
                && !novoCargo.equals(colab.getCargo())) {
            colab.setCargo(novoCargo);
            colab.setSalario(novoSalario);
            this.totalPromocoes++;
            System.out.println("Colaborador Promovido!");
        }else{
            System.out.println("Operação inválida!");
        }

    }

    public Integer getTotalPromocoes() {
        return totalPromocoes;
    }

    public Integer getTotalSalariosReajustados() {
        return totalSalariosReajustados;
    }

}
