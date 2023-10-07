package Questao1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HistoricoDeLinks {
    public static void main(String[] args) {
        ArrayList<String> historico = new ArrayList<>();


        String arquivo = "C:/Users/11513288/Desktop/ListaLinks.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(arquivo));
            String linha;
            while ((linha = reader.readLine()) != null) {
                historico.add(linha);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo.");
            System.exit(1);
        }

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Remover link");
            System.out.println("2. Mostrar qtd de registros");
            System.out.println("3. Mostrar histórico");
            System.out.println("4. Verificar se um link existe");
            System.out.println("5. Sair");


            Scanner scanner = new Scanner(System.in);
            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    System.out.print("Digite o link para excluir: ");
                    String linkExclusao = scanner.nextLine();
                    if (historico.remove(linkExclusao)) {
                        System.out.println("Link removido com sucesso.");
                    } else {
                        System.out.println("Link não encontrado.");
                    }
                    break;
                case "2":
                    System.out.println("Qdt de registros: " + historico.size());
                    break;
                case "3":
                    System.out.println("Histórico de Links:");
                    for (String link : historico) {
                        System.out.println(link);
                    }
                    break;
                case "4":
                    System.out.print("Digite o link para verificar: ");
                    String linkVerificacao = scanner.nextLine();
                    if (historico.contains(linkVerificacao)) {
                        System.out.println("Link Encontrado.");
                    } else {
                        System.out.println("Link Não Encontrado.");
                    }
                    break;
                case "5":
                    System.out.println("Saindo do programa.");

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}