public class ASLMessage extends Message {

    private String var1;
    private Integer var2;
    private String var3;

    @Override
    public void read() {
        System.out.println("ASL");
    }

    @Override
    public String toString() {
        return "ASLMessage{" +
                "var1='" + var1 + '\'' +
                ", var2=" + var2 +
                ", var3='" + var3 + '\'' +
                '}';
    }
}
