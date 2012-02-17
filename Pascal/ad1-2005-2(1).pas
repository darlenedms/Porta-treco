program exercicio1(input{teclado}, output{video});
var x, i, maximo, resto: integer;
var raiz: real;

function validaX:integer{s};
begin
	write(output, 'Digite um numero maior que um: ');
	readln(input, x);
	while (x <= 1) do
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
				writeln(output, 'Nao eh primo');
				exit;
		end;
		writeln(output,'Eh primo');
	end;
end;

begin
 validaX();
 primoX(x);
 readln();
end.