public class Controle {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV=new SmartTV();

        System.out.println(smartTV.ligar());
        System.out.println("canal:"+smartTV.aumentarCanal());
        System.out.println("canal:"+smartTV.aumentarCanal());
        System.out.println("canal:"+smartTV.aumentarCanal());
        System.out.println("canal:"+smartTV.aumentarCanal());
        System.out.println("canal:"+smartTV.diminuirCanal());
        System.out.println("volume:"+smartTV.aumentarVolume());
        smartTV.definirCanal(20);
        System.out.println("canal:"+smartTV.canal);

    }
}
