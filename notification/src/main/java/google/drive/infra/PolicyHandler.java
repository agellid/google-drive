package google.drive.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import google.drive.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import google.drive.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired NotificationRepository notificationRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='FileUploaded'")
    public void wheneverFileUploaded_NotifyToUser(@Payload FileUploaded fileUploaded){

        FileUploaded event = fileUploaded;
        System.out.println("\n\n##### listener NotifyToUser : " + fileUploaded + "\n\n");


        

        // Sample Logic //
        Notification.notifyToUser(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='VideoStreamed'")
    public void wheneverVideoStreamed_NotifyToUser(@Payload VideoStreamed videoStreamed){

        VideoStreamed event = videoStreamed;
        System.out.println("\n\n##### listener NotifyToUser : " + videoStreamed + "\n\n");


        

        // Sample Logic //
        Notification.notifyToUser(event);
        

        

    }

}


