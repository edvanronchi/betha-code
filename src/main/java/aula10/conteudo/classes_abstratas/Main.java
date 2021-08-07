package aula10.conteudo.classes_abstratas;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Funcionario funcionario = new Diretor("Edvan", 1500.0);

        System.out.println(funcionario.getBonificacao());
    }
}