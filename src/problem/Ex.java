package problem;



import java.util.ArrayList;
import java.util.List;

public class Ex{
    public static void main(String[] args) {
        List<AnswerScore> arr = new ArrayList<>();
        arr.add(new AnswerScore(1, 4));  // 답변 1, 점수 4
        arr.add(new AnswerScore(3, 2));  // 답변 3, 점수 2
        arr.add(new AnswerScore(2, 1));  // 답변 2, 점수 1

        int highestScore = 0;           // 최고 점수를 저장할 변수 초기화
        List<Integer> highestScorerIndexes = new ArrayList<>();  // 가장 높은 점수를 받은 참가자의 인덱스를 저장할 리스트 초기화

        // 최고 점수와 해당 참가자의 인덱스 찾기
        for (int i = 0; i < arr.size(); i++) {
            int score = arr.get(i).getScore();
            if (score > highestScore) {
                highestScore = score;
                highestScorerIndexes.clear();
                highestScorerIndexes.add(i);
            } else if (score == highestScore) {
                highestScorerIndexes.add(i);
            }
        }

        String[] names = {"a", "b", "c"};
        StringBuilder result = new StringBuilder();

        // 최고 점수를 받은 참가자의 이름과 점수 가져오기
        for (int j = 0; j < highestScorerIndexes.size(); j++) {
            int scorerIndex = highestScorerIndexes.get(j);
            String name = names[arr.get(scorerIndex).getAnswer() - 1];
            result.append(name).append(" : ").append(highestScore);
            if (j != highestScorerIndexes.size() - 1) {
                result.append(", ");
            }
        }

        System.out.println(result);
    }

    static class AnswerScore {
        private int answer;  // 답변 번호
        private int score;   // 점수

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
