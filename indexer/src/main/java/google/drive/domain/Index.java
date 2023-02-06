package google.drive.domain;

import google.drive.domain.FileIndexed;
import google.drive.IndexerApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Index_table")
@Data

public class Index  {


    
    
    
    
    
    private String driveId;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String filePath;

    @PostPersist
    public void onPostPersist(){


        FileIndexed fileIndexed = new FileIndexed(this);
        fileIndexed.publishAfterCommit();

    }

    public static IndexRepository repository(){
        IndexRepository indexRepository = IndexerApplication.applicationContext.getBean(IndexRepository.class);
        return indexRepository;
    }




    public static void uploadComplete(FileUploaded fileUploaded){

        /** Example 1:  new item 
        Index index = new Index();
        repository().save(index);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(index->{
            
            index // do something
            repository().save(index);


         });
        */

        
    }


}
