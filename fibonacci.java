public class fibonacci {

    public static void main (String[]args){
        int n = 10;
        int a = 0, b= 1;
System.out.println("fibonacci series:");
for(int i = 1; i <= n; ++i){
    System.out.println(a + " ");
int sum = a + b;
a = b;
b = sum;

}
        
    }
}