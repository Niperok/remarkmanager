package ru.consyst.remarkmanager.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "REMARKMANAGER_REMARK")
@Entity(name = "remarkmanager_Remark")
@NamePattern("%s|description")
public class Remark extends StandardEntity {
    private static final long serialVersionUID = 7382636069203987983L;

    @NotNull
    @Column(name = "PRODUCT", nullable = false)
    private String product;

    @NotNull
    @Column(name = "REMARK_TYPE", nullable = false)
    private Integer remarkType;

    @Lob
    @Column(name = "DESCRIPTION")
    private String description;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "INITIATOR_ID")
    private User initiator;

    @Lob
    @Column(name = "DECISION")
    private String decision;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DECISION_AUTOR_ID")
    private User decisionAutor;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REMARK_DATE", nullable = false)
    @NotNull
    private Date remarkDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DECISION_DATE")
    private Date decisionDate;


    public Date getDecisionDate() {
        return decisionDate;
    }

    public void setDecisionDate(Date decisionDate) {
        this.decisionDate = decisionDate;
    }

    public Date getRemarkDate() {
        return remarkDate;
    }

    public void setRemarkDate(Date remarkDate) {
        this.remarkDate = remarkDate;
    }

    public User getDecisionAutor() {
        return decisionAutor;
    }

    public void setDecisionAutor(User decisionAutor) {
        this.decisionAutor = decisionAutor;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public User getInitiator() {
        return initiator;
    }

    public void setInitiator(User initiator) {
        this.initiator = initiator;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RemarkType getRemarkType() {
        return remarkType == null ? null : RemarkType.fromId(remarkType);
    }

    public void setRemarkType(RemarkType remarkType) {
        this.remarkType = remarkType == null ? null : remarkType.getId();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

}