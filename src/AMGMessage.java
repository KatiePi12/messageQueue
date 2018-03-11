public class AMGMessage extends Message {

    private String var1;

    @Override
    public void read() {
        System.out.println("AMG");
    }

    @Override
    public String toString() {
        return "AMGMessage{" +
                "var1='" + var1 + '\'' +
                '}';
    }
}
