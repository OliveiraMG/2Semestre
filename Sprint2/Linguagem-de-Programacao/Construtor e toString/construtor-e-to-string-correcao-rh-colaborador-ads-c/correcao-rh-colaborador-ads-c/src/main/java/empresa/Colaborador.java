package empresa;

/**
 *
 * @author Admin
 */
public class Colaborador {
    private String nome;
    private String cargo;
    private Double salario;
    
    //Construtor:
    // SEMPRE é public
    // SEMPRE tem o mesmo nome que a classe
    // NUNCA possui retorno especificado

    public Colaborador(String nome, 
            String cargo, 
            Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public Colaborador(String nome, 
            String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = 0.0;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format("Colaborador: "
                        + "\nNome: %s"
                        + "\nCargo: %s"
                        + "\nSalário: %.2f\n",
                        nome,
                        cargo,
                        salario);
    }
    
    
    
}
