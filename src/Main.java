import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        CepSearch cepSearch = new CepSearch(); //Cria um objeto

        System.out.println("---------- BUSCA CEP ----------");
        System.out.println("Digite um CEP: ");
        var cep = tec.nextLine();

        try {
            Adress newAdress = cepSearch.adressSearch(cep); //objeto criado faz a busca usando métod e guarda em newAdress
            System.out.println(newAdress);
            FileGenerator generator = new FileGenerator();
            generator.saveJson(newAdress);
            System.out.println("Arquivo salvo com sucesso!"); //feedback para o usuário
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação.");
        }
    }
}