package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class FileIndexed extends AbstractEvent {

    private String driveId;
    private Long id;
    private String filePath;

    public FileIndexed(Index aggregate){
        super(aggregate);
    }
    public FileIndexed(){
        super();
    }
}
