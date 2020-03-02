package ParenthesesChecker;
import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ParenthesesChecker p=new ParenthesesChecker();
        String checkBalancedExp= p.checkBalancedParenthesis(str);
        System.out.println(str+" : "+checkBalancedExp);
    }
}



