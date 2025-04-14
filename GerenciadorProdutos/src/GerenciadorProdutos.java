import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorProdutos {
    public static void main(String[] args) {
        boolean estaAtivo = true;
        String entrada;

        Scanner s = new Scanner(System.in);
        ArrayList<String> listaProdutos = new ArrayList<>();

        while (estaAtivo) {
            System.out.println("Digite o que deseja:\n" +
                    "1 - Adicionar\n" +
                    "2 - Remover\n" +
                    "3 - Alterar\n" +
                    "4 - Listar\n" +
                    "x - sair");
            entrada = s.nextLine();

            boolean querAdicionar = true;

            switch (entrada) {

                case "1":
                    while(querAdicionar) {
                        System.out.println("Escreva o nome do item que deseja adicionar");
                        entrada = s.nextLine();
                        listaProdutos.add(entrada);

                        System.out.println("O item " + entrada + " foi adicionado com sucesso! Deseja adicionar mais? s/n");
                        entrada = s.nextLine();

                        if (entrada.equals("s")){
                            querAdicionar = true;
                        } else {
                            querAdicionar = false;
                        }


                    }

                    break;

                case "2":
                    System.out.println("Escreva o nome do item que deseja remover");
                    break;

                case "3":

                    break;

                case "4":

                    break;

                case "x":
                    System.out.println("Finalizando o programa...");
                    estaAtivo = false;
                    break;

            }
        }
        System.out.println(listaProdutos);

    }
}







