package Main.Practise9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer [] numbers = {3,4,31,5};
        List<Integer> nums = Arrays.asList(numbers);

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        List<String> words = new ArrayList<>();
        List<String> newWords = Arrays.asList("asd", "sda");
        List<String> newWordsCopy = new ArrayList<>(newWords);



        if(words.isEmpty()){
            for (String str : newWords){
                words.add(str);
            }
            for (int i = 0; i < newWords.size(); i++){
                words.add(newWords.get(i));
            }
            words.addAll(newWords);
        }
        words.remove("asd");
       // words.removeAll(newWords);
        words.set(0,"hello");



        for (String str : words){
            System.out.println(str);
        }


        System.out.println(words.contains("asd"));



    }
}
