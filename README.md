# 🚀 Literalura - Catálogo de Livros

![Java](https://img.shields.io/badge/Java-17%2B-blue?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green?style=for-the-badge&logo=spring&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-14-blue?style=for-the-badge&logo=postgresql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-4.0-red?style=for-the-badge&logo=apache-maven&logoColor=white)

## 📖 Sobre o Projeto

Este desafio foi proposto pela Formação Java e Spring Framework G8 - ONE, parte da especialização back-end do Programa ONE, uma iniciativa da Oracle Next Education em parceria com a Alura. O objetivo é construir um catálogo de livros interativo que consome a API pública [Gutendex](https://gutendex.com/) para buscar e armazenar informações sobre livros e autores em um banco de dados local.

A aplicação permite ao usuário interagir através de um menu, realizando buscas, listando dados já registrados e consultando informações específicas, como autores vivos em um determinado ano ou livros em um idioma específico.

## 🎥 Demonstração em Vídeo

Para uma visão completa do funcionamento do Literalura, desde a busca na API até a consulta dos dados salvos no banco, assista à demonstração completa abaixo.

[![Demonstração do Projeto Literalura em Vídeo](https://img.youtube.com/vi/569cDyqnFFI&t=5s/0.jpg)](https://www.youtube.com/watch?v=569cDyqnFFI&t=5s)

*Clique na imagem para assistir ao vídeo no YouTube.*

## ✨ Funcionalidades

O projeto implementa as seguintes funcionalidades:

-   ✅ **Buscar Livro pelo Título:** Consulta a API Gutendex, verifica se o livro já existe no banco de dados e, caso não exista, salva o livro e seu autor.
-   ✅ **Listar Livros Registrados:** Exibe todos os livros que foram salvos no banco de dados.
-   ✅ **Listar Autores Registrados:** Mostra todos os autores salvos no banco de dados, junto com seus livros já registrados na aplicação.
-   ✅ **Listar Autores Vivos:** Permite ao usuário inserir um ano e exibe uma lista de autores que estavam vivos naquele ano.
-   ✅ **Listar Livros por Idioma:** Exibe uma lista de livros registrados em um idioma específico (Português, Inglês, Espanhol ou Francês).

## 🛠️ Tecnologias Utilizadas

Este projeto foi construído com um conjunto de tecnologias modernas e robustas do ecossistema Java:

-   **Java 17:** Versão LTS do Java, garantindo estabilidade e acesso a recursos modernos da linguagem.
-   **Spring Boot 3:** Framework principal para a criação da aplicação, gerenciando dependências e configurações de forma simplificada.
-   **Spring Data JPA:** Para persistência de dados, facilitando a comunicação com o banco de dados através de repositórios.
-   **Hibernate:** Implementação do JPA utilizada para o mapeamento objeto-relacional (ORM).
-   **PostgreSQL:** Sistema de gerenciamento de banco de dados relacional utilizado para armazenar os dados.
-   **Jackson:** Biblioteca para manipulação de JSON, utilizada para desserializar a resposta da API Gutendex.
-   **Maven:** Ferramenta de gerenciamento de dependências e automação de build do projeto.

## ▶️ Como Executar o Projeto

Siga os passos abaixo para executar o projeto em seu ambiente local.

### Pré-requisitos

-   Java 17 ou superior
-   Maven 3.8 ou superior
-   PostgreSQL 14 ou superior

### Passos

1.  **Clone o repositório:**
    git clone https://github.com/seu-usuario/literalura.git
    cd literalura
    
2.  **Instale as Dependências:**
    mvn install
    
3.  **Execute o Projeto:**
    mvn spring-boot:run
    
4.  **Acesse o Projeto:**
    http://localhost:8080 

5.  **Interaja com o Projeto:**
    Entre no menu e explore as funções disponíveis.

6.  **Crie o banco de dados:**
    Abra seu cliente PostgreSQL e execute o seguinte comando para criar o banco de dados:
    CREATE DATABASE literalura_db;

7.  **Configure as Propriedades do Banco de Dados:**
    Configure o acesso ao banco de dados no arquivo application.properties. Na pasta src/main/resources, crie um 
    arquivo chamado application.properties e preencha com suas credenciais do PostgreSQL:
    Properties # PostgreSQL application.properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/literalura_db
    spring.datasource.username=SEU_USUARIO_AQUI
    spring.datasource.password=SUA_SENHA_AQUI
    spring.datasource.driver-class-name=org.postgresql.Driver

8.  **Execute a Aplicação:**
    Abra um terminal na raiz do projeto e execute o seguinte comando Maven:
    mvn spring-boot:run
    A aplicação será iniciada e o menu interativo aparecerá no console.

# Configurações do JPA/Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true4. Execute a aplicaçãoAbra um terminal na raiz do projeto e execute
o seguinte comando Maven:Shell Scriptmvn spring-boot:runA aplicação será iniciada e o menu interativo aparecerá no console.API ExternaEste projeto utiliza a API gratuita Gutendex. Para mais informações, acesse a documentação oficial.

# API Externa:
Este projeto utiliza a API gratuita Gutendex. Para mais informações, acesse a documentação oficial.

## 🎓 Formação & Reconhecimento

Este projeto foi desenvolvido como parte do desafio da formação Java e Spring Framework G8 - ONE, do programa Oracle Next Education (ONE) em parceria com a Alura. Uma jornada de aprendizado rica e desafiadora que culminou neste catálogo literário interativo.

Agradecimentos especiais aos professores que tornaram esse caminho possível:

👩‍🏫 Jacqueline

👨‍🏫 Rodrigo

👩‍🏫 Iasmin

👩‍🏫 Brenda

Gratidão à Oracle e à equipe da Alura por promoverem uma educação acessível e transformadora. 💙

## 📝 Contribuindo
Se você gostaria de contribuir para o projeto, sinta-se a vontade para abrir um pull request. Se você encontrar um bug, por favor, abra um issue.

## 🌟 Agradecimentos
Agradecemos aos desenvolvedores da API Gutendex por fornecer uma ferramenta gratuita para pesquisa de livros.

## 📜 Licença
Este projeto está licenciado sob a Licenca MIT. Leia o arquivo LICENSE para mais detalhes.

## 📞 Contato
Se você tiver alguma pergunta ou sugestão, não hesite em entrar em contato comigo. Vamos conversar!

Desenvolvido com ❤️ por Gilvaneide Medeiros

[![Linkedin](https://img.shields.io/badge/Linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/gilvaneide-bertaccini/)

