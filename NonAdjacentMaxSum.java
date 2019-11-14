public class NonAdjacentMaxSum {
    public static int maxSubsetSumNoAdjacent(int[] array) {
        int n = array.length;
        if(n==0) {
            return 0;
        }
        else if(n==1){
            return array[0];
        }
        else{
            int second = array[0];
            int first = Math.max(second, array[1]);
            for(int i=2; i< array.length; i++){
                int current = Math.max(first, second+array[i]);
                second = first;
                first = current;
            }
            //System.out.println(first + " " + second);
            return first;
        }
    }

    public static void main(String... args){
        int maxSum = maxSubsetSumNoAdjacent(new int[]{5, 11, 15, 7, 2, 9, 12, 15} );
        System.out.println(maxSum);
    }
}
