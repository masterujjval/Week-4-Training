package multiple_catch_blocks.multiplecatch;

import custom_exception.invalid_age.InvalidAge;

public class MultipleCatch {

    public static void catchBlock(Integer arr[], int target){
        try{
            int c=arr[target];
            System.out.println("Element at index "+target+" is "+c);

        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println("Null pointer exception: "+e.getMessage());
        }
    }

}
