import java.util.Scanner;
public class add{
    public static void main(String[]args){       
        Scanner input=new Scanner(System.in);
        System.out.print("enter the start: ");
        int start= input.nextInt();
        System.out.print("enter the end: ");
        int end=input.nextInt();
        if(start<end){
            int sum=0;
            for(int counter=start;counter<=end;counter++){
                sum+=counter;
            }
            System.out.println("The sum is "+sum);   
        }
        else{
            System.out.println("Error");
        }
    }
}
