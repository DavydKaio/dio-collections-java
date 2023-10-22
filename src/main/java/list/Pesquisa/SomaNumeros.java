package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int valorTotal = 0;

        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                valorTotal += numero;
            }
        } else {
            System.out.println("A lista está vazia");
        }
        return valorTotal;
    }

    public int encontrarMaiorNumero() {
        int maiorValor = Integer.MIN_VALUE;

        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero > maiorValor) {
                    maiorValor = numero;
                }
            }
        } else {
            System.out.println("A lista está vazia");
        }
        return maiorValor;
    }

    public int encontrarMenorNumero() {
        int menorValor = Integer.MAX_VALUE;

        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero < menorValor) {
                    menorValor = numero;
                }
            }
        } else {
            System.out.println("A lista está vazia");
        }
        return menorValor;
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
