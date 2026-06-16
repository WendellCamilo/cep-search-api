import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        CepSearch cepSearch = new CepSearch();

        System.out.println("---------- BUSCA CEP ----------");
        System.out.println("Digite um CEP: ");
        var cep = tec.nextLine();

        try {
            Address newAddress = cepSearch.addressSearch(cep);
            System.out.println(newAddress);
            FileGenerator generator = new FileGenerator();
            generator.saveJson(newAddress);
            System.out.println("Arquivo salvo com sucesso!");
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação.");
        }
    }
}