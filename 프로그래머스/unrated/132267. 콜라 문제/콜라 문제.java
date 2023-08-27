class Solution {
    public int solution(int a, int b, int n) {
        int sum = 0;
        
        /*
            20 / 3 = 6 (n % 3 != 0) n += n % a;
    		8 / 3 = 2; n += n % a; 4
    		4 / 3 = 1; n += n % a; 2(중단)

   		*/
        while(a <= n) {
            sum += n / a * b;
            n = n / a * b + n % a;
            
        }
        
        return sum;

    }
}