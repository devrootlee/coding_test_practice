package programmers.coding.codingLevel0;
/**
 * TITLE : 캐릭터의 좌표
 * LEVEL : 0
 */
public class characters_coordinates {

    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[board.length];
        int x = 0;
        int y = 0;

        // right
        for(int i = 0; i < keyinput.length; i++){
            if(keyinput[i].equals("right")){
                if(Math.abs(x + 1) <= board[0]/2){
                    x = x + 1;
                }
            }
            if(keyinput[i].equals("left")){
                if(Math.abs(x - 1) <= board[0]/2){
                    x = x - 1;
                }
            }

        }

        //y
        for(int i = 0; i < keyinput.length; i++){
            if(keyinput[i].equals("up")){
                if(Math.abs(y + 1) <= board[1]/2){
                    y = y + 1;
                }
            }
            if(keyinput[i].equals("down")){
                if(Math.abs(y - 1) <= board[1]/2){
                    y = y - 1;
                }
            }
        }

        System.out.println(x);
        System.out.println(y);
        answer[0] = x;
        answer[1] = y;

        return answer;
    }

    public static void main(String[] args) {
        String[] strArr1 = {"left", "right", "up", "right", "right"};
        String[] strArr2 = {"down", "down", "down", "down", "down"};
        String[] strArr3 ={"right", "right", "right", "right", "right", "left"};

        int[] intArr1 = {11,11};
        int[] intArr2 = {7,9};
        int[] intArr3 = {9,5};

//        solution(strArr1,intArr1);
        solution(strArr2,intArr2);
//        solution(strArr3,intArr3);
    }
}
