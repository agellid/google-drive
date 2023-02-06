package google.drive.domain;

import google.drive.domain.VideoStreamed;
import google.drive.VideoProcessingApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Video_table")
@Data

public class Video  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String driveId;
    
    
    
    
    
    private String filePath;
    
    
    
    
    
    private String videoUrl;

    @PostPersist
    public void onPostPersist(){


        VideoStreamed videoStreamed = new VideoStreamed(this);
        videoStreamed.publishAfterCommit();

    }

    public static VideoRepository repository(){
        VideoRepository videoRepository = VideoProcessingApplication.applicationContext.getBean(VideoRepository.class);
        return videoRepository;
    }




    public static void checkVideoFile(FileUploaded fileUploaded){

        /** Example 1:  new item 
        Video video = new Video();
        repository().save(video);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(video->{
            
            video // do something
            repository().save(video);


         });
        */

        
    }


}
