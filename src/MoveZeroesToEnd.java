import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {2,0,5,3,0,2,0,1,0};
        moveZeroesToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroesToEnd(int[] arr)
    {
        int Idx = 0;

        for(int i=0; i< arr.length; i++)
        {
            if(arr[i] != 0)
            {
                arr[Idx++] = arr[i];
            }
        }

        while(Idx < arr.length)
        {
            arr[Idx++] = 0;
        }
    }

}
