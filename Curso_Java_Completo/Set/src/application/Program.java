package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        //HashSet é o mais rápido, porém não tem ordenação
        //TreeSet ordena os dados, porém mais lento
        //LinkedHashSet, mantem a ordem da inserção dos elementos

        Set<String> set = new LinkedHashSet<>();

        set.add("Tv");
        set.add("NoteBook");
        set.add("Tablet");

        set.removeIf(x -> x.length() >=3);      //Remove tudo que tiver igual ou maior 3 caracteres
        set.removeIf(x -> x.charAt(0) == 'T');  //Remove tudo que tem a primeira letra T
        
        System.out.println(set.contains("NoteBook"));

        for (String p : set) {
            System.out.println(p);
        }
    }
}
