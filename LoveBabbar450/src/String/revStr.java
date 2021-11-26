package String;
class Solution
{
    public static String reverseWords(String s)
    {
        System.out.println(s);
        int i=s.length()-1;
        String ans="";
        while(i>=0)
        {
            while(i>=0 && s.charAt(i)==' ')
                i--;
            int j=i;
            if(i<0)
                break;
            while(i>=0 && s.charAt(i)!=' ')
                i--;
            if(ans.isEmpty())
            {
                ans=ans.concat(s.substring(i+1, j+1));
            }
            else
            {
                ans=ans.concat(" "+s.substring(i+1, j+1));
            }
        }
        return ans;
        }
}
public class revStr {

    public static void main(String[] args) {
        
        Solution x=new Solution();
        System.out.println(x.reverseWords("The sky is blue"));

    }

 

}