import java.util.InputMismatchException;

public class SupervisorCLT extends FuncionarioCLT implements RH, DadosBancarios, DescontosGovernamentais{
 protected short numeroDeFuncSupervisionados;

    public short getNumeroDeFuncSupervisionados() {
        return numeroDeFuncSupervisionados;
    }

    public void setNumeroDeFuncSupervisionados(short numeroDeFuncSupervisionados) {
        this.numeroDeFuncSupervisionados = numeroDeFuncSupervisionados;
    }

    public SupervisorCLT(String nome, String cpf, String endereco, String funcao, String banco, String numeroContaCorrente, double salario, byte mesesTrabalhados, short numeroDeFuncSupervisionados) {
        super(nome, cpf, endereco, funcao, banco, numeroContaCorrente, salario, mesesTrabalhados);
        this.numeroDeFuncSupervisionados = numeroDeFuncSupervisionados;
    }


    @Override
    public double calcularFGTS() {
        return Math.round(salario*0.08);
    }

    @Override
    public double calcularINSS() {
        return Math.round(salario*0.12);
    }

    @Override
    public double calcularBonus() {
        return numeroDeFuncSupervisionados*100;
    }

    @Override
    public double calcularSalario() throws InputMismatchException {
        return salario + calcularBonus();
    }


    public double calcularSalario(double bonus) throws InputMismatchException{
        return salario + calcularBonus() ;
    }


    @Override
    public double calcularDecimoTerceiro() {
        double decimo = (salario*mesesTrabalhados)/12;
        return decimo;
    }

    @Override
    public double calcularFerias() {
        return salario + Math.round(salario/3);
    }
    @Override
    public String toString() {
        return
                        "\nNome..................................: " + nome +
                        "\nCPF...................................: " + cpf +
                        "\nEndereço..............................: " + endereco +
                        "\nFunção................................: " + funcao +
                        "\nSalário...............................: " + calcularSalario() +
                        "\nDécimo terceiro.......................: " + calcularDecimoTerceiro() +
                        "\nFGTS..................................: " + calcularFGTS() +
                        "\nMeses Trabalhados.....................: " + mesesTrabalhados +
                        "\nValor das férias:.....................: " + calcularFerias() +
                        "\nNúmero de funcionários supervisionados: " + numeroDeFuncSupervisionados;
    }
    @Override
    public void mostrarDadosBancarios() {
        System.out.printf("Banco.................................: " + banco);
        System.out.printf("\nNúmero da conta corrente..............: " + numeroContaCorrente);
    }
}
