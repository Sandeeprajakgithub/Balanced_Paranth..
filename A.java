import java.util.*;
class BalancedParenthisis{
    static boolean checKBalancedParenthisis(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0 ; i < str.length() ; i++){
            char x = str.charAt(i);

            if(isStarting(x)){
                s.push(x);
            }else{
                if(s.isEmpty()){
                    return false;
                }else if(!checkEnd(x,s.peek())){
                    return false;
                }else{
                    s.pop();
                }
            }
        }
        return s.isEmpty();
    }
    static boolean isStarting(char x){
        return x == '(' || x=='{' || x == '[';
    }
    static boolean checkEnd(char a,char b){
        //string value => a
        // stack value => b
        return b == '(' && a == ')' || b == '[' && a == ']' || b == '{' && a == '}';
    }
}
class A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.next();
            // String str = "{[()]}";
            if(BalancedParenthisis.checKBalancedParenthisis(str)){
                System.out.println("balanced");
            }else{
                System.out.println("not Balanced");
            }
        }
    }
}