package io.jmix.petservice.view.pet;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import io.jmix.petservice.entity.Pet;
import io.jmix.petservice.view.main.MainView;

@Route(value = "pets/:id", layout = MainView.class)
@ViewController(id = "Pet.detail")
@ViewDescriptor(path = "pet-detail-view.xml")
@EditedEntityContainer("petDc")
public class PetDetailView extends StandardDetailView<Pet> {
}