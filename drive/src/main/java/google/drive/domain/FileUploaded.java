package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String filePath;
    private String isVideoFile;
    private Long fileSize;
    private Integer userId;

    public FileUploaded(Drive aggregate){
        super(aggregate);
    }
    public FileUploaded(){
        super();
    }
}
