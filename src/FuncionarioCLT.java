public abstract class FuncionarioCLT extends Funcionario {
    protected double bonus;
    protected double salario;
    protected byte mesesTrabalhados;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public FuncionarioCLT(String nome, String cpf, String endereco, String funcao, String banco, String numeroContaCorrente, double salario, byte mesesTrabalhados) {
        super(nome, cpf, endereco, funcao, banco, numeroContaCorrente);
        this.salario = salario;
        this.mesesTrabalhados = mesesTrabalhados;
    }
    public abstract double calcularBonus() ;
}
