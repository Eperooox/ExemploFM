package br.com.newtonpaiva.trabalho;
public class Main
{
    public static void main(String[] args)
    {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal cachorro = animalFactory.criarAnimal("Cachorro");
        cachorro.barulho();

        Animal gato = animalFactory.criarAnimal("Gato");
        gato.barulho();
    }
}