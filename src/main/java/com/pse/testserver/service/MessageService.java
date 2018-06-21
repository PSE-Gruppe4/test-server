package com.pse.testserver.service;

import com.pse.testserver.entities.Message;
import com.pse.testserver.entities.User;
import com.pse.testserver.repository.MessageRepository;
import com.pse.testserver.repository.impl.MessageRepositoryAdvancedImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Service class implementing the business logic regarding the message entity, which includes (or may include
 * in future versions) searching, creating, modifying, deleting and other operations which the application needs
 * to perform on mainly message objects.
 * To perform these operations, methods of the injected repository class(es) are to be used.
 */
@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private MessageRepositoryAdvancedImpl messageRepositoryADV;

    @Transactional
    public Message getById(int id) {
        return messageRepository.findById(id);
    }


    @Transactional
    Message getBySender(User user) {
        return messageRepository.findBySender(user);
    }


    @Transactional
    public Message getByReceiver(User user) {
        return messageRepository.findByReceiver(user);
    }


    @Transactional
    public List<Message> getAllByReceiverSortedByDate(User user) {
        return messageRepositoryADV.findAllByReceiverSortedByDate(user);
    }

    @Transactional
    public List<Message> findAllByReceiverSortedBySender(User user) {
        return messageRepositoryADV.findAllByReceiverSortedBySender(user);
    }

    @Transactional
    public boolean sendMessage(Message message) {
        return false;
    }
}
