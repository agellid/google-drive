package google.drive.infra;
import google.drive.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class DashboardHateoasProcessor implements RepresentationModelProcessor<EntityModel<Dashboard>>  {

    @Override
    public EntityModel<Dashboard> process(EntityModel<Dashboard> model) {

        
        return model;
    }
    
}
