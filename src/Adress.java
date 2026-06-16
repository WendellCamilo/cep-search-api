//record é um atalho para classes simples que só guardam dados e não precisam de lógica complexa. Ela por padrão possui, automaticamente, no background, get, set toString()
public record Adress(String cep, String logradouro, String complemento, String localidade, String uf) {

}
