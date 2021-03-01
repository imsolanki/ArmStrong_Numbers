import java.util.Scanner;

public class ArmStrong {
    int number,from,to,frequency;


    ArmStrong(int number,int from, int to){
        this.number=number;
        this.from =from;
        this.to=to;

    }
    void isArmStrong(){
        int sum=0;
        String numAsString =String.valueOf(number);//number converted into string.
        char []c =numAsString.toCharArray();//string converted into char array to get indivisual no.
        for(int i=0;i<c.length;i++)//iterate over every number
        {
            int indivisualNumber= Integer.parseInt(String.valueOf(c[i]));//converting number character back to integer
            indivisualNumber = (int) Math.pow(indivisualNumber,c.length);//indivisual int num to the power total digits in number
            sum=sum+indivisualNumber;//adding all exponentials together to getting armstrong or not
        }
        if(sum==number){
            System.out.println(number+" is an ArmStrong number.");
        }
        else{
            System.out.println(number+" is not an ArmStrong number.");
        }

    }
    void armStrongInRange(){

        int totalNumbers =to-from;
        int []arr=new int[totalNumbers];
        //int armstrongNum =0;

        for(int i=0;i<arr.length;i++){
            int sum=0;
            arr[i]=from;
            from++;
            String numAsString =String.valueOf(arr[i]);
            char []c =numAsString.toCharArray();

            for(int j=0;j<c.length;j++)//iterate over every number
            {
                int indivisualNumber= Integer.parseInt(String.valueOf(c[j]));//converting number character back to integer
                indivisualNumber = (int) Math.pow(indivisualNumber,c.length);//indivisual int num to the power total digits in number
                sum=sum+indivisualNumber;//adding all exponentials together to getting armstrong or not
            }
            if(sum==arr[i]){
                frequency=frequency+1;
               // armstrongNum=arr[i];
                System.out.println("ArmStrong number in given Range: "+arr[i]);
            }
            /*else{
                System.out.println(arr[i]+" is not an ArmStrong number.");
            }*/
        }
        System.out.println("Total frequency of ArmStrong numbers in the given range is "+frequency);

    }



    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int stRange =sc.nextInt();
        int enRange = sc.nextInt();
        ArmStrong a = new ArmStrong(n,stRange,enRange);
        a.isArmStrong();
        a.armStrongInRange();
    }

}
