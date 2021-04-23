package CharacterSearch;

import java.util.LinkedList;
import java.util.Scanner;

public class CharacterUpToMax {
    public static void main(String[] args) {

        LinkedList<Character> max = new LinkedList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String string = input.nextLine();

        for (int i = 0; i < string.length(); i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for(int j = i + 1; j< string.length();j++){
                if(string.charAt(j) > list.getLast()){
                    list.add(string.charAt(j));
                }
            }
            if(list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
        }
        for (Character test: max
             ) {
            System.out.println(test);
        }
    }
}
