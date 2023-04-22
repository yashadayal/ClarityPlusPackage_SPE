package com.ClarityPlusPackage.RecipientMService.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="recipientdetails")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
public class RecipientDetails {

    @Id
    @Column(name = "OrderID")
    String OrderID;

    @Column(name = "InstituteID")
    String InstituteID;

    @Column(nullable=false,name="RecipientFirstName")
    String RecipientFirstName;

    @Column(nullable=false,name="RecipientLastName")
    String RecipientLastName;

    @Column(nullable=false,name="RecipientPhoneNumber")
    String RecipientPhoneNumber;

    @Column(nullable=false,name="Retailer")
    String Retailer;

    @Column(nullable=false,name="Received")
    Boolean Received;
}
