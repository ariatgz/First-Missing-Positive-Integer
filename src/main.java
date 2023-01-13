import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Gimme your array's size: ");

        int size= scn.nextInt();

        ArrayList<Integer> nums=new ArrayList<>();

        for (int i=0;i<size;i++){

            System.out.println("Gimme your #: ");
            nums.add(scn.nextInt());
        }




       System.out.println(firstMissingPositive(nums));

    }

    public static int firstMissingPositive(ArrayList<Integer> listOfNums){




        for (int a=0;a< listOfNums.size();a++) {

            if (listOfNums.get(a) <= 0){
                listOfNums.remove(a);
            }
            else {
                continue;
            }


        }

        Collections.sort(listOfNums);






        for (int b=1;b<= listOfNums.get(listOfNums.size()-1)+1;b++){

            if (b> listOfNums.get(listOfNums.size()-1)) {
                return b;

            }


            else if(b != listOfNums.get(b-1)){

                return b;

            }





        }

        return 0;


    }




}
