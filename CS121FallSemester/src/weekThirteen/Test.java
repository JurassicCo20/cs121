package weekThirteen;

public class Test {
    public static void main(String[] args) {
        ValidParenthesis valid = new ValidParenthesis();
        RecentCounter rec = new RecentCounter();
        System.out.println(valid.isValid("({[]})"));
        System.out.println(valid.isValid("([)]"));
        System.out.println(rec.ping(1));
        System.out.println(rec.ping(100));
        System.out.println(rec.ping(3001));
        System.out.println(rec.ping(3002));
    }
}
