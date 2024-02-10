package com.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class List_and_HashMap {
    public List<List<Integer>> groupThePeople(int[] groupSizes) 
    {
       HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
       List<List<Integer>> ans = new ArrayList<>();

       for(int Idx=0;Idx<groupSizes.length;Idx++)
       {
        System.out.println(hm.containsKey(groupSizes[Idx]));
           if(!(hm.containsKey(groupSizes[Idx])))
            {
                hm.put(groupSizes[Idx],new ArrayList<Integer>());

            }
            hm.get(groupSizes[Idx]).add(Idx);
            System.out.println();
       }

       for(int set:hm.keySet())
       {
           int size = hm.get(set).size()/set;

           for(int Idx1=0;Idx1<size;Idx1++)
           {
                int init = 0;

                List <Integer> temp = new ArrayList<>();

                while(init<set)
                {
                    temp.add(hm.get(set).get(init));
                    init++;
                }
                ans.add(temp);

           }
       }
       return ans;
    }
}