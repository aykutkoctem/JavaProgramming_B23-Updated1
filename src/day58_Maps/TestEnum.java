package day58_Maps;

public class TestEnum {

    public static void main(String[] args) {

     //   String browser = "Cydeo";

        Browser browser = Browser.chrome;

        switch (browser){

            case firefox:
                System.out.println("Firefox driver is selected");
                break;

            case edge:
                System.out.println("Edge driver is selected");
                break;

            case  safari:
                System.out.println("Safari driver is selected");
                break;

            case  opera:
                System.out.println("Opera driver is selected");
                break;

            default:
                System.out.println("Chrome driver is selected");
        }


    }

}
