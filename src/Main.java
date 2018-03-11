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
        String jsonStringMessageAMGWithExceptionJsonSyntax = new String("{\t\n" +
                "\t\"type\": \"AMG\",\n" +
                "\t\"var1\": \"First string\"\n" +
                "");
        String jsonStringMessageAMGWithExceptionNoMessageType = new String("{\t\n" +
                "\t\"type\": \"AMH\",\n" +
                "\t\"var1\": \"First string\"\n" +
                "}");

        List<String> messagesList = new ArrayList<>();
        messagesList.add(jsonStringMessageAMG);
        messagesList.add(jsonStringMessageAST);
        messagesList.add(jsonStringMessageASL);

//      Examples of exceptions - uncomment to see how it works
//        messagesList.add(jsonStringMessageAMGWithExceptionJsonSyntax);
//        messagesList.add(jsonStringMessageAMGWithExceptionNoMessageType);

        MessageFactory messageFactory = new MessageFactory();
        messagesList.forEach(messageString -> {
            Message message = messageFactory.createMessageByType(messageString);
            if(message != null)
                System.out.println(message.toString());
        });
    }
}
