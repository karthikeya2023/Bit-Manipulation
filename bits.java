import java.util.*;
public class bits{
    public String decimal2binary(int num){
        String res="";
        while(num!=0){
            if(num%2==1)res+='1';
            else{
                res+='0';
            }
            num/=2;
        }
        //need to reverse the String
        String result="";
        for (int j=(res.length()-1);j>=0;j--){
            result=result+res.charAt(j);
        }
        return result;
    } 
    public int binary2decimal(String bin){
        int res=0;
        int p=0; 
        for (int i=(bin.length()-1);i>=0;i--){
            if(bin.charAt(i)=='1'){
                res=res+(int)(Math.pow(2, p));
            }
            p++;

        }
        return res;
    }
    public void swap(int a,int b){
        int a1=a;
        int b1=b;
        a1=a1^b1;
        b1=a1^b1;
        a1=a1^b1;
        System.out.println(a1);
        System.out.println(b1);
    }
    public void GivenNumberIsEvenOrOdd(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n&1)==0)System.out.println("Given number is odd");
        else System.out.println("Given number is Even");
        
    }
    public static void main (String [] arr){
        // bits obj=new bits();
        // System.out.println(obj.binary2decimal("1110"));
        // System.out.println(obj.decimal2binary(14));
        // obj.swap(10,20);
        Scanner sc=new Scanner(System.in);
        // float value1=sc.nextFloat();
        // float value2=sc.nextFloat();
        // if(value1+value2>=0)System.out.println((int)(value1+ value2));
        // else System.out.println("negative value");
        String season=sc.next();
        switch (season) {
            case "Januvary":
                    System.out.println("It is an winter");
                break;
            case "february":
                    System.out.println("It is an winter");
                break;
            case "March":
                System.out.println("It is an summer");
                break;
            case "April":
                System.out.println("It is an summer");
                break;
            case "may":
                System.out.println("It is an summer");
                break;
            case "June":
                System.out.println("It is an summer");
                break;
            case "July":
                System.out.println("It is an ");
                break;
            case "Auguest":
                    System.out.println("It is an summer");
                break;
            case "september":
                System.out.println("It is an summer");
                break;
            case "November","december","october":
                    System.out.println("It is an monsoon");
                break;
            default:
                System.out.println("please enter a valid input");
                break;
        }
        switch (season) {
            case "monday","tuesday","wednesday","thrusday","friday": 
                System.out.println("weekDays");
                break;             
            case "saturday","sunday":
                System.out.println("weekEnd");
                break;
            default:
                break;
        }
        sc.close();

    } 
}