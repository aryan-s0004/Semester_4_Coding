package hashing;/*
 Problem: Group Anagrams

Group strings that are anagrams.

 Input:
["eat","tea","tan","ate","nat","bat"]

 Output:
[[eat, tea, ate], [tan, nat], [bat]]
*/

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}