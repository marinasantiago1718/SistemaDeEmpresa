import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ComissionadoRegularVendas extends FuncionarioComissado implements DadosBancarios {


    public ComissionadoRegularVendas(String nome, String cpf, String endereco, String funcao, String banco, String numeroContaCorrente, double percentualDeComissao, double ValorDeVendas) {
        super(nome, cpf, endereco, funcao, banco, numeroContaCorrente, percentualDeComissao, ValorDeVendas);
    }


    public void mostrarQuantidadeDeComissados() throws RespostaVaziaException {

        System.out.println("\nDeseja ver também a quantidade de funcionários comissados na empresa?");

    }


    @Override
    public double calcularSalario() throws InputMismatchException {
        return salario + Math.round((ValorDeVendas*percentualDeComissao)/100);
    }


    @Override
    public String toString() {
        return
                "\nNome..............................: " + nome +
                        "\nCPF...............................: " + cpf  +
                        "\nEndereço..........................: " + endereco +
                        "\nFunção............................: " + funcao +
                        "\nSalário...........................: " + calcularSalario() +
                        "\nValor vendido.....................: " + ValorDeVendas ;
    }


    @Override
    public void mostrarDadosBancarios() {
        System.out.printf("\nBanco.............................: " + banco);
        System.out.printf("\nNúmero da conta corrente..........: " + numeroContaCorrente);
    }


}
