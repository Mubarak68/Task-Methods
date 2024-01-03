import java.util.ArrayList;
import java.util.List;

public class SummationPractice {
    //First we have done an ArrayList to put our numbers
    //Second we added the numbers to sum them
    //Third we put these functions to let the other public static do the summations(int num = sum3(multi1);System.out.println(num);)
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> multi1 = new ArrayList<>();
        multi1.add(5);
        multi1.add(7);
        multi1.add(3);
        multi1.add(2);
        multi1.add(51);

        int num = sum3(multi1);
        System.out.println(num);

        
    }
    //we put int because of the return type
    //the for loop تفر على الارقام الي بالاري لست الي انا مسميهم نمس وتجمعهم
    // the return take the results back to the main methods
    public static int sum3(ArrayList<Integer> nums){
        int result = 0;
        for(int i = 0; i < nums.size(); i++){
            System.out.println(result + " + " + nums.get(i) + " = " + (result+nums.get(i)));
            result = result + nums.get(i);
        }
        return result;
    

    }
}
