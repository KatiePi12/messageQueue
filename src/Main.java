import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        String jsonString = new String("{\t\n" +
                "\t\"type\": \"AST\",\n" +
                "\t\"var1\": \"Some string\"\n" +
                "}");

        ASTMessage astMessage = new Gson().fromJson(jsonString, ASTMessage.class);

        MessageInterface message = new ASTMessage();
        //message.read();
    }
}
