package CollectionFW;

import java.util.*;
import java.util.Map.Entry;

class Test{
    public static void main(String[] args) {
    

        TreeMap<Long,String> treeMap=new TreeMap<>();
        treeMap.put((long) 7415, "Kanak");
        treeMap.put((long) 9111, "Tanvi");
        treeMap.put((long) 6260, "Arunendra");
        treeMap.put((long) 7879,"rishab");
        Set<Map.Entry<Long, String> > entrySet
            = treeMap.entrySet();
        List<Map.Entry<Long,String>> entryList=new ArrayList<>(entrySet);
        for(int i=0;i<4;i++)
       {
        System.out.println("Key at " + i + ":"
        + entryList.get(i).getKey());
       }System.out.println("-------------------------------------");
        for(int i=0;i<4;i++)
        {
            System.out.println(
                "Value at " + i + ":"
                + entryList.get(i).getValue());
        }System.out.println("-------------------------------------");
        for(int i=0;i<4;i++)
        {
            System.out.println("Key at " + i + ":"
            + entryList.get(i).getKey());
            System.out.println(
                "Value at " + i + ":"
                + entryList.get(i).getValue());
        }
    
    }
    }
