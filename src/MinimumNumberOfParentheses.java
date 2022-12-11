public class MinimumNumberOfParentheses {
    public static void main(String[] args) {

        String s = "lee(t(c)o)de)";
        var remove = new MinimumNumberOfParentheses();
        var result = remove.minRemoveToMakeValid(s);
        System.out.println(result.toString());

    }
    public StringBuilder minRemove(CharSequence s , char open , char close) {
        StringBuilder sb = new StringBuilder();
        int balance = 0;
        for (int i = 0; i < s.length() ; i++){
            char c = s.charAt(i);
            if (c == open) {
                balance++;
            }

            if (c == close) {
                if(balance == 0) continue;
                balance--;
            }

            sb.append(c);
        }
        return sb;
    }

    public String minRemoveToMakeValid(String s){
        StringBuilder result = minRemove(s, '(' , ')');
        result = minRemove(result.reverse(), ')' , '(');
        return result.reverse().toString();
    }

}
// The time complexity: m X n (m,n are the sizes of the grid)
//The space complexity: m X n (m,n are the sizes of the grid)