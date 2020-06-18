package io.github.rahulrajsonu.leetcode.aprilchallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

  public static void main(String[] args) {
    groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}).forEach(System.out::println);
  }

  /**
   * Given an array of strings, group anagrams together.
   *
   * Example:
   *
   * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
   * Output:
   * [
   *   ["ate","eat","tea"],
   *   ["nat","tan"],
   *   ["bat"]
   * ]
   * Note:
   *
   * All inputs will be in lowercase.
   * The order of your output does not matter.
   * @param strs
   * @return
   */
  public static List<List<String>> groupAnagrams(String[] strs) {
    Map<String,List<String>> grouped = new HashMap<>();
    for (String str : strs) {
      List<String> strings = Arrays.asList(str.split(""));
      Collections.sort(strings);
      String key = String.join("",strings);
      if(grouped.containsKey(key)){
        grouped.get(key).add(str);
      }else {
        List<String> newList = new ArrayList<>();
        newList.add(str);
        grouped.put(key,newList);
      }
    }
    return new ArrayList<>(grouped.values());
  }
}
