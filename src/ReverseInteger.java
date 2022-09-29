/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1*/

class ReverseInteger {
    public int reverse(int x) {
        boolean neg = false;
        long result = 0;        
            if(x<0){
               neg = true;
                x=x*(-1);
            }
            while(x>0){
                int rem = x%10;
                x=x/10;
                result = (result * 10) + rem;
            }
        if(neg == true)
            result = result * (-1);
        if( result >= Integer.MIN_VALUE && result <= Integer.MAX_VALUE)
              return (int)result;
        else
            return 0;               
        
    }
}
