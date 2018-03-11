public class AMGMessage implements MessageInterface {

    private String type;
    private String var1;

    @Override
    public void read() {
        System.out.println("AMG");
    }
}
