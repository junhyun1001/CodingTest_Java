/*
	1 : 31
    2 : 29
    3 : 31
    4 : 30
    5 : 31
    6 : 30
    7 : 31
    8 : 31
    9 : 30
    10: 31
    11: 30
    12: 31
*/

class Solution {
    public String solution(int a, int b) {
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int sum = 0;
        for (int i = 1; i < a; i++) {
            sum += month[i];
        }
        sum += b;
        
        return day[sum % 7];
    }
}