import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class MessageFactory {

    public Message createMessageByType(String jsonMessageString) {

        try{

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
                    throw new NoMessageTypeException("There is no matching message type");
            }
        }catch(JsonSyntaxException exception) {
            System.out.println("Exception occured: " + exception.getClass().toString() + " with message: " + exception.getMessage());
            return null;
        }catch (IllegalStateException exception) {
            System.out.println("Exception occured: " + exception.getClass().toString() + " with message: " + exception.getMessage());
            return null;
        }catch (NoMessageTypeException exception) {
            System.out.println("Exception occured: " + exception.getClass().toString() + " with message: " + exception.getMessage());
            return null;
        }catch (Exception exception) {
            System.out.println("Exception occured: " + exception.getClass().toString());
            return null;
        }
    }
}
