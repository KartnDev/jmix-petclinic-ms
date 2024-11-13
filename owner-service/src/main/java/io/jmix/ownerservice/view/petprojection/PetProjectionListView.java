package io.jmix.ownerservice.view.petprojection;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;
import io.jmix.ownerservice.entity.PetProjection;
import io.jmix.ownerservice.view.main.MainView;

@Route(value = "petProjections", layout = MainView.class)
@ViewController(id = "PetProjection.list")
@ViewDescriptor(path = "pet-projection-list-view.xml")
@LookupComponent("petProjectionsDataGrid")
@DialogMode(width = "50em")
public class PetProjectionListView extends StandardListView<PetProjection> {

}
