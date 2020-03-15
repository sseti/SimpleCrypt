import static java.lang.Character.*;

public class ROT13 {

    private int shift;


    ROT13(Character cs, Character cf) {
        this.shift= (cf - cs);

    }

    ROT13() {
        this.shift = 13;
    }


    public String crypt(String text) throws UnsupportedOperationException {

        return encrypt(text);
    }

        public String encrypt ( String text){
            return text;
        }

        public String decrypt ( String text){
            return text;
        }

        public static String rotate ( String s, Character c){

            return "";
        }

    }
}
