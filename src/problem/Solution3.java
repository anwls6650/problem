package problem;

import java.util.ArrayList;
import java.util.List;

class Solution3 {
    public List<String> solution(String text, int n) {
        List<String> result = new ArrayList<>();
        StringBuilder currentLine = new StringBuilder();
        int currentLength = 0;

        
        
        for (char c : text.toCharArray()) {
            int charSize = (c >= '가' && c <= '하') ? 2 : 1;

            if (currentLength + charSize <= n) {
                currentLine.append(c);
                currentLength += charSize;
            } else {
                result.add(currentLine.toString());
                currentLine = new StringBuilder(String.valueOf(c));
                currentLength = charSize;
            }
        }

        if (currentLength > 0) {
            result.add(currentLine.toString());
        }

        return result;
    }
    
    

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();

        String text1 = "가나다abc123가나다abc123가나다abc123가나다abc123가나다abc123가나다abc123가나다abc123가나다abc123";
        int n1 = 20;
        System.out.println(solution3.solution(text1, n1));

        String text2 = "가나다abc123가나다abc123가나다abc123가나 다abc123가나다abc123가나다abc123가나다 abc123가나다abc123";
        int n2 = 15;
        System.out.println(solution3.solution(text2, n2));
    }
}
