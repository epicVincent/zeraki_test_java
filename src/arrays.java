import java.util.ArrayList;


class Zerakitests{

    public int arraytest(int[] arr){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int missingInteger = 0;

        for(int i=0;i<arr.length;i++){
            int storeditem = arr[i];
            arrayList.add(storeditem);
        }
        for(int i=1;i<=arrayList.size();i++){
            if(!(arrayList.contains(i))){
                missingInteger = i;
            }
        }

        return missingInteger;
    }

    public String reverseString(String required){
        String reversedString = "";
        StringBuilder builder = new StringBuilder(required);
        reversedString = builder.reverse().toString();

        return reversedString;
    }

    public static void main(String[]args){
        int[] test_array = {1,2,3,5,6};
        Zerakitests test = new Zerakitests();
        int missingInt = test.arraytest(test_array);
        System.out.println(missingInt);
        System.out.println(test.reverseString("This is a test"));
    }
}

