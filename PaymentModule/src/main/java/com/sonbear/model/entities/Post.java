package com.sonbear.model.entities;

import java.util.UUID;

/**
 *
 * @author Sonbear
 */
public class Post extends Entity {

    public static final String COSTO = "20";

    private final String sellerId;
    private String concepto;
    private String tipoBien;
    private String idEvento;
    private String fechaAdjudicacion;
    private String horaAdjudicacion;
    private String husoHorario;
    private double importe;
    private boolean published;

    public Post(String id, String sellerId, String concepto, String tipoBien, String idEvento,
            String fechaAdjudicacion, String horaAdjudicacion, String husoHorario, double importe, boolean published) {

        super(id);
        this.sellerId = sellerId;
        this.concepto = concepto;
        this.tipoBien = tipoBien;
        this.idEvento = idEvento;
        this.fechaAdjudicacion = fechaAdjudicacion;
        this.horaAdjudicacion = horaAdjudicacion;
        this.husoHorario = husoHorario;
        this.importe = importe;
        this.published = published;
    }

    public Post(String sellerId) {
        super(UUID.randomUUID().toString());
        this.sellerId = sellerId;
        this.published = false;
    }

    public Post setConcepto(String concepto) {
        this.concepto = concepto;
        return this;
    }

    public Post setTipoBien(String tipoBien) {
        this.tipoBien = tipoBien;
        return this;
    }

    public Post setIdEvento() {
        return setIdEvento(UUID.randomUUID().toString());
    }

    public Post setIdEvento(String idEvento) {
        this.idEvento = idEvento;
        return this;
    }

    public Post setImporte(double importe) {
        this.importe = importe;
        return this;
    }

    public Post setFechaAdjudicacion(String fechaAdjudicacion) {
        this.fechaAdjudicacion = fechaAdjudicacion;
        return this;
    }

    public Post setHoraAdjudicacion(String horaAdjudicacion) {
        this.horaAdjudicacion = horaAdjudicacion;
        return this;
    }

    public Post setHusoHorario(String husoHorario) {
        this.husoHorario = husoHorario;
        return this;
    }

    public String getSellerId() {
        return sellerId;
    }

    public String getConceptoPago() {
        return concepto;
    }

    public String getTipoBien() {
        return tipoBien;
    }

    public String getIdEvento() {
        return idEvento;
    }

    public String getFechaAdjudicacion() {
        return fechaAdjudicacion;
    }

    public String getHoraAdjudicacion() {
        return horaAdjudicacion;
    }

    public String getHusoHorario() {
        return husoHorario;
    }

    public double getImporte() {
        return importe;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    @Override public String toString() {
        return "Post{" + "seller=" + sellerId + ", concepto=" + concepto
                + ", tipoBien=" + tipoBien + ", idEvento=" + idEvento
                + ", importe=" + importe + ", fechaAdjudicacion=" + fechaAdjudicacion
                + ", horaAdjudicacion=" + horaAdjudicacion + ", husoHorario=" + husoHorario + '}';
    }

}
