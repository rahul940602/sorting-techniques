package bubbleSorting;

public class Example2 {

    public static  void main(String[] args){


        int[] sort = {2, 5, 1, 7, 9, 3, 5};

        bubble(sort);

        for(int i= 0; i<sort.length;i++){
            System.out.print(sort[i] + " ");
        }


    }

    private static void bubble(int[] sort) {

        int size = sort.length;

        for(int i =0; i <size; i++){

            for(int j =0; j<size-i-1;j++){

                if(sort[j] > sort[j +1]){

                    int temp = sort[j];
                    sort[j] = sort[j+1];
                    sort[j +1] = temp;
                }
            }
        }
    }
}
