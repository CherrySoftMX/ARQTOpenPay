package com.sonbear.views.controllers;

import com.sonbear.model.entities.Post;
import com.sonbear.views.PostForm;
import com.sonbear.views.controllers.utils.AlertUtils;
import com.sonbear.views.controllers.utils.DialogUtils;
import java.awt.event.ActionEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Sonbear
 */
public class PostFormController {

    private final PostForm postForm;
    private final Post newPost;
    private boolean accepted;

    public PostFormController(PostForm postForm, Post newPost) {
        this.postForm = postForm;
        this.newPost = newPost;
        initComponents();
    }

    private void initComponents() {
        postForm.getBtnAceptar().addActionListener(this::actionBtnAceptar);
        postForm.getBtnCancelar().addActionListener(this::actionBtnCancelar);
    }

    private void actionBtnAceptar(ActionEvent e) {
        if (allFieldsValid()) {
            accepted = true;
            fillNewPostData();
            DialogUtils.quitarDialog(postForm);
        } else
            AlertUtils.mostrarError(postForm, "Algún dato es incorrecto!");
    }

    private void actionBtnCancelar(ActionEvent e) {
        DialogUtils.quitarDialog(postForm);
    }

    private void fillNewPostData() {
        newPost.setConcepto(getConceptoDePago())
                .setTipoBien(getTipoBien())
                .setFechaAdjudicacion(getFechaAdjudicacion())
                .setHoraAdjudicacion(getHoraAdjudicacion())
                .setIdEvento()
                .setHusoHorario(getHusoHorario())
                .setImporte(getImporteServicio());
    }

    private boolean allFieldsValid() {
        return !getConceptoDePago().isEmpty()
                && !getTipoBien().isEmpty()
                && !getHusoHorario().isEmpty()
                && isImporteValido();
    }

    private String getConceptoDePago() {
        return postForm.getTxtConceptoPago().getText();
    }

    private String getTipoBien() {
        return postForm.getTxtTipoBien().getText();
    }

    private String getHusoHorario() {
        return postForm.getTxtHusoHorario().getText();
    }

    private double getImporteServicio() {
        return Double.parseDouble(postForm.getTxtImporte().getText());
    }

    private String getFechaAdjudicacion() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

    private String getHoraAdjudicacion() {
        Calendar rightNow = Calendar.getInstance();
        int hour = rightNow.get(Calendar.HOUR_OF_DAY);
        int minutes = rightNow.get(Calendar.MINUTE);
        int seconds = rightNow.get(Calendar.SECOND);
        return String.format("%02d:%02d:%02d", hour, minutes, seconds);
    }

    public boolean isImporteValido() {
        try {
            Double.parseDouble(postForm.getTxtImporte().getText());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isNewPostAccepted() {
        return accepted;
    }

}
