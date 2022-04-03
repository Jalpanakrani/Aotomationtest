package automationtest;

public class ForLoop_Q4 {
    static void printMyName(String name,int howManyTime){
int i;
        for( i =1;i<=howManyTime;i++) {
            System.out.println(i+"="+name);

        } }
    public static void main(String[] args) {

        printMyName("jalpa", 10);
        printMyName("jalpa", 15);
    }
}


