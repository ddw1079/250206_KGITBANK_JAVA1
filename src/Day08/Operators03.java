package Day08;

// ---- 논리 연산자 ----
// && (논리 AND 연산) : 논리 식이 모두 참이여야지만 true 를 반환. 하나라도 거짓이면 false 
// || (논리 OR 연산)  : 논리 식이 하나라도 참이면 true 를 반환. 모두 거짓이어야지만 false
// !  (논리 NOT 연산) : 하나의 피연산자에 적용. 논리 식을 부정함. 참이면 false, 거짓이면 true 를 반환.
// 

// 거짓 && 거짓 -> false
//  참  && 거짓 -> false
// 거짓 &&  참  -> false
//  참  &&  참  -> true

// 거짓 || 거짓 -> false
//  참  || 거짓 -> true
// 거짓 ||  참  -> true
//  참  ||  참  -> true

// ---- Short Circuit ----
// 논리식 계산 중 특정 조건에서 결과값이 예측 가능한 경우, 이후 논리식을 진행하지 않는다.
// && And 연산에서 첫번째 피연산자의 결과가 false 일 경우, 결과는 false 라고 예상할 수 있으므로 뒤의 연산은 진행하지 않는다.
//  --> !중요! 계산 전체를 스킵함. 증감 연산과 같은 부분도 진행하지 않음!


public class Operators03 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
        System.out.println("n1 == n1 && n2 == n2: " + (n1==n1 && n2==n2));
        
        // -- Short Circuit (!중요!)
        // 논리연산에서 첫번째 피연산자로 인하여 값이 정해질 경우, 이후 코드는 효율성을 위해 실행하지 않는다.
        // eg.)
        System.out.println("false && --n1 == n2++: " + (false && --n1 == n2++)); // <-- && 연산자 뒷부분이 Dead code 가 된다.
        System.out.printf("n1: %d n2: %d\n", n1, n2);                     // <-- 이에 증감 연산자로 인한 변화 없음.
        System.out.println("true && --n1 == n2++: " + (true && --n1 == n2++));
        System.out.printf("n1: %d n2: %d\n", n1, n2);  
        // eg2.)
        System.out.println("true || n3++ == --n4: " + (true || n3++ == --n4)); // <-- || 연산자 뒷부분이 Dead code 가 된다.
        System.out.printf("n3: %d n4: %d\n", n3, n4);                   // <-- 이에 증감 연산자로 인한 변화 없음.
        System.out.println("false || n3++ == --n4: " + (false || n3++ == --n4));
        System.out.printf("n3: %d n4: %d\n", n3, n4);

        System.out.println((n1 == (n1 = n2)) + " : " + n1 + " : " + n2);
        System.out.println(((n3 = n4) == n3) + " : " + n3 + " : " + n4);


    }
}
