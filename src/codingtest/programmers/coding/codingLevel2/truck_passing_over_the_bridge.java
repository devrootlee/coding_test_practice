package codingtest.programmers.coding.codingLevel2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * TITLE : 다리를 지나는 트럭
 * LEVEL : 2
 */
public class truck_passing_over_the_bridge {

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        //다리 큐 생성
        Queue<Integer> bridge = new LinkedList<>();

        //맨 처음 비어있는 다리 공간 모두를 0으로 초기화
        for(int i = 0; i < bridge_length; i++){
            bridge.offer(0);
        }

        // 다리 길이가 1이거나 트럭의 개수가 1일 경우
        if(bridge_length == 1) return truck_weights.length+1;
        if(truck_weights.length == 1) return bridge_length+1;

        int idx = 0;

        // 현재 다리에 있는 모든 트럭의 무게
        int curWeight = 0;

        // 트럭의 개수만큼 계속 반복
        while(idx < truck_weights.length) {
            // 현재 다리에 존재하는 맨 앞 트럭의 무게를 빼준다
            curWeight -= bridge.poll();
            answer++;  // 새로운 트럭 넣기

            // 현재 다리에 있는 트럭 무게와 들어올 트럭 무게 합과 weight 비교
            if(curWeight + truck_weights[idx] <= weight) {
                bridge.offer(truck_weights[idx]);
                curWeight += truck_weights[idx++];
            }
            // 견딜 수 있는 무게보다 커지면 0을 넣는다
            else bridge.offer(0);
        }

        answer += bridge_length;

        // 마지막 트럭까지 다리를 건너는 값을 구하기 위해 + bridge_length
        return answer;
    }

    public static void main(String[] args) {
        int[] truck1 = {7,4,5,6};
        int[] truck2 = {10};
        int[] truck3 = {10,10,10,10,10,10,10,10,10,10};

//        solution(2,10,truck1);
        solution(100,100,truck2);
//        solution(100,100,truck3);
    }
}
