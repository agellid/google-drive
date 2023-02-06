package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class VideoStreamed extends AbstractEvent {

    private Long id;
    private String driveId;
    private String filePath;
    private String videoUrl;
}


