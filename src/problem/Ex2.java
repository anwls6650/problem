package problem;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<AnswerScore> arr = new ArrayList<>();
        arr.add(new AnswerScore(1, 4));
        arr.add(new AnswerScore(3, 2));
        arr.add(new AnswerScore(2, 1));

        // 점수 사람 초기화
        int highestScore = 0;
        List<Integer> highestScorers = new ArrayList<>();

        // 최고 점수 업데이트
        for (int i = 0; i < arr.size(); i++) {
            int score = arr.get(i).getScore();
            if (score > highestScore) {
                highestScore = score;                                     
                highestScorers.add(i);
            } else if (score == highestScore) {
                highestScorers.add(i);
            }
        }
      
        String[] names = {"a", "b", "c"};
        String result = "";

        for (int j = 0; j < highestScorers.size(); j++) {
            int scorerIndex = highestScorers.get(j);
            String name = names[scorerIndex];
            result += name + " : " + highestScore;
            if (j != highestScorers.size() - 1) {
                result += ", ";
            }
        }

        System.out.println(result);
    }

    static class AnswerScore {
        private int answer;
        private int score;

        public AnswerScore(int answer, int score) {
            this.answer = answer;
            this.score = score;
        }

        public int getAnswer() {
            return answer;
        }

        public int getScore() {
            return score;
        }
    }
}
