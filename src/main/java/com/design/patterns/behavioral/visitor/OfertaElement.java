package com.design.patterns.behavioral.visitor;

/**
 * Created by albertopalomarrobledo on 2/8/19.
 */
public interface OfertaElement {
    void accept(CreditCardVisitor visitor);
}
