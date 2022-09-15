package com.hsob.documentdb.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name = "payment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Positive
    private BigDecimal paymentValue;
    @NotBlank
    @Size(max=100)
    private String userName;
    @NotBlank
    @Size(max=19)
    private String cardNumber;
    @NotBlank
    @Size(max=7)
    private String expirationDate;
    @NotBlank
    @Size(min=3, max=3)
    private String securityCode;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Status status;
    @NotNull
    private Long orderId;
    @NotNull
    private Long paymentMethodId;
}
