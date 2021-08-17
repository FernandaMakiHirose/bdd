#language: pt
#encoding: utf-8

Funcionalidade: Realizar Compra no E-commerce

	Como um comprador
	Quero ver a lista de produtos disponiveis
	Para que eu possa escolher qual devo comprar


  Cenario: Adicionar produto ao carrinho
  	Dado que um usuario acessa o site "http://automationpractice.com"
  	E pesquisa pelo produto "Blouse"
  	Quando adiciona o produto "Blouse" ao carrinho
  	Entao o produto "Blouse" deve estar presente no carrinho


  Cenario: Aumentar a quantiadade de produto atraves do detalhes do produto
	  Dado que um usuario acessa o site "http://automationpractice.com"
	  E pesquisa pelo produto "Printed Chiffon Dress"
	  E acessa o produto "Printed Chiffon Dress"
	  E aumenta a quantidade do produto
	  Quando adiciona o produto "Printed Chiffon Dress" ao carrinho
	  Entao o produto "Printed Chiffon Dress" deve possuir a quantidade 2

  @test
  Cenario: Realiza Compra
	  Dado que um usuario acessa o site "http://automationpractice.com"
	  E pesquisa pelo produto "Printed Chiffon Dress"
	  E adiciona o produto "Printed Chiffon Dress" ao carrinho
	  E acessa o checkout
	  E realiza o login
	  E confirma o endereco de entrega
	  E escolhe a forma de transporte
	  Quando o pagamento for confirmado
	  Entao deve ser apresentado a mensagem Your order on my Store is complete
