public class Main {

    public static void main(String[] args) {
        String jsonString = new String("{\t\n" +
                "\t\"type\": 'AST',\n" +
                "\t\"var1\": 'First string',\n" +
                "\t\"var2\": 2\n" +
                "}");

        MessageFactory messageFactory = new MessageFactory();
        MessageInterface message = messageFactory.createMessageByType(jsonString);

    }
}
