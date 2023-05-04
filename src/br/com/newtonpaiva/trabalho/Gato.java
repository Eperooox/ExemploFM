package br.com.newtonpaiva.trabalho;
import br.com.newtonpaiva.trabalho.Animal;
public class Gato implements Animal
{
    @Override
    public void barulho() {
        System.out.println("MIAU!");
    }
}
