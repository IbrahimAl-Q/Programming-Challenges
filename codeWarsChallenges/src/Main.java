import java.util.*;

public class Main {

    public static void main(String[] args) {


         Scanner in = new Scanner (System.in);
        // System.out.println("Enter a String: ");
       //  String stringEntered= in.nextLine();
         //int getvowels= getCount(stringEntered);
         //System.out.println(getvowels);
         //String s = toCAmelCase(stringEntered);
         //System.out.println("the resulted string is: "+ s);
        // int countDup= duplicateCount(stringEntered);
        // System.out.println(countDup);

         //String s= makeComplement(stringEntered);
         // System.out.println("the DNA result is:  "+ s);


        //  String s= spinwords(stringEntered);
         // System.out.println("spanned word is :  "+ s);

          List<Integer> list= new ArrayList<>();
          list.add(1);
          list.add(1);
          list.add(1);
          list.add(1);

          int value= convertBinaryArrayToInt(list);
          int [] array={5,3,2,8,1,4};
          String val= sortArray(array);
        //System.out.println(val);

         // System.out.println("from binary to decimal resulted with decimal value: "+value);



          String [] s1= {"tarp", "mice", "bull"};
          String [] s2 = {"lively", "alive", "harp", "sharp", "armstrong"};

          boolean areIn= whichArIn(s1,s2);
        System.out.println(areIn);

    }

    private static String sortArray(int []array){
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<array.length;i++){
          if (array[i]%2==0){
            evenList.add(array[i]);
            }
        }
        Iterator it = evenList.iterator();
        while(it.hasNext()){
          //  sb.append(it.next());
            int num = (int) it.next();
            System.out.println(num);
        }
        return sb.toString();
    }


    public static boolean whichArIn(String []s1, String []s2){

        for (int i = 0;i<s1.length;i++){
            for (int j=0;j<s2.length;j++){
                if (s2[j].contains(s2[i])){
                    System.out.println("the string " + s2[j] );
                }
                else{
                    return false;
                }
            }
        }

        return false;
    }


    private static int convertBinaryArrayToInt(List<Integer> binary){
        StringBuilder sb = new StringBuilder();
        Iterator it= binary.iterator();
        while(it.hasNext() ){
            int num= (int) it.next();
            sb.append(num);
        }
        String s= sb.toString();
        int decimal = Integer.parseInt(s, 2);
        return decimal;
    }

    private static String spinwords(String sentence){
        String [] str= sentence.split(" ");
        String temp="";
        for (int i =0; i<str.length;i++){
            if(str[i].length()>= 5){
               temp= temp+ " "+  new StringBuilder(str[i]).reverse().toString();
            }
            else{
                temp=temp+ " "+ str[i];
            }

        }

        return  temp;
    }

    private static String makeComplement(String dna) {

        StringBuilder str = new StringBuilder(dna);
        for(int i =0; i<str.length();i++){

           switch(str.charAt(i)){
               case 'A':
                   str.setCharAt(i,'T');
                   break;

               case 'T':
                   str.setCharAt(i,'A');
                   break;

               case 'G':
                   str.setCharAt(i,'C');
                   break;

               case 'C':
                   str.setCharAt(i,'G');
                   break;

               default:
                   System.out.println("couldn't flip");
            }
/*
            if (str.charAt(i)=='A'){
                str.setCharAt(i, 'T');
            }
            else if (str.charAt(i)=='T'){
                str.setCharAt(i, 'A');
            }
            else if (str.charAt(i)=='G'){
                str.setCharAt(i, 'C');
            }
            else if (str.charAt(i)=='C'){
                str.setCharAt(i, 'G');
            }*/
        }
    return str.toString();
    }

    private static int duplicateCount(String s) {
        Set<Character> characterSet = new HashSet<>();
        for (int i =0; i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if (Character.isUpperCase(s.charAt(i)) || Character.isUpperCase(s.charAt(j))){
                       char ch1= Character.toLowerCase(s.charAt(i));
                       char ch2= Character.toLowerCase(s.charAt(j));
                    if (ch1==ch2){
                        characterSet.add(s.charAt(i));
                    }
                }
                    else{

                    if (s.charAt(i)==s.charAt(j)){
                        characterSet.add(s.charAt(i));
                    }
                }
            }
        }
        int size= characterSet.size();
        System.out.println("set size is : "+ size);
        return size;
    }

    /**count vowels in a string**/
    private static int getCount(String s) {
        int vowelCount=0;

        for(int i=0; i<s.length();i++){
            if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' )
       vowelCount++;
        }

        return vowelCount;
    }

    /**
     *
     * toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"
     *
     * toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"
     *
     * **/

    private static String toCAmelCase(String s) {

        if(s.contains("_")){
            s= s.replace("_", "");
            System.out.println(s);
        }
        else if (s.contains("-")) {
            String[] str = s.split("-");
            String temp = "";
            for (int i = 1; i < str.length; i++) {
                if (Character.isLowerCase(str[i].charAt(0))) {
                    temp = temp + str[i].substring(0, 1).toUpperCase() + str[i].substring(1);
                }
                else if (Character.isUpperCase(str[i].charAt(0))){
                    temp= temp+ str[i];
                }
            }

            return str[0] + temp;
        }
        return "";
    }
}
