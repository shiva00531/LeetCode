class Solution {
public:
    int divide(int dividend, int divisor) {
        
        // Handle overflow case
        if (dividend == INT_MIN && divisor == -1)
            return INT_MAX;  // 2^31-1
        
        // Determine sign of the result
        bool negative = (dividend < 0) ^ (divisor < 0);
        
        // Work with long long to avoid overflow during abs()
        long long a = labs(dividend);
        long long b = labs(divisor);
        
        long long result = 0;
        
        // Subtract divisor multiples using bit shifting
        while (a >= b) {
            long long temp = b, multiple = 1;
            
            // Double the divisor until it's just <= dividend
            while (a >= (temp << 1)) {
                temp <<= 1;        // temp = temp * 2
                multiple <<= 1;    // multiple = multiple * 2
            }
            
            a -= temp;
            result += multiple;
        }
        
        // Apply sign
        if (negative)
            result = -result;
        
        // Clamp to 32-bit range
        if (result > INT_MAX) return INT_MAX;
        if (result < INT_MIN) return INT_MIN;
        
        return (int)result;
    }
};
