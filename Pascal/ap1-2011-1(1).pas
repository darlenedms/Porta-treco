{
Escreva um programa em Pascal que leia do teclado um inteiro n, 
maior ou igual a 1, e que apresente no vídeo n linhas da forma abaixo. 
Por exemplo, as seguintes linhas devem ser apresentadas se n = 5.

25   20   15   10   5
20   15   10   5
15   10   5
10   5
5

Se n < 1, uma mensagem de erro deve ser apresentada no vídeo.
}

program q1(input{teclado}, output{video});
uses crt;

//recebe valor digitado pelo usuário
procedure lerValor(var n: integer{s});
begin
	write(output, 'Digite um valor: ');
	readln(input, n);
	while (n < 1) do	//não permite que o programa prossiga enquanto o valor não for maior que 1
	begin
		write(output, 'Digite um valor maior que 1: ');
		readln(n);
	end;
	clrscr;	//limpa a tela
end;

//exibe as linhas
procedure exibeLinhas(n: integer{e});
var
	i, j: integer;
begin
	for i := n downto 1 do
	begin
		for j := i downto 1 do
			write(output, n*j, '    ');
		writeln(output);	//quebra linha
	end;
end;

var
	n: integer;
begin
	lerValor(n);
	exibeLinhas(n);
	readln();
end.