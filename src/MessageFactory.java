import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class MessageFactory {

    public Message createMessageByType(String jsonMessageString) {

        JsonObject jsonMessage = new JsonParser().parse(jsonMessageString).getAsJsonObject();
        String messageType = jsonMessage.get("type").getAsString();

        switch(messageType) {
            case "AST": {
                return new Gson().fromJson(jsonMessage, ASTMessage.class);
            }
            case "ASL": {
                return new Gson().fromJson(jsonMessage, ASLMessage.class);
            }
            case "AMG": {
                return new Gson().fromJson(jsonMessage, AMGMessage.class);
            }
            default:
                return null;
        }
    }
}
