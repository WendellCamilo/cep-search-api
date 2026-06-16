import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {
    public void saveJson(Adress adress) throws IOException { //"esse métod pode gerar um erro de I/O, e eu não vou tratar aqui — quem me chamar que trate!"
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter writer = new FileWriter(adress.cep() + ".json");
        writer.write(gson.toJson(adress));
        writer.close();
    }
}
