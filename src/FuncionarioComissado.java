public abstract class FuncionarioComissado extends Funcionario implements DadosBancarios {
    protected double percentualDeComissao;
    protected double ValorDeVendas;

    public double getPercentualDeComissao() {
        return percentualDeComissao;
    }

    public void setPercentualDeComissao(double percentualDeComissao) {
        this.percentualDeComissao = percentualDeComissao;
    }

    public double getValorDeVendas() {
        return ValorDeVendas;
    }

    public void setValorDeVendas(short valorDeVendas) {
        ValorDeVendas = valorDeVendas;
    }

    public FuncionarioComissado(String nome, String cpf, String endereco, String funcao, String banco, String numeroContaCorrente, double percentualDeComissao, double ValorDeVendas) {
        super(nome, cpf, endereco, funcao, banco, numeroContaCorrente);
        this.percentualDeComissao = percentualDeComissao;
        this.ValorDeVendas = ValorDeVendas;
    }

}
