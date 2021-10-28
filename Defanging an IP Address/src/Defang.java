public class Defang {
    public static void main(String[] args) {
        defangIPaddr("255[.]100[.]50[.]0");
    }
    public static String defangIPaddr(String address) {
        String newAddress = "";
        for(int i = 0; i < address.length()-1; i++){
            if(address.charAt(i) == '.') newAddress += "[.]";
            else newAddress += address.charAt(i);
        }
        System.out.println(newAddress);
        return newAddress;
    }
}
