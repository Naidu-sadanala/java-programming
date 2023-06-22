package com.Questions;
import java.util.*;
public class Question18 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        ArrayList<Integer> arr2 = new ArrayList<>();
//        ArrayList<Character> arr1=new ArrayList<>();
//        int count = 1;
//        char[] array = str.toCharArray();
//        for (int i = 0; i < array.length; i++) {
//            for (int j =i+1; j < array.length; j++) {
//                if(array[i] == array[j]){
//                    ++count;
//                    array[j]='#';
//                }
//                else if(array[i] == '#'){
//                    break;
//                }
//            }
//            if (array[i] != '#'){
//                arr1.add(array[i]);
//                arr2.add(count);
//                count = 1;
//                array[i]='#';
//            }
//        }
//        for (int i = 0; i < arr1.size(); i++) {
//            System.out.println(arr1.get(i) + " " + arr2.get(i));
//        }
        char ch = '9';
        String str = "999";
        int num = Integer.parseInt(str);
        int num2 = Character.getNumericValue(ch);
        System.out.println(num+1);
        System.out.println(num2+1);
    }
}
