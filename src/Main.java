import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String jsonStringMessageAMG = new String("{\t\n" +
                "\t\"type\": \"AMG\",\n" +
                "\t\"var1\": \"First string\"\n" +
                "}");
        String jsonStringMessageAST = new String("{\t\n" +
                "\t\"type\": \"AST\",\n" +
                "\t\"var1\": \"First string\",\n" +
                "\t\"var2\": 2\n" +
                "}");
        String jsonStringMessageASL = new String("{\t\n" +
                "\t\"type\": \"ASL\",\n" +
                "\t\"var1\": \"First string\",\n" +
                "\t\"var2\": 2,\n" +
                "\t\"var3\": \"Second string\"\n" +
                "}");

        List<String> messagesList = new ArrayList<>();
        messagesList.add(jsonStringMessageAMG);
        messagesList.add(jsonStringMessageAST);
        messagesList.add(jsonStringMessageASL);

        MessageFactory messageFactory = new MessageFactory();
        messagesList.forEach(message -> System.out.println(messageFactory.createMessageByType(message).toString()));
    }
}
