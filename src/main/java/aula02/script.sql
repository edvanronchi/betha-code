--by Edvan Ronchi

--Cria tabela de paises
CREATE TABLE paises(
	id INT,
	nome VARCHAR(100) NOT NULL,
	populacao BIGINT,
	PRIMARY KEY(id)
);

--Cria tabela de estados
CREATE TABLE estados(
	id INT,
	nome VARCHAR(100) NOT NULL,
	populacao INT,
	i_paises INT,
	PRIMARY KEY(id),
	CONSTRAINT fk_estados_paises FOREIGN KEY (i_paises) REFERENCES paises(id)
);

--Cria tabela de cidades
CREATE TABLE cidades(
	id INT,
	nome VARCHAR(100) NOT NULL,
	populacao INT,
	i_estados INT,
	PRIMARY KEY(id),
	CONSTRAINT fk_cidades_estados FOREIGN KEY (i_estados) REFERENCES estados(id)
);

--Cria tabela de alunos
CREATE TABLE alunos(
	id INT,
	nome VARCHAR(100) NOT NULL,
	matricula INT,
	data_nascimento DATE,
	i_cidades INT,
	PRIMARY KEY(id),
	CONSTRAINT fk_alunos_cidades FOREIGN KEY (i_cidades) REFERENCES cidades(id)
);

--Cria tabela de professores
CREATE TABLE professores(
	id INT,
	nome VARCHAR(100) NOT NULL,
	data_nascimento DATE,
	i_cidades INT,
	PRIMARY KEY(id),
	CONSTRAINT fk_professores_cidades FOREIGN KEY (i_cidades) REFERENCES cidades(id)
);

--Cria tabela de materias
CREATE TABLE materias(
	id INT,
	descricao VARCHAR(100) NOT NULL,
	PRIMARY KEY(id)
);

--Cria tabela de turmas
CREATE TABLE turmas(
	id INT,
	descricao VARCHAR(100) NOT NULL,
	i_materias INT,
	i_professores INT,
	PRIMARY KEY(id),
	CONSTRAINT fk_turmas_materias FOREIGN KEY (i_materias) REFERENCES materias(id),
	CONSTRAINT fk_turmas_professores FOREIGN KEY (i_professores) REFERENCES professores(id)
);

--Cria tabela de frequencia de alunos
CREATE TABLE frequencias(
	id INT,
	data_aula DATE,
	compareceu BOOLEAN,
	i_turmas INT,
	i_alunos INT,
	PRIMARY KEY(id),
	CONSTRAINT fk_frequencia_turmas FOREIGN KEY (i_turmas) REFERENCES turmas(id),
	CONSTRAINT fk_frequencia_alunos FOREIGN KEY (i_alunos) REFERENCES alunos(id)
);

--Inseri dados

--Paises
INSERT INTO paises VALUES(1, 'China', 1411780000);
INSERT INTO paises VALUES(2, '�ndia', 1380004385);
INSERT INTO paises VALUES(3, 'Estados Unidos', 331449281);
INSERT INTO paises VALUES(4, 'Indon�sia', 273523615);
INSERT INTO paises VALUES(5, 'Brasil', 211755692);

--Estados
INSERT INTO estados VALUES(1, 'S�o Paulo', 46289333, 5);
INSERT INTO estados VALUES(2, 'Minas Gerais', 21292666, 5);
INSERT INTO estados VALUES(3, 'Rio de Janeiro', 17366189 , 5);
INSERT INTO estados VALUES(4, 'Xangai', 26317104, 1);
INSERT INTO estados VALUES(5, 'Washington', 692683, 3);
INSERT INTO estados VALUES(6, 'Santa Catarina', 7165000, 5);

--Cidades
INSERT INTO cidades VALUES(1, 'S�o Paulo', 21650000, 1);
INSERT INTO cidades VALUES(2, 'Rio de Janeiro', 6748000, 3);
INSERT INTO cidades VALUES(3, 'Seattle', 724305, 5);
INSERT INTO cidades VALUES(4, 'Belo Horizonte', 2722000, 2);
INSERT INTO cidades VALUES(5, 'Niteroi', 515317, 3);
INSERT INTO cidades VALUES(6, 'Abdon Batista', 2548, 6);
INSERT INTO cidades VALUES(7, 'S�o Jos� do Cerrito', 9061, 6);

--Alunos
INSERT INTO alunos VALUES(1, 'Edvan', 10, '1998-09-01', 3);
INSERT INTO alunos VALUES(2, 'Jos�', 20, '1988-12-23', 3);
INSERT INTO alunos VALUES(3, 'Manoel', 30, '1990-06-21', 4);
INSERT INTO alunos VALUES(4, 'Renan', 40, '1982-06-24', 1);
INSERT INTO alunos VALUES(5, 'Rafael', 50, '1982-11-09', 7);
INSERT INTO alunos VALUES(6, 'Thiago', 60, '1970-05-08', 6);

--Professores
INSERT INTO professores VALUES(1, 'Bruno', '1986-12-15', 1);
INSERT INTO professores VALUES(2, 'Gabriel', '1990-09-11', 1);
INSERT INTO professores VALUES(3, 'Jorge', '1992-05-30', 2);
INSERT INTO professores VALUES(4, 'Matheus', '1943-01-22', 3);
INSERT INTO professores VALUES(5, 'Rodrigo', '1982-12-07', 2);

--Materias
INSERT INTO materias VALUES(1, 'Banco de dados');
INSERT INTO materias VALUES(2, 'Programa��o | Front-End');
INSERT INTO materias VALUES(3, 'Programa��o | Back-End');
INSERT INTO materias VALUES(4, 'Logica de programa��o');
INSERT INTO materias VALUES(5, 'IA');

--Turmas
INSERT INTO turmas VALUES(1, 'Turma 01', 1, 1);
INSERT INTO turmas VALUES(2, 'Turma 02', 2, 2);
INSERT INTO turmas VALUES(3, 'Turma 03', 3, 3);
INSERT INTO turmas VALUES(4, 'Turma 04', 4, 4);
INSERT INTO turmas VALUES(5, 'Turma 05', 5, 5);

--Frequencias
INSERT INTO frequencias VALUES(1, '2021-01-01', false, 1, 1);
INSERT INTO frequencias VALUES(2, '2021-01-01', false, 2, 1);
INSERT INTO frequencias VALUES(3, '2021-01-01', false, 3, 1);
INSERT INTO frequencias VALUES(4, '2021-01-01', true, 4, 1);
INSERT INTO frequencias VALUES(5, '2021-01-01', false, 5, 1);
INSERT INTO frequencias VALUES(6, '2021-01-01', false, 1, 2);
INSERT INTO frequencias VALUES(7, '2021-01-01', true, 2, 2);
INSERT INTO frequencias VALUES(8, '2021-01-01', false, 3, 2);
INSERT INTO frequencias VALUES(9, '2021-01-01', false, 4, 2);
INSERT INTO frequencias VALUES(10, '2021-01-01', true, 5, 2);
INSERT INTO frequencias VALUES(11, '2021-01-01', true, 1, 3);
INSERT INTO frequencias VALUES(12, '2021-01-01', false, 2, 3);
INSERT INTO frequencias VALUES(13, '2021-01-01', tru e, 3, 3);
INSERT INTO frequencias VALUES(14, '2021-01-01', false, 4, 3);
INSERT INTO frequencias VALUES(15, '2021-01-01', true, 5, 3);
INSERT INTO frequencias VALUES(16, '2021-01-01', false, 1, 4);
INSERT INTO frequencias VALUES(17, '2021-01-01', true, 2, 4);
INSERT INTO frequencias VALUES(18, '2021-01-01', false, 3, 4);
INSERT INTO frequencias VALUES(19, '2021-01-01', false, 4, 4);
INSERT INTO frequencias VALUES(20, '2021-01-01', true, 5, 4);
INSERT INTO frequencias VALUES(21, '2021-01-01', true, 1, 5);
INSERT INTO frequencias VALUES(22, '2021-01-01', false, 2, 5);
INSERT INTO frequencias VALUES(23, '2021-01-01', true, 3, 5);
INSERT INTO frequencias VALUES(24, '2021-01-01', true, 4, 5);
INSERT INTO frequencias VALUES(25, '2021-01-01', true, 5, 5);
INSERT INTO frequencias VALUES(26, '2021-01-01', false, 1, 6);
INSERT INTO frequencias VALUES(27, '2021-01-01', false, 2, 6);
INSERT INTO frequencias VALUES(28, '2021-01-01', true, 3, 6);
INSERT INTO frequencias VALUES(29, '2021-01-01', true, 4, 6);
INSERT INTO frequencias VALUES(30, '2021-01-01', false, 5, 6);
INSERT INTO frequencias VALUES(31, '2021-01-02', true, 1, 1);
INSERT INTO frequencias VALUES(32, '2021-01-02', false, 2, 1);
INSERT INTO frequencias VALUES(33, '2021-01-02', true, 3, 1);
INSERT INTO frequencias VALUES(34, '2021-01-02', true, 4, 1);
INSERT INTO frequencias VALUES(35, '2021-01-02', true, 5, 1);
INSERT INTO frequencias VALUES(36, '2021-01-02', false, 1, 2);
INSERT INTO frequencias VALUES(37, '2021-01-02', true, 2, 2);
INSERT INTO frequencias VALUES(38, '2021-01-02', false, 3, 2);
INSERT INTO frequencias VALUES(39, '2021-01-02', false, 4, 2);
INSERT INTO frequencias VALUES(40, '2021-01-02', true, 5, 2);
INSERT INTO frequencias VALUES(41, '2021-01-02', true, 1, 3);
INSERT INTO frequencias VALUES(42, '2021-01-02', false, 2, 3);
INSERT INTO frequencias VALUES(43, '2021-01-02', true, 3, 3);
INSERT INTO frequencias VALUES(44, '2021-01-02', false, 4, 3);
INSERT INTO frequencias VALUES(45, '2021-01-02', true, 5, 3);
INSERT INTO frequencias VALUES(46, '2021-01-02', false, 1, 4);
INSERT INTO frequencias VALUES(47, '2021-01-02', true, 2, 4);
INSERT INTO frequencias VALUES(48, '2021-01-02', false, 3, 4);
INSERT INTO frequencias VALUES(49, '2021-01-02', false, 4, 4);
INSERT INTO frequencias VALUES(50, '2021-01-02', true, 5, 4);
INSERT INTO frequencias VALUES(51, '2021-01-02', true, 1, 5);
INSERT INTO frequencias VALUES(52, '2021-01-02', true, 2, 5);
INSERT INTO frequencias VALUES(53, '2021-01-02', false, 3, 5);
INSERT INTO frequencias VALUES(54, '2021-01-02', true, 4, 5);
INSERT INTO frequencias VALUES(55, '2021-01-02', false, 5, 5);
INSERT INTO frequencias VALUES(56, '2021-01-02', true, 1, 6);
INSERT INTO frequencias VALUES(57, '2021-01-02', false, 2, 6);
INSERT INTO frequencias VALUES(58, '2021-01-02', true, 3, 6);
INSERT INTO frequencias VALUES(59, '2021-01-02', false, 4, 6);
INSERT INTO frequencias VALUES(60, '2021-01-02', false, 5, 6);

--Consultas

--Criar um SQL que traga todos os alunos de uma cidade espec�fica. 
select  * from alunos where i_cidades = 1;
	
--Criar um SQL que traga todas as turmas de um determinado professor	
select * from turmas where i_professores = 1;

--Criar um SQL que traga a quantidade de alunos por cidade onde a popula��o for menor que 10 mil habitantes.	
select 
	c.nome, 
	count(*) as quantidade 
from 
	cidades c 
join 
	alunos a on (c.id = a.i_cidades) 
where 
	c.populacao < 10000 
group by 
	c.nome;
	
--Criar um SQL que traga as datas de nascimento de professores e alunos juntos.
select * from (
	select id, nome, data_nascimento, 'alunos' as tabela from alunos
	union all
	select id, nome, data_nascimento, 'professores' as tabela  from professores
) as alunos_professores;

--Criar um SQL que traga o nome da cidade e o nome do aluno na mesma consulta.
select 
	a.nome as nome_aluno, 
	c.nome as nome_cidade 
from 
	alunos a, cidades c 
where 
	a.i_cidades = c.id;

--Criar um SQL que traga a quantidade de alunos que compareceram e que n�o compareceram �s aulas, por turma e em uma data especifica.
select 
	descricao as turma,
	data_aula,
	count((select id from frequencias where id = f.id and compareceu = true)) as compareceu_true, 
	count((select id from frequencias where id = f.id and compareceu = false)) as compareceu_false 
from 
	turmas t 
join 
	frequencias f on (t.id = f.i_turmas) 
group by 
	descricao, data_aula 
having 
	data_aula = '2021-01-02';