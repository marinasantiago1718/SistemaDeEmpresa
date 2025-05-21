import java.util.ArrayList;
import java.util.InputMismatchException;

public abstract class Funcionario implements DadosBancarios {
    protected String nome;
    protected String cpf;
    protected String endereco;
    protected String funcao;
    protected String banco;
    protected String numeroContaCorrente;
    protected double salario;
    protected double bonus;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(String numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }



    public Funcionario(String nome, String cpf, String endereco, String funcao, String banco, String numeroContaCorrente) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.funcao = funcao;
        this.banco = banco;
        this.numeroContaCorrente = numeroContaCorrente;


    }
    public abstract double calcularSalario() throws InputMismatchException;

    @Override
    public void mostrarDadosBancarios() {

    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", funcao='" + funcao + '\'' +
                ", banco='" + banco + '\'' +
                ", numeroContaCorrente='" + numeroContaCorrente + '\'' +
                ", salario=" + salario +
                ", bonus=" + bonus +
                '}';
    }
}
