package Lab07;
import java.util.*;
public class tester {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            Parentheseschecker p=new Parentheseschecker();
            String checkBalancedExp= p.checkBalancedParenthesis(str);
            System.out.println(str+" : "+checkBalancedExp);
        }
    }
