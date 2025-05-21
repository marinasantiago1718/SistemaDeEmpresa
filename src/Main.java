import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        boolean opcaoinvalida = false;
        boolean verdade = true;
        HashMap<String, Funcionario> funcionarios = new HashMap<>();
        ArrayList<SupervisorCLT> supervisores = new ArrayList<>();
        ArrayList<ComissionadoRegularVendas> comissados = new ArrayList<>();
    do{
        do {
            try {

                boolean flag = false;

                System.out.println("\nEscolha a opção que deseja fazer: " +
                        "1 - Registrar funcionários; " +
                        "2 - Buscar funcionários; " +
                        "3 - Ver quantidade de supervisores; " +
                        "4 - Remover funcionários; " +
                        "5 - Sair do programa.");
                byte escolha = prompt.nextByte();

                if (escolha == 1) {

                    do {
                        System.out.println("\nDigite o número de funcionários que deseja registrar: ");
                        int numero = prompt.nextInt();
                        for (int i = 1; i <= numero; i++) {
                            try {
                                prompt.nextLine();
                                System.out.println("\nDigite a função do funcionário " + i + " :");
                                String funcao = prompt.nextLine();

                                if (funcao.equalsIgnoreCase("clt regular")) {
                                    prompt.nextLine();
                                    System.out.println("\nDigite o nome do funcionário " + i + " :");
                                    String nome = prompt.nextLine();
                                    System.out.println("\nDigite o CPF do funcionário " + i + " :");
                                    String cpf = prompt.nextLine();
                                    System.out.println("\nDigite o endereço do funcionário " + i + " :");
                                    String endereco = prompt.nextLine();
                                    System.out.println("\nDigite o salário base do funcionário " + i + " :");
                                    double salario = prompt.nextDouble();
                                    prompt.nextLine();
                                    System.out.println("\nDigite o banco do funcionário " + i + " :");
                                    String banco = prompt.nextLine();
                                    System.out.println("\nDigite o número da conta corrente do funcionário " + i + " :");
                                    String numeroContaCorrente = prompt.nextLine();
                                    System.out.println("\nDigite a quantidade de meses trabalhados pelo funcionário " + i + " :");
                                    byte mesesTrabalhados = prompt.nextByte();
                                    CLTRegular clt = new CLTRegular(nome, cpf, endereco, funcao, banco, numeroContaCorrente, salario, (byte) mesesTrabalhados);
                                    funcionarios.put(clt.cpf, clt);
                                }
                                if (funcao.equalsIgnoreCase("comissado")) {
                                    prompt.nextLine();
                                    System.out.println("\nDigite o nome do funcionário " + i + " :");
                                    String nome = prompt.nextLine();
                                    System.out.println("\nDigite o CPF do funcionário " + i + " :");
                                    String cpf = prompt.nextLine();
                                    System.out.println("\nDigite o endereço do funcionário " + i + " :");
                                    String endereco = prompt.nextLine();
                                    prompt.nextLine();
                                    System.out.println("\nDigite o banco do funcionário " + i + " :");
                                    String banco = prompt.nextLine();
                                    System.out.println("\nDigite o número da conta corrente do funcionário " + i + " :");
                                    String numeroContaCorrente = prompt.nextLine();
                                    System.out.println("\nDigite o percentual de comissão do funcionário " + i + " :");
                                    double percentual = prompt.nextDouble();
                                    System.out.println("\nDigite o valor de vendas totais do funcionário " + i + " :");
                                    double valorVendido = prompt.nextDouble();
                                    ComissionadoRegularVendas comissado1 = new ComissionadoRegularVendas(nome, cpf, endereco, funcao, banco, numeroContaCorrente, percentual, valorVendido);
                                    funcionarios.put(comissado1.cpf, comissado1);
                                    comissados.add(comissado1);


                                }
                                if (funcao.equalsIgnoreCase("gerente clt")) {
                                    prompt.nextLine();
                                    System.out.println("\nDigite o nome do funcionário " + i + " :");
                                    String nome = prompt.nextLine();
                                    System.out.println("\nDigite o CPF do funcionário " + i + " :");
                                    String cpf = prompt.nextLine();
                                    System.out.println("\nDigite o endereço do funcionário " + i + " :");
                                    String endereco = prompt.nextLine();
                                    System.out.println("\nDigite o salário base do funcionário " + i + " :");
                                    double salario = prompt.nextDouble();
                                    prompt.nextLine();
                                    System.out.println("\nDigite o banco do funcionário " + i + " :");
                                    String banco = prompt.nextLine();
                                    System.out.println("\nDigite o número da conta corrente do funcionário " + i + " :");
                                    String numeroContaCorrente = prompt.nextLine();
                                    System.out.println("\nDigite a quantidade de meses trabalhados pelo funcionário " + i + " :");
                                    byte mesesTrabalhados = prompt.nextByte();
                                    System.out.println("\nDigite o valor de vendas totais da empresa:");
                                    double vendasDaEmpresa = prompt.nextDouble();
                                    GerenteCLT gerente = new GerenteCLT(nome, cpf, endereco, funcao, banco, numeroContaCorrente, salario, mesesTrabalhados, vendasDaEmpresa);
                                    funcionarios.put(gerente.cpf, gerente);
                                }
                                if (funcao.equalsIgnoreCase("supervisor clt")) {
                                    prompt.nextLine();
                                    System.out.println("\nDigite o nome do funcionário " + i + " :");
                                    String nome = prompt.nextLine();
                                    System.out.println("\nDigite o CPF do funcionário " + i + " :");
                                    String cpf = prompt.nextLine();
                                    System.out.println("\nDigite o endereço do funcionário " + i + " :");
                                    String endereco = prompt.nextLine();
                                    System.out.println("\nDigite o salário base do funcionário " + i + " :");
                                    double salario = prompt.nextDouble();
                                    prompt.nextLine();
                                    System.out.println("\nDigite o banco do funcionário " + i + " :");
                                    String banco = prompt.nextLine();
                                    System.out.println("\nDigite o número da conta corrente do funcionário " + i + " :");
                                    String numeroContaCorrente = prompt.nextLine();
                                    System.out.println("\nDigite a quantidade de meses trabalhados pelo funcionário " + i + " :");
                                    byte mesesTrabalhados = prompt.nextByte();
                                    System.out.println("\nDigite a quantidade de funcionários supervisionados pelo(a) supervisor(a)  " + nome + " :");
                                    short quantidadeSupervisionada = prompt.nextShort();
                                    SupervisorCLT supervisor = new SupervisorCLT(nome, cpf, endereco, funcao, banco, numeroContaCorrente, salario, mesesTrabalhados, quantidadeSupervisionada);
                                    funcionarios.put(supervisor.cpf, supervisor);
                                    supervisores.add(supervisor);
                                }

                            } catch (InputMismatchException e) {
                                prompt.nextLine();
                                System.out.println("Você digitou um caractere que não corresponde ao pedido.");
                                flag = true;
                            }
                        }
                    } while (flag);

                } else if (escolha == 2) {

                    if (funcionarios.isEmpty()) {
                        System.out.println("\nÉ preciso cadastrar funcionários para buscá-los!");
                    } else {
                        prompt.nextLine();
                        System.out.println("Digite o CPF do funcionário que deseja buscar: ");
                        String busca = prompt.nextLine();
                        Funcionario funcionariobuscado = funcionarios.get(busca);
                        if (funcionariobuscado != null) {
                            System.out.printf(funcionariobuscado.toString());
                            funcionariobuscado.mostrarDadosBancarios();
                        } else {
                            System.out.println("Funcionário não encontrado!");
                        }

                    }

                } else if(escolha == 3){
                    prompt.nextLine();
                    boolean resposta = false;
                    String answer;
                    do {
                        try {

                            if (supervisores.isEmpty()) {

                                System.out.println("Por enquanto, não há supervisores cadastrados!");
                                ComissionadoRegularVendas comissadomostrar = new ComissionadoRegularVendas(" ", " ", " ", " ", " ", " ", 0.0, 0.0);
                                comissadomostrar.mostrarQuantidadeDeComissados();
                                answer = prompt.nextLine();
                                if(answer.isEmpty()){
                                    throw new RespostaVaziaException("Por favor, responda à pergunta!");
                                }
                                else if(answer.equalsIgnoreCase("sim")){
                                    System.out.println("Existem " + comissados.size() + " comissados na empresa.");
                                    break;
                                } else if (answer.equalsIgnoreCase("nao") || answer.equalsIgnoreCase("não")) {
                                    System.out.println(" ");
                                    break;
                                }
                            }
                            else {
                                System.out.println("Existe(m) " + supervisores.size() + " supervisor(es) na empresa.");
                                ComissionadoRegularVendas comissadomostrar = new ComissionadoRegularVendas(" ", " ", " ", " ", " ", " ", 0.0, 0.0);
                                comissadomostrar.mostrarQuantidadeDeComissados();
                                answer = prompt.nextLine();
                                if(answer.isEmpty()){
                                    throw new RespostaVaziaException("Por favor, responda à pergunta!");
                                }
                                else if(answer.equalsIgnoreCase("sim")){
                                    System.out.println("Existe(m) " + comissados.size() + " comissado(s) na empresa.");
                                    break;
                                } else if (answer.equalsIgnoreCase("nao") || answer.equalsIgnoreCase("não")) {
                                    System.out.println(" ");
                                    break;
                                }

                            }
                        } catch (RespostaVaziaException e) {
                            System.out.println(e.getMessage());
                            resposta = true;
                        }
                    }while (resposta);


                } else if (escolha == 5) {
                    System.out.println("\nVocê saiu do programa.");
                    verdade = false;
                    prompt.close();

                } else if (escolha == 4) {
                    prompt.nextLine();
                    if(funcionarios.isEmpty()){
                        System.out.println("\nNão há funcionários para remover.");
                    }
                    else {
                        System.out.println("Quantos funcionários deseja remover?");
                        int qtd = prompt.nextInt();
                        for (int i = 0; i < qtd; i++) {
                            if(funcionarios.isEmpty()){
                                System.out.println("Não há mais funcionários para serem removidos.");
                                break;
                            }
                            prompt.nextLine();
                            System.out.println("\nDigite o CPF do " + (i+1) + "° funcionário a ser removido: ");
                            String remover = prompt.nextLine();
                            Funcionario funcionarioremovido = funcionarios.remove(remover);
                            System.out.println("Funcionário removido com sucesso!");
                        }

                    }
                } else {
                    throw new OpcaoInvalidaException("\nVocê digitou uma opção inexistente!");
                }

            } catch (OpcaoInvalidaException e) {
                System.out.println(e.getMessage());
                opcaoinvalida = true;
            }

        } while (opcaoinvalida);
    }while(verdade);
    }
}
