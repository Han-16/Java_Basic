package typeCasting;

public class ex {

    public static void main(String[] args) {
        String myAddress = "Korea Seoul Mapo-gu (03922)";
        String[] addressSplit = myAddress.split(" ");
        String Country = addressSplit[0];
        String City = addressSplit[1];
        String Address = addressSplit[2];
        String Code = addressSplit[3];

        System.out.printf("Country : %s\nCity : %s\nAddress : %s\nCode : %s", Country, City, Address, Code);
    }


}
