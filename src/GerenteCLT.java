import java.util.InputMismatchException;

public class GerenteCLT extends FuncionarioCLT implements RH, DadosBancarios, DescontosGovernamentais{
    protected double valorDeVendasTotais;

    public double getValorDeVendasTotais() {
        return valorDeVendasTotais;
    }

    public void setValorDeVendasTotais(double valorDeVendasTotais) {
        this.valorDeVendasTotais = valorDeVendasTotais;
    }

    public GerenteCLT(String nome, String cpf, String endereco, String funcao, String banco, String numeroContaCorrente, double salario, byte mesesTrabalhados, double valorDeVendasTotais) {
        super(nome, cpf, endereco, funcao, banco, numeroContaCorrente, salario, mesesTrabalhados);
        this.valorDeVendasTotais = valorDeVendasTotais;
    }

    @Override
    public double calcularFGTS()  {
        return Math.round(salario*0.08);
    }

    @Override
    public double calcularINSS()  {

            return Math.round(salario * 0.14);

    }

    @Override
    public double calcularBonus() {
        return valorDeVendasTotais*0.10;
    }

    @Override
    public double calcularSalario() throws InputMismatchException {
        return salario + calcularBonus() - calcularINSS();
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
                        "\nNome..............................: " + nome +
                        "\nCPF...............................: " + cpf +
                        "\nEndereço..........................: " + endereco +
                        "\nFunção............................: " + funcao +
                        "\nSalário...........................: " + calcularSalario() +
                        "\nDécimo terceiro...................: " + calcularDecimoTerceiro() +
                        "\nValor do bônus recebido...........: " + calcularBonus() +
                        "\nFGTS..............................: " + calcularFGTS() +
                        "\nMeses Trabalhados.................: " + mesesTrabalhados +
                        "\nValor das férias:.................: " + calcularFerias();
    }
    @Override
    public void mostrarDadosBancarios() {
        System.out.printf("Banco.............................: " + banco);
        System.out.printf("\nNúmero da conta corrente..........: " + numeroContaCorrente);
    }
}
