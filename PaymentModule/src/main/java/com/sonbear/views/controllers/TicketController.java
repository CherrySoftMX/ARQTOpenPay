package com.sonbear.views.controllers;

import com.sonbear.views.TicketView;
import com.sonbear.views.controllers.utils.DialogUtils;
import java.awt.event.ActionEvent;
import java.util.UUID;

/**
 *
 * @author HikingCarrot7
 */
public class TicketController {

    private final TicketView ticketView;
    private boolean paid;

    public TicketController(TicketView ticketView) {
        this.ticketView = ticketView;
        initComponents();
    }

    private void initComponents() {
        ticketView.getLblClave().setText(UUID.randomUUID().toString());
        ticketView.getBtnTicketPagado().addActionListener(this::actionBtnPagarTicket);
    }

    private void actionBtnPagarTicket(ActionEvent e) {
        paid = true;
        DialogUtils.quitarDialog(ticketView);
    }

    public boolean isPaid() {
        return paid;
    }

}
