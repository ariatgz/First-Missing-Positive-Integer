import java.util.*;

public class main {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Gimme your array's size: ");

        int size= scn.nextInt();

        int[] nums=new int[size];

        for (int i=0;i<size;i++){

            System.out.println("Gimme your #: ");
            nums[i]= scn.nextInt() ;
        }




       System.out.println(firstMissingPositive(nums));

    }

    public static int firstMissingPositive(int[] listOfNums){






      /**  for (int a=0;a< listOfNums.length ;a++) {

            if (listOfNums.get(a) <= 0){
                listOfNums.remove(a);
            }
            else {
                continue;
            }


        }**/

      if(listOfNums.length == 1){
          if (listOfNums[0] <= 0){
              return 1;
          }
          else if(listOfNums[0] == 1){
              return 2;
          }
          else {
              return 1;
          }
      }



        ArrayList<Integer> ints =new ArrayList<>();

        for(int k:listOfNums){
            if (k>0 && !ints.contains(k)){
                ints.add(k);
            }
        }

        if(ints.size() == 0 ){
            return 1;

        }

        Set<Integer> set = new HashSet<>(ints);
        ints.clear();
        ints.addAll(set);

        Collections.sort(ints);


        int ourNum=1;
        for (int b=1;b<= ints.get(ints.size()-1);b++){



            if (b == ints.get(ints.size()-1)) {
                ourNum = b+1;
                break;

            }


             if(b < ints.get(b-1)){

                 ourNum = b;
                 break;

            }





        }


        return ourNum;

    }




}
