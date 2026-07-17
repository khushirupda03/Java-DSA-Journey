public class ArrayIndexOutOfBoundExceptionDemo {
    public static void main(String[]args){
        int[]numbers={10,20,30,40,50};
        try{
            System.out.println(numbers[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Caught!");
            System.out.println(e);
        }

    }
}
