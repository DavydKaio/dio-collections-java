package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendentes = new ArrayList<>(numeros);
        if (!numeros.isEmpty()) {
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        } else {
            System.out.println("A lista está vazia");
        }
        return null;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendentes = new ArrayList<>(numeros);
        if (!numeros.isEmpty()) {
            numerosAscendentes.sort(Collections.reverseOrder());
            return numerosAscendentes;
        } else {
            System.out.println("A lista está vazia");
        }
        return null;
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "numeros=" + numeros +
                '}';
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(9);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(12);
        numeros.adicionarNumero(99);

        System.out.println(numeros.toString());

        System.out.println(numeros.ordenarAscendente());

        System.out.println(numeros.toString());

        System.out.println(numeros.ordenarDescendente());

        System.out.println(numeros.toString());
    }
}
