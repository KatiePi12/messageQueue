public class ASTMessage extends Message {

    private String var1;
    private Integer var2;

    @Override
    public void read() {
        System.out.println("AST");
    }

    @Override
    public String toString() {
        return "ASTMessage{" +
                "var1='" + var1 + '\'' +
                ", var2=" + var2 +
                '}';
    }
}
