package udemycourse.Course1;

public class Traning {
    public static void main(String[] args) {

        // var s = "Yo World";
      ///  System.out.println(s.substring(3));



        int time , move , lvl ,multiplier;

        time=45;
        move=35;
        lvl=4;
        multiplier=10000;



       int score=(int)score(time,move,lvl,multiplier);

        System.out.println(score);
    }

    public static double score(double time,double move ,double lvl,double multiplier){

        double score;

        score=multiplier*lvl*(1/move)*(1/time);
       // score=5;
        return score;
    }


}
