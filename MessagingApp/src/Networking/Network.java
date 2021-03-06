package Networking;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.EndPoint;

public class Network {
    public static final int port = 27960;

    public static void register(EndPoint endPoint) {
        Kryo kryo = endPoint.getKryo();
        kryo.register(ServerMessage.class);
        kryo.register(UserMessage.class);
    }

    static class Message {
        String message;

        @Override
        public String toString() {
            return message;
        }
    }

    public static class ServerMessage extends Message {}

    public static class UserMessage extends Message{
        String user;
        String text;

        @Override
        public String toString() {
            return user + ": " + text;
        }

        public String getUser() {
            return user;
        }

        public String getText() {
            return text;
        }
    }
}