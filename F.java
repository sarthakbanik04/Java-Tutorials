public class F{
    public static void main(String[] args) {
        int a=0,b=1;
        int count=0,c;
        while(count<10){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
            count++;
            
        }

    }
}
