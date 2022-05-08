package WordsToNum;
import java.util.HashMap;
public class wordToNum {
	static HashMap<String, Integer> numbers= new HashMap<String, Integer>();

    static HashMap<String, Integer> tnumbers= new HashMap<String, Integer>();

    static {
        numbers.put("zero", 0);
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);
        numbers.put("six", 6);
        numbers.put("seven", 7);
        numbers.put("eight", 8);
        numbers.put("nine", 9);
        numbers.put("ten", 10);
        numbers.put("eleven", 11);
        numbers.put("twelve", 12);
        numbers.put("thirteen", 13);
        numbers.put("fourteen", 14);
        numbers.put("fifteen", 15);
        numbers.put("sixteen", 16);
        numbers.put("seventeen", 17);
        numbers.put("eighteen", 18);
        numbers.put("nineteen", 19);


        tnumbers.put("twenty", 20);
        tnumbers.put("thirty", 30);
        tnumbers.put("fourty", 40);
        tnumbers.put("fifty", 50);
        tnumbers.put("sixty", 60);
        tnumbers.put("seventy", 70);
        tnumbers.put("eighty", 80);
        tnumbers.put("ninety", 90);

        //numbers.put("", );
    }
    
    
    private static String wordToNumber(String input) {
        System.out.println("===========\nInput string = "+input);
        String sum= "";
        Integer temp=null;
//        Integer previous=0;
        String [] splitted= input.toLowerCase().split(" ");
        for(String split:splitted){

            if( numbers.get(split)!=null){
                temp= numbers.get(split);

                sum=sum+temp;
            }
            else if(tnumbers.get(split)!=null){
                temp=tnumbers.get(split);
                sum=sum+temp;
            }

        }

        return sum;
    }
}
