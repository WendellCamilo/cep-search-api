# cep-search-api

Aplicação Java para busca de endereços a partir do CEP, utilizando a API pública do ViaCEP. Os dados retornados são exibidos no console e salvos automaticamente em um arquivo `.json`.

## Funcionalidades

- Busca de endereço pelo CEP via API REST (ViaCEP)
- Exibição dos dados no console
- Geração automática de arquivo `.json` com os dados do endereço

## Tecnologias utilizadas

- Java 17
- HTTP Client (java.net.http)
- Gson (conversão JSON)
- ViaCEP API

## Como executar

1. Clone o repositório:
```bash
git clone https://github.com/WendellCamilo/cep-search-api.git
```

2. Abra o projeto no IntelliJ IDEA

3. Adicione a dependência do Gson no projeto

4. Execute a classe `Main.java`

5. Digite um CEP quando solicitado:
```
---------- BUSCA CEP ----------
Digite um CEP: 01001000
```

## Exemplo de uso

**Entrada:**
```
01001000
```

**Saída no console:**
```
Address[cep=01001-000, logradouro=Praça da Sé, complemento=lado ímpar, localidade=São Paulo, uf=SP]
Arquivo salvo com sucesso!
```

**Arquivo gerado:** `01001-000.json`
```json
{
  "cep": "01001-000",
  "logradouro": "Praça da Sé",
  "complemento": "lado ímpar",
  "localidade": "São Paulo",
  "uf": "SP"
}
```

## Estrutura do projeto

```
├── Main.java          → ponto de entrada da aplicação
├── CepSearch.java     → comunicação com a API do ViaCEP
├── FileGenerator.java → geração do arquivo .json
└── Address.java       → record com os dados do endereço
```

## Autor

Wendell Camilo
