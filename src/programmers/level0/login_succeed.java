package programmers.level0;

/**
 * TITLE : 로그인 성공?
 * LEVEL : 0
 */
public class login_succeed {

    public static String solution(String[] id_pw, String[][] db) {
        String answer = "fail";;

        for(int i = 0; i < db.length; i++){
            if(id_pw[0].equals(db[i][0])){
                if(id_pw[1].equals(db[i][1])){
                    answer = "login";
                }else {
                    answer = "wrong pw";
                }
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        String[] idPw1 = {"meosseugi","1234"};
        String[] idPw2 = {"programmer01","15789"};
        String[] idPw3 = {"rabbit04","98761"};
        String[][] db1 = {{"rardss","123"},{"yyoom","1234"},{"meosseugi","1234"}};
        String[][] db2 = {{"programmer02","111111"},{"programmer00","134"},{"programmer01","1145"}};
        String[][] db3 = {{"jaja11","98761"},{"krong0313","29440"},{"rabbit00","111333"}};

        solution(idPw1,db1);
        solution(idPw2,db2);
        solution(idPw3,db3);

    }
}
