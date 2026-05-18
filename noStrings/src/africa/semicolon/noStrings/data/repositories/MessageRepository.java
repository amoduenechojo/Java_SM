package semicolon.noStrings.data.repositories;


import semicolon.noStrings.data.models.Message;

import java.util.List;

public interface MessageRepository {
    Message save(Message message);
    Message findById(int id);

    List<Message> findAll();
    int count();

    void delete(int id);
    void delete(Message message);

    void deleteAll();

}
