import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Definindo constantes dos dados de login
        final String USERNAME = "admin";
        final String PASSWORD = "adm1234";

        // Criando um novo scanner
        Scanner scanner = new Scanner(System.in);

        // Iniciando: variável de tentaticas de login
        int tentativas = 5;

        // Loop para login
        while (tentativas > 0) {
            System.out.println("=============================================================");
            // Solicitando email e senha
            System.out.print("Digite o seu username: ");
            String user = scanner.next();

            System.out.print("Digite a sua senha: ");
            String pass = scanner.next();

            // Checando se os dados conferem.
            if (user.equals(USERNAME) && pass.equals(PASSWORD)) {
                System.out.println("=============================================================");
                break;
            } else {
                tentativas--;
                System.out.printf("User ou senha incorreta. Você tem %d tentativas restantes.\n", tentativas);
                System.out.println("=============================================================");
            }
        }

        // Fechando o scanner
        scanner.close();

        // Verificando se está logado
        if (tentativas == 0) {
            System.out.println("Tente novamente em instantes.");
            return;
        }

        // Exibindo mensagem de boas vindas.
        System.out.println("Seja bem vindo, " + USERNAME + "!");
    }
}