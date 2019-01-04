/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ticket.sesion;

import com.ticket.entity.Ticket2;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nguye
 */
@Stateless
public class Ticket2Facade extends AbstractFacade<Ticket2> {

    @PersistenceContext(unitName = "TicketEvePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Ticket2Facade() {
        super(Ticket2.class);
    }
    
}
