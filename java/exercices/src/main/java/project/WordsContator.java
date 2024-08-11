package project;

/*
Escribe un programa que lea una
lista de palabras y cuente cuántas veces aparece cada palabra utilizando
un HashMap.
*/


import java.util.HashMap;
import java.util.Map;

public class WordsContator {
    public static void main(String[] args) {
        String palabra= "contar,Cuantas,Veces,Sale,Cada,Palabra,Veces";


        countWords(palabra);

    }
    public static void countWords(String Palabra){
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] quantity = Palabra.split(",");

        for(String word : quantity){
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0)+1);
        }

        for(Map.Entry<String,Integer> entry : wordCountMap.entrySet()){
            System.out.println(entry.getKey()+ ":" + entry.getValue());
        }

    }
}