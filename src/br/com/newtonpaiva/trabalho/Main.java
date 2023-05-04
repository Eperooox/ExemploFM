package br.com.newtonpaiva.trabalho;
public class Main
{
    public static void main(String[] args)
    {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal dog = animalFactory.criarAnimal("Cachorro");
        dog.barulho(); // Output: AU!

        Animal cat = animalFactory.criarAnimal("Gato");
        cat.barulho(); // Output: MIAU!
    }
}