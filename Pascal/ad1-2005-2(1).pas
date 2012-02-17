program exercicio1(input{teclado}, output{video});
var x, i, maximo, resto: integer;
var raiz: real;

function validaX:integer{s};
begin
	write(output, 'Digite um numero maior que um: ');
	readln(input, x);
	while (x <= 1) do {verifica se o número digitado é realmente maior que 1}
	begin
		write(output, 'Eu disse MAIOR que 1. Digite novamente: ');
		readln(input, x);
	end;
	validaX := x;
end;

procedure primoX(x:integer{e});
begin
	if (x = 2) then
		writeln(output, 'Eh primo.')
	else
	begin
		raiz := sqrt(x);
		maximo := round(raiz);
		for i:=2 to maximo do
		begin
			resto := x mod i;
			if (resto = 0) then
				writeln(output, 'Nao eh primo'); {ao encontrar resto zero, exibe a mensagem de que não é primo e sai da procedure}
				exit; {exit; para sair da procedure http://www.gnu-pascal.de/gpc/Exit.html   e   http://www.freepascal.org/docs-html/rtl/system/exit.html}
		end;
		writeln(output,'Eh primo'); {caso passe por todo o for e não encontre resto zero, só pode ser primo}
	end;
end;

begin
 validaX();
 primoX(x);
 readln();
end.