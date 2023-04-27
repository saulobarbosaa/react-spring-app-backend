# Aplicação Fullstack: Cardápio - _Backend_ 🔚

## Sobre o projeto 📚

Esse projeto foi desenvolvido em duas partes, front e backend, este repositório está relacionado com o backend da aplicação e para conferir o front basta [clicar aqui](https://github.com/saulobarbosaa/react-spring-app-frontend).

O projeto se baseia em uma aplicação web em um formato de cardápio, que mostra uma seleção de alimentos com seus nomes e preços.

## Propriedades do projeto e endpoints ⚙️

Através de uma classe Model, a entidade relacionada ao cardápio foi declarada com as colunas _id_, _image_, _price_ e _title_.

O projeto possui somente dois endpoints:
 - `findAll()`
 - `create()`
 - `delete()`

Como o próprio nome diz, o findAll() efetua um GET em todos os cadastros/refeições presentes na tabela, o create() efetua um cadastro na tabela e o delete() apaga um registro na tabela de acordo com o Id informado. 

Como modo de segurança e boa prática, foi utilizado o padrão de projeto DTO(Data Transfer Object) e para o mapeamento dos objetos foi utilizada a depedência ModelMapper.

Além do mais, foi escolhido o banco de dados PostgreSQL para a persistência dos dados.

## Frontend 🖥️

Como dito anteriormente, para conferir o repositório referente ao frontend da aplicação basta [clicar aqui](https://link.com).

## Obrigado pela atenção!

![Asta gif](https://media.tenor.com/Iy3Wtz2pCaAAAAAC/black-clover-asta.gif)
