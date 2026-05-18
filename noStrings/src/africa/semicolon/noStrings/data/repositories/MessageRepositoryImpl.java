package semicolon.noStrings.data.repositories;

import semicolon.noStrings.data.models.Message;
import java.util.ArrayList;
import java.util.List;

public class MessageRepositoryImpl implements MessageRepository {
    private int lastIdCreated;
    private List<Message> messages = new ArrayList<>();

    @Override
    public Message save(Message message) {
        if (message.getSenderId() == 0) {
            message.setSenderId();
            messages.add(message);
        }

        else {

            delete(message.getSenderId());
            messages.add(message);
        }
        return message;
    }

    private int generateId() {

        return ++lastIdCreated;
    }

    @Override
    public Message findById(int id) {
        for (Message message : messages) {

            if (message.getSenderId() == id)
                return message;
        }
        return null;
    }

    @Override
    public int count() {
        return messages.size();
    }

    @Override
    public void delete(int id) {

        Message found = findById(id);
        if (found != null) messages.remove(found);
    }

    @Override
    public void delete(Message message) {
        messages.remove(message);
    }

    @Override
    public void deleteAll() {
        messages.clear();
    }

    @Override
    public List<Message> findAll() {
        return messages;
    }
}