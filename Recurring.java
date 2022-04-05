
public class Recurring{
    public static void main(String[] args) {
        final int ASCII_SIZE=256;

        int count[]=new int[ASCII_SIZE];
        String str="Harry Potter in his magical Island";
        int len=str.length();

        for(int i=0;i<len;i++)
        count[str.charAt(i)]++;

        int max=-1;
        char result=' ';
        for(int j=0;j<len;j++){
            if(max < count[str.charAt(j)]){
                max=count[str.charAt(j)];
                result=str.charAt(j);
            }
        }
        System.out.println("maximum times occuring character is "+ result);
    }
    }
