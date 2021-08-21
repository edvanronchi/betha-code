package aula12.exercicios;

import aula12.exercicios.model.Diretor;
import aula12.exercicios.model.Funcionario;
import aula12.exercicios.repositoy.FuncionarioRepository;
import aula12.exercicios.service.FuncionarioService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Diretor diretor = new Diretor(1L, "Edvan", "12345678900", 1000.50);

        diretor.bonificacao(10.0);

        FuncionarioService service = new FuncionarioService();

        service.save(diretor);

        diretor.setNome(diretor.getNome() + " - alterado");

        service.update(diretor);

        FuncionarioRepository repository = new FuncionarioRepository();

        for (Funcionario f: repository.findAll()) {
            System.out.println(f.toString());
        }

        System.out.println(repository.findById(1L));
    }
}