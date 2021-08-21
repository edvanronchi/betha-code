package aula12.exercicios.repositoy;

import aula12.exercicios.model.Funcionario;
import aula12.exercicios.util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepository implements Repository<Funcionario> {

    @Override
    public List<Funcionario> findAll() throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement = conn.prepareStatement("SELECT id, nome, cpf, salario FROM funcionarios ");
        ResultSet resultSet = statement.executeQuery();

        List<Funcionario> funcionarios = new ArrayList<>();

        while (resultSet.next()) {
            Long id = resultSet.getLong(1);
            String nome = resultSet.getString(2);
            String cpf = resultSet.getString(3);
            Double salario = resultSet.getDouble(4);

            funcionarios.add(new Funcionario(id, nome, cpf, salario));
        }

        conn.close();

        return funcionarios;
    }

    @Override
    public Funcionario findById(Long id) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement = conn.prepareStatement("SELECT nome, cpf, salario FROM funcionarios WHERE id = ?");
        statement.setLong(1, id);
        ResultSet resultSet = statement.executeQuery();

        Funcionario funcionario = null;

        while (resultSet.next()) {
            String nome = resultSet.getString(1);
            String cpf = resultSet.getString(2);
            Double salario = resultSet.getDouble(3);

            funcionario = new Funcionario(id, nome, cpf, salario);
        }

        conn.close();

        return funcionario;
    }
}