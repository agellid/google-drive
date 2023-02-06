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
    @Autowired DashboardRepository dashboardRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='FileIndexed'")
    public void wheneverFileIndexed_ManageDashboard(@Payload FileIndexed fileIndexed){

        FileIndexed event = fileIndexed;
        System.out.println("\n\n##### listener ManageDashboard : " + fileIndexed + "\n\n");


        

        // Sample Logic //
        Dashboard.manageDashboard(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='FileUploaded'")
    public void wheneverFileUploaded_ManageDashboard(@Payload FileUploaded fileUploaded){

        FileUploaded event = fileUploaded;
        System.out.println("\n\n##### listener ManageDashboard : " + fileUploaded + "\n\n");


        

        // Sample Logic //
        Dashboard.manageDashboard(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='VideoStreamed'")
    public void wheneverVideoStreamed_ManageDashboard(@Payload VideoStreamed videoStreamed){

        VideoStreamed event = videoStreamed;
        System.out.println("\n\n##### listener ManageDashboard : " + videoStreamed + "\n\n");


        

        // Sample Logic //
        Dashboard.manageDashboard(event);
        

        

    }

}


