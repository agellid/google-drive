package google.drive.domain;

import google.drive.DashboardApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Dashboard_table")
@Data

public class Dashboard  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;


    public static DashboardRepository repository(){
        DashboardRepository dashboardRepository = DashboardApplication.applicationContext.getBean(DashboardRepository.class);
        return dashboardRepository;
    }




    public static void manageDashboard(FileIndexed fileIndexed){

        /** Example 1:  new item 
        Dashboard dashboard = new Dashboard();
        repository().save(dashboard);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileIndexed.get???()).ifPresent(dashboard->{
            
            dashboard // do something
            repository().save(dashboard);


         });
        */

        
    }
    public static void manageDashboard(FileUploaded fileUploaded){

        /** Example 1:  new item 
        Dashboard dashboard = new Dashboard();
        repository().save(dashboard);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(dashboard->{
            
            dashboard // do something
            repository().save(dashboard);


         });
        */

        
    }
    public static void manageDashboard(VideoStreamed videoStreamed){

        /** Example 1:  new item 
        Dashboard dashboard = new Dashboard();
        repository().save(dashboard);

        */

        /** Example 2:  finding and process
        
        repository().findById(videoStreamed.get???()).ifPresent(dashboard->{
            
            dashboard // do something
            repository().save(dashboard);


         });
        */

        
    }


}
