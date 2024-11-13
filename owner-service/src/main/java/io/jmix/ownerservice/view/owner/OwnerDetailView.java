package io.jmix.ownerservice.view.owner;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import io.jmix.ownerservice.entity.Owner;
import io.jmix.ownerservice.view.main.MainView;

@Route(value = "owners/:id", layout = MainView.class)
@ViewController(id = "Owner.detail")
@ViewDescriptor(path = "owner-detail-view.xml")
@EditedEntityContainer("ownerDc")
public class OwnerDetailView extends StandardDetailView<Owner> {
}