public class Main {
    public static void main(String[] args){
        /*
            4 bytes
            */
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("My Min Float Value " +  myMinFloatValue);
        System.out.println("My Max Float Value " +  myMaxFloatValue);


        /*
        Double more precise and has more room for numbers
        8 bytes
         */
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("My Min double Value " +  myMinDoubleValue);
        System.out.println("My Max double Value " +  myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("My Int value = " + myIntValue);
        System.out.println("My Float Value = " +  myFloatValue);
        System.out.println("My Double Value = " +  myDoubleValue);

        double numberofPounds = 200d;
        double convertedKilograms = numberofPounds * 0.45359237d;
        System.out.println("converted Kilograms = " + convertedKilograms);

        double pi = 3.1415927d;
        System.out.println(pi);




    }
}
