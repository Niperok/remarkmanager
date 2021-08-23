package ru.consyst.remarkmanager.web.screens.remark;

import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.haulmont.cuba.security.global.UserSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.consyst.remarkmanager.entity.Remark;

import javax.inject.Inject;


@UiController("remarkmanager_Remark.edit")
@UiDescriptor("remark-edit.xml")
@EditedEntityContainer("remarkDc")
@LoadDataBeforeShow
public class RemarkEdit extends StandardEditor<Remark> {
    private static final Logger log = LoggerFactory.getLogger(RemarkEdit.class);
    @Inject
    private UserSession userSession;
    @Inject
    private InstanceContainer<Remark> remarkDc;

    @Subscribe
    public void onInitEntity(InitEntityEvent<Remark> event) {
        Remark remark = event.getEntity();
        remark.setInitiator(userSession.getCurrentOrSubstitutedUser());
        remarkDc.setItem(remark);
    }

    @Subscribe(id = "remarkDc", target = Target.DATA_CONTAINER)
    public void onRemarkDcItemPropertyChange(InstanceContainer.ItemPropertyChangeEvent<Remark> event) {
        if (event.getProperty().equals("decision") &&
                remarkDc.getItem().getDecisionAutor() == null) {
            Remark remark = remarkDc.getItem();
            remark.setDecisionAutor(userSession.getCurrentOrSubstitutedUser());
            remarkDc.setItem(remark);
        }
    }
}