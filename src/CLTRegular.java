import java.util.InputMismatchException;

public class CLTRegular extends FuncionarioCLT implements RH, DadosBancarios, DescontosGovernamentais{
    protected double bonus;
    protected double fgts;
    protected double inss;
    protected double decimo;


    public CLTRegular(String nome, String cpf, String endereco, String funcao, String banco, String numeroContaCorrente, double salario, byte mesesTrabalhados) {
        super(nome, cpf, endereco, funcao, banco, numeroContaCorrente, salario, mesesTrabalhados);

    }


    @Override
    public double calcularFGTS() {
        fgts = salario*0.08;
        return Math.round(fgts);
    }

    @Override
    public double calcularINSS() {
        inss = salario*0.075;
        return Math.round(inss);
    }

    @Override
    public double calcularDecimoTerceiro() {
        decimo = (salario*mesesTrabalhados)/12;
        return Math.round(decimo);
    }

    @Override
    public double calcularFerias() {
        return salario + Math.round(salario/3);
    }

    @Override
    public double calcularBonus() {
        bonus = salario*0.10;
        return Math.round(bonus);
    }

    @Override
    public double calcularSalario() throws InputMismatchException {
        salario = salario - calcularINSS();
        return salario;
    }

    public double calcularSalario(double bonus) throws InputMismatchException{
        return salario + calcularBonus() ;
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
        System.out.printf("\nBanco...........................: " + banco);
        System.out.printf("\nNúmero da conta corrente..........: " + numeroContaCorrente);
    }
}
