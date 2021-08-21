package aula11.conteudo.collections;

import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Edvan", "123", "321");
        Cliente cliente2 = new Cliente(2, "Felipe", "456", "654");
        Cliente cliente3 = new Cliente(3, "Bruno", "789", "987");

        List<Cliente> clienteList = new ArrayList<>();
        Map<String, Cliente> clienteMap = new HashMap<>();

        clienteList.add(cliente1);
        clienteList.add(cliente2);
        clienteList.add(cliente3);

        clienteMap.put("Cliente 1", cliente1);
        clienteMap.put("Cliente 2", cliente2);
        clienteMap.put("Cliente 3", cliente3);

        for (Cliente cliente: clienteList) {
            System.out.println(cliente);
        }
    }
}
