# Avaliação Mendix - Thaís Carvalho Gonçalves

![GitHub repo size](https://img.shields.io/github/repo-size/thaiscarvalhx/ThaisCarvalho_avaliacaoMendix)
![GitHub contributors](https://img.shields.io/github/contributors/thaiscarvalhx/ThaisCarvalho_avaliacaoMendix)
![GitHub stars](https://img.shields.io/github/stars/thaiscarvalhx/ThaisCarvalho_avaliacaoMendix?style=social)

## Descrição

Este projeto é parte de uma avaliação prática para criar uma aplicação Mendix que permite o **cadastro, edição, listagem e exclusão de produtos**. Ele inclui validações de negócio e destaques visuais para controle de estoque e datas de validade.

- Modelagem de dados.
- Configuração de lógica de negócios.
- Criação de interfaces amigáveis e intuitivas.
- Uso de práticas de desenvolvimento ágil.

## Funcionalidades

### Principais Funcionalidades

1. **Cadastro de Produtos**
   - Campos obrigatórios:
     - Nome do Produto (NM_Produto)
     - Descrição (DS_Produto)
     - Quantidade em Estoque (QT_Estoque)
     - Preço (VL_Preco)
     - Data de Validade (DT_Validade)

2. **Listagem de Produtos**
   - Exibe:
     - Nome do Produto
     - Quantidade em Estoque
     - Preço
     - Data de Validade
   - *Pesquisa por nome do produto*

3. **Edição de Produtos**
   - Permite alterar todos os campos dos produtos cadastrados no botão **Editar**.

4. **Exclusão de Produtos**
   - Exclusão com confirmação prévia no botão **Excluir**.
  
### Funcionalidades Extras

1. **Implementação de Segurança**
   - Utilizando *usuário e senha* para acesso ao Front e ao Swagger
     - usuário: MxAdmin
     - senha: 1
       
2. **Implementações de Legenda de Acessibilidade**
   - Status do Produto em estoque
   - Status do Produto sem estoque
   - Status do Produto vencido
     
3. **Criação de CRUD por chamada REST**
   - Listagem (GET)
   - Criação (POST)
   - Atualização (PUT)
   - Exclusão (DELETE)
  

## Requisitos

Certifique-se de ter os seguintes itens instalados antes de iniciar:

- Mendix Studio Pro (versão mínima: 10.6.4).
- Conta Mendix válida para deploy e execução.
- Navegador compatível para acesso à aplicação.

## Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/thaiscarvalhx/ThaisCarvalho_avaliacaoMendix.git
2. Abra o arquivo no Mendix Studio Pro.
3. Execute o projeto localmente ou faça o deploy no ambiente Mendix.
