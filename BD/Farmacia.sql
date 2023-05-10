CREATE SCHEMA IF NOT EXISTS Farmacia;

USE Farmacia;

CREATE TABLE IF NOT EXISTS Cliente(

	IDCliente INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	Nome VARCHAR(50) NOT NULL,
	Sexo VARCHAR(11) NOT NULL,
	DataNascimento DATE NOT NULL,
	EstadoCivil VARCHAR(20) NOT NULL,
	CPF VARCHAR(14) NOT NULL UNIQUE,
	Telefone VARCHAR(16) NOT NULL,
	Email VARCHAR(50) NOT NULL,
	Endereco VARCHAR(50) NOT NULL

);

CREATE TABLE IF NOT EXISTS Produto(

	IDProduto INT NOT NULL AUTO_INCREMENT,
	Nome VARCHAR(50) NOT NULL,
	CodProduto INT NOT NULL UNIQUE,
	Valor DECIMAL(10,2) NOT NULL,
	Categoria VARCHAR(50) NOT NULL,
	UnidadeVenda VARCHAR(10) NOT NULL,
	Quantidade INT NOT NULL,
	Descricao VARCHAR(100) NOT NULL,
	PRIMARY KEY(IDProduto)

);

CREATE TABLE IF NOT EXISTS Pedido(

	IDPedido INT NOT NULL AUTO_INCREMENT,
	fk_IDCliente INT NOT NULL,
	DataPedido DATE NOT NULL,
	HoraPedido TIME NOT NULL,
	Quantidade INT NOT NULL,
	ValorTotal DECIMAL(10,2) NOT NULL,

	PRIMARY KEY(IDPedido),
	FOREIGN KEY(fk_IDCliente) REFERENCES Cliente(IDCliente)

);

CREATE TABLE IF NOT EXISTS ItemPedido(

	IDItemPedido INT NOT NULL AUTO_INCREMENT,
	fk_IDPedido INT NOT NULL,
	NumItem INT NOT NULL,
	fk_IDProduto INT NOT NULL,
	Preco DECIMAL(10,2) NOT NULL,
	Quantidade INT NOT NULL,

	PRIMARY KEY(IDItemPedido),
	FOREIGN KEY(fk_IDPedido) REFERENCES Pedido(IDPedido),
	FOREIGN KEY(fk_IDProduto) REFERENCES Produto(IDProduto)

);
