package br.com.newtonpaiva.trabalho;
public class AnimalFactory
{
    public Animal criarAnimal(String tipoAnimal)
    {
        if (tipoAnimal == null)
        {
            return null;
        }
        if (tipoAnimal.equalsIgnoreCase("Cachorro"))
        {
            return new Cachorro();
        } else if (tipoAnimal.equalsIgnoreCase("Gato"))
        {
            return new Gato();
        }
        return null;
    }
}
