package codingtest.programmers.coding.codingLevel0;

import java.util.*;

/**
 * TITLE : 특이한 정렬
 * LEVEL : 0
 */
public class unusual_arrangement {

    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        List<Map<String,Object>> list = new ArrayList<>();
        List<Double> lengthList = new ArrayList<>();

        for(int i = 0; i <numlist.length; i++){
            Map idxLengthMap = new LinkedHashMap();

            idxLengthMap.put("idx",i);
            idxLengthMap.put("value",numlist[i]);
            if(n - numlist[i] < 0){
                idxLengthMap.put("length",Math.abs(n-numlist[i]) - 0.5);
                lengthList.add(Math.abs(n-numlist[i]) - 0.5);
            }else {
                idxLengthMap.put("length",(double)(n-numlist[i]));
                lengthList.add((double) n-numlist[i]);
            }

            list.add(idxLengthMap);
        }

        System.out.println(list);
        Collections.sort(lengthList);
        System.out.println(lengthList);

        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size(); j++){
                if(lengthList.get(i) == (double)list.get(j).get("length")){
                    answer[i] = Integer.parseInt(list.get(j).get("value").toString());
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] intArr1 = {1,2,3,4,5,6};
        int[] intArr2 = {10000,20,36,47,40,6,10,7000};

        solution(intArr1,4);
        solution(intArr2,30);
    }
}
