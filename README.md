# Introdução a Behavior Driven Development (BDD) com Java
## Pré-requisitos
- JDK8
- Maven
- IDE 

## Entendendo o código
`RunnerTest.java`: chama as features, as features chamam os steps, os steps chamam as pages.
`tests`: cria o teste que vai rodar, no caso do RunnerTest.java.
`steps`: após as features serem definidas chama os steps, que são os passos a serem implementados.
`pages`: é onde o selenium age.

## Artigos para estudo
- [O que é o BDD?](https://zoop.com.br/blog/gestao/o-que-e-bdd-como-implementar/) 
- [Seus benefícios](https://auditeste.com.br/o-que-e-bdd-e-quais-sao-os-seus-beneficios/).

## Perguntas e respostas
### Quais as palavras utilizadas na estrutura básica de uma feature (Gherkin)? 
Na Funcionalidade: "Como", "Quero" e "Para". No Cenário: "Dado", "Quando" e "Então". Além disso, pode se utilizar o "E" para acrescentar um passo adicional no contexto em questão.

### Qual a função do Gherkin?
É padronizar a forma de descrever especificações de cenários, baseadas na regra de negocio.

### Quais são as possíveis respostas de um método booleano?
"True" ou "false", que equivalem a verdadeiro ou falso (sim ou não).

### O que é o BDD?
É um processo colaborativo que envolve membros do time com diferentes perspectivas (PO, QA DEV, UX), para entender e refinar os requisitos do cliente através de conversas sobre exemplos de uso e comportamentos do sistema.

### Qual o nome do plugin no Chrome que auxilia na busca elementos via CSS?
SelectorsHub.

### Normalmente, em um browser, qual a função do botão F12?
Ele é o botão de ferramenta do desenvolvedor, serve para pegar as informações da pagina na ferramenta de inspeção.

### Como funciona o Gherkin?
Ele é escrito em forma de "steps" ou "passos", os quais especificam cada etapa de interação do usuário com o sistema a ser testado.

### Qual a ferramenta mais popular para automatizar os testes em BDD?
Cumcuber.

### Qual ferramenta utilizada para automatizar os testes em BDD via Web?
Selenium.

### Qual a sequencia de chamada dos métodos dos projetos que utilizam BDD?
Runner > Features > Steps > Pages.
