drop database clinica;
create database clinica;
use clinica;

create table paciente(
nome varchar(100),
cpf varchar(100),
telefone varchar(100),
genero varchar(100),
idade int not null
);

create table funcionario(
nome varchar(100),
telefone varchar(100),
senha varchar(100)
);

create table consulta(
motivo varchar(100),
historico varchar(100)
);

create table procedimento (
dataP varchar(100),
descritivo varchar(100)
);

create table recepcionista (
nome varchar(100),
telefone varchar(100),
senha varchar(100),
cpf varchar(100)
);

create table medico (
nome varchar(100),
crm varchar(100),
telefone varchar(100),
especialidade varchar(100),
senha varchar(100)
);

create table exame (
consulta varchar(100),
data varchar(100),
descritivo varchar(100)
);

create table receita (
consulta varchar(100),
data varchar(100),
descritivo varchar(100)
);

