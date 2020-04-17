package ru.itis.repository;

import org.springframework.data.repository.CrudRepository;
import ru.itis.model.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {
}
