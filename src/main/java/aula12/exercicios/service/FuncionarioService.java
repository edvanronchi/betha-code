package aula12.exercicios.service;

import aula12.exercicios.model.Funcionario;
import aula12.exercicios.util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioService implements Service<Funcionario> {

    @Override
    public Funcionario save(Funcionario funcionario) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement insert = conn.prepareStatement("insert into funcionarios values(?,?,?,?)");
        insert.setLong(1, funcionario.getId());
        insert.setString(2, funcionario.getNome());
        insert.setString(3, funcionario.getCpf());
        insert.setDouble(4, funcionario.getSalario());
        insert.executeUpdate();
        conn.close();

        return funcionario;
    }

    @Override
    public Funcionario update(Funcionario funcionario) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement update = conn.prepareStatement("UPDATE funcionarios SET nome = ?, cpf = ?, salario = ? WHERE id = ?");
        update.setString(1, funcionario.getNome());
        update.setString(2, funcionario.getCpf());
        update.setDouble(3, funcionario.getSalario());
        update.setLong(4, funcionario.getId());
        update.executeUpdate();
        conn.close();

        return funcionario;
    }

    @Override
    public Funcionario delete(Funcionario funcionario) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement2 = conn.prepareStatement("DELETE FROM funcionarios WHERE id = ?");
        statement2.setLong(1, funcionario.getId());
        statement2.executeUpdate();
        conn.close();

        return funcionario;
    }
}