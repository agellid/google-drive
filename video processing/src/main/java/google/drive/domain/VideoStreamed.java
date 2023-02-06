package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class VideoStreamed extends AbstractEvent {

    private Long id;
    private String driveId;
    private String filePath;
    private String videoUrl;

    public VideoStreamed(Video aggregate){
        super(aggregate);
    }
    public VideoStreamed(){
        super();
    }
}
