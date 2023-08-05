class Solution {
    public String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                sb.append("김서방은 ");
                sb.append(i);
                sb.append("에 있다");
                return String.valueOf(sb); 
            }
        }
        return String.valueOf(sb);
    }
}
