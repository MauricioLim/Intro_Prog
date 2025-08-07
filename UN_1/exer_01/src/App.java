import java.util.HashMap;
import java.util.Map;

public class App{

    public static Map<String, String > teste = new HashMap<>();

    static{
        teste.put("1", "0001");
        teste.put("2", "0010");
        teste.put("3", "0011");
        teste.put("4", "0100");
        teste.put("5", "0101");
        teste.put("6", "0110");
        teste.put("7", "0111");
        teste.put("8", "1000");
        teste.put("9", "1001");
        teste.put("A", "1010");
        teste.put("B", "1011");
        teste.put("C", "1100");
        teste.put("D", "1101");
        teste.put("E", "1110");
        teste.put("F", "1111");
    }

    

    public static void main(String[] args){
        showMap();
    }

    public static void showMap(){
        String stt = "A2";

        for (int i = 0; i < teste.size(); i++) {
            for (int j = 0; j < stt.length(); j++) {
            
            }
        }
        

    }

}