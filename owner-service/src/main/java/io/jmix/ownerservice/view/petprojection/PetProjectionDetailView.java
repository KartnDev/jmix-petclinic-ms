package io.jmix.ownerservice.view.petprojection;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import io.jmix.ownerservice.entity.PetProjection;
import io.jmix.ownerservice.view.main.MainView;

@Route(value = "petProjections/:id", layout = MainView.class)
@ViewController(id = "PetProjection.detail")
@ViewDescriptor(path = "pet-projection-detail-view.xml")
@EditedEntityContainer("petProjectionDc")
public class PetProjectionDetailView extends StandardDetailView<PetProjection> {

}
