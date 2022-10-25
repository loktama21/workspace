package Ex2;

public class FlowControl {
    public static int hexCharToDecimal(char hexChar){
        int num;
        switch(hexChar){
            case 'A':
                num = 10;
                break;
            case 'B':
                num = 11;
                break;
            case 'C':
                num = 12;
                break;
            case 'D':
                num = 13;
                break;
            case 'E':
                num = 14;
                break;
            case 'F':
                num =15;
                break;
            default:
                num = hexChar - '0';
        }
        return num;
    }
}
