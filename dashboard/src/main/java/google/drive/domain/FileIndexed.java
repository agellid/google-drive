package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class FileIndexed extends AbstractEvent {

    private String driveId;
    private Long id;
    private String filePath;
}


