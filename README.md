# Petshop
Projeto de treinamento. Programa de estágio Wipro 2019


Escopo: Fernanda é professora de matemática e gosta bastante de animais, recentemente resolveu largar o trabalho como professora pra se dedicar a sua grande paixão: cuidar de animais. Fernanda gastou quase todas as suas economias para abrir um pet shop. Apesar da pouca experiência na área, Fernanda criou algumas estratégias para organizar seu serviço e fornecer um preço justo a seus clientes, sempre focando na sua capacidade e garantindo a qualidade do atendimento. Essa foi a estratégia que fernanda elaborou para tocar seu negócio:
•	Cada serviço demora determinado tempo para ser executado e o tempo varia de acordo com o porte e raça do animal, portando o valor também varia.
o	Ex: Banho em um cachorro de porte médio demora 30 min. R$ 45
o	Ex: Banho em um cachorro de porte pequeno demora 20 min. R$ 40
o	Ex: Tosa em um spits alemão demora 2h. R$ 120
•	A quantidade de serviços diponível no dia depende da quantidade de funcionarios. Se algum funcionário faltar, nao será possivel atender a mesma demanda
•	Os serviços podem ser agendados com antecedencia por telefone
•	O contato no cliente é importante para poder avisar de possíveis atrasos ou quando o serviço está completo
•	Os clientes podem agendar quando irão deixar e buscar o animal, sendo obrigatório retirar o animal no mesmo dia em que foi deixado no pet shop
•	Ao termino do serviço é tirada uma foto e enviada pro cliente
•	O foco é trabalhar proximo de 80% da capacidade, para caso ocorra algum imprevisto os funcionários não precisem fazer hora extra
 
Todo o controle é feito em um caderno, o que recentemente tem provocado bastante trabalho, porque existe a possibilidade de ocorrecem cancelamentos, demora para encontrar os contatos dos donos, e para controlar quais clientes pagaram ou não.
 
Seu trabalho consiste em densenvolver um software para auxiliar Fernanda a gerenciar o pet shop e eliminar o controle feito no caderno.
 
O projeto será dividido nas seguintes etapas:
 
Analise
Nesta etapa você deverá documentar as principais regras de negócio do sistema e apresentar o diagrama de entidade e relacionamento do banco de dados. Fique a vontade para utilizar outros recursos, como wireframes e diagrams UML
 
Arquitetura
Nesta etapa você deverá documentar a arquitetura da sua solução, através de um diagrama de rede e quais queis outros recursos que achar relevante. 
 
Implementação
Está será a etapa onde irá implementar a sua solução. Sugiro seguir o seguinte fluxo:
1.	Criação das entidades
2.	Criação da API REST (1 endpoint por vez)
a.	Criação do controller
b.	Criação do serviço
c.	Acesso ao banco de dados (insert, update, delete, search)
d.	Implementação das regras de negócio
3.	Criação do front end em angular
