
ALTER TABLE ItemVenda RENAME COLUMN fk_IDVenda TO IDVenda;
ALTER TABLE ItemVenda RENAME COLUMN fk_CodProduto TO CodProduto;
ALTER TABLE Venda RENAME COLUMN fk_IDCliente TO IDCliente;

ALTER TABLE Cliente MODIFY Sexo VARCHAR(11);
ALTER TABLE Cliente MODIFY CPF VARCHAR(14);
ALTER TABLE Cliente MODIFY Telefone VARCHAR(16);

SELECT
	V.IDVenda AS 'NUM VENDA',
	V.DataHora AS 'DATA VENDA',
	C.Nome AS 'CLIENTE',
	V.QntItens AS 'QUANTIDADE',
	V.VlrTotal AS 'VALOR'
FROM Venda AS V
	INNER JOIN Cliente AS C  USING(IDCliente);

SELECT
	I.NumItem AS 'NUM ITEM',
	P.Nome AS 'PRODUTO',
	I.VlrUnitario AS 'PRECO UNI',
	I.Quantidade AS 'QNT',
	(I.VlrUnitario * I.Quantidade) AS 'VALOR'
FROM ItemVenda AS I
	INNER JOIN Produto AS P  USING(CodProduto)
WHERE IDVenda = 7;