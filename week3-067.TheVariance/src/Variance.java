import java.util.ArrayList;


public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
       int sum=0;
       int a=0;
        for (int i:list){
            sum=sum+list.get(a);
            a++;
        }   
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return (double)sum(list)/list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        double sum=0;
        double avg=average(list);
        for (int i=0;i<list.size();i++){
           sum=sum+Math.pow(list.get(i)-avg,2);    
        }

        return sum/(list.size()-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        
        System.out.println("Sum is: " + sum(list));
        System.out.println("Avg is: " + average(list));
        System.out.println("The variance is: " + variance(list));
    }

}
