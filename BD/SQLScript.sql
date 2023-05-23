
ALTER TABLE ItemVenda RENAME COLUMN fk_IDVenda TO IDVenda;
ALTER TABLE ItemVenda RENAME COLUMN fk_CodProduto TO CodProduto;
ALTER TABLE Venda RENAME COLUMN fk_IDCliente TO IDCliente;
ALTER TABLE Venda RENAME COLUMN DataHora TO DataVenda (DATE);


ALTER TABLE Cliente MODIFY Sexo VARCHAR(11);
ALTER TABLE Cliente MODIFY CPF VARCHAR(14);
ALTER TABLE Cliente MODIFY Telefone VARCHAR(16);

CREATE VIEW Vendas(
	NumVenda,
	DataVenda,
	NomeCliente,
	QntItens,
	VlrTotalVenda
) AS
SELECT
	V.IDVenda,
	V.DataHora,
	C.Nome,
	V.QntItens,
	V.VlrTotal
FROM Venda AS V
	INNER JOIN Cliente AS C USING(IDCliente);

CREATE VIEW ItensVenda(
	NumVenda,
	NumItem,
	Produto,
	VlrUnitario,
	QntVendida,
	VlrTotalProd
) AS
SELECT
	I.IDVenda,
	I.NumItem,
	P.Nome,
	I.VlrUnitario,
	I.Quantidade,
	(I.VlrUnitario * I.Quantidade)
FROM ItemVenda AS I
	INNER JOIN Produto AS P USING(CodProduto);


TRIGGER Venda_BI BEFORE INSERT ON ItemVenda

CREATE TRIGGER tr_AtualizaEstoque AFTER INSERT ON ItemVenda
	FOR EACH ROW
		UPDATE Produto SET Estoque = Estoque - NEW.Quantidade WHERE CodProduto = NEW.CodProduto;
	
