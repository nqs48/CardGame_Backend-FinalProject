package com.sofka.cardgame.application.handle.model;

import java.util.Objects;
import java.util.Set;

public class MazoViewModel {

    private Integer cantidad;
    private Set<Carta> cartas;

    public void setCartas(Set<Carta> cartas) {
        this.cartas = cartas;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Set<Carta> getCartas() {
        return cartas;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public static class Carta {
        private  String cartaId;
        private  String jugadorId;
        private  Boolean estaOculta;
        private  Boolean estaHabilitada;
        private  Integer poder;

        private String url;

        public String getCartaId() {
            return cartaId;
        }

        public void setCartaId(String cartaId) {
            this.cartaId = cartaId;
        }

        public Boolean getEstaOculta() {
            return estaOculta;
        }

        public void setEstaOculta(Boolean estaOculta) {
            this.estaOculta = estaOculta;
        }

        public Boolean getEstaHabilitada() {
            return estaHabilitada;
        }

        public void setEstaHabilitada(Boolean estaHabilitada) {
            this.estaHabilitada = estaHabilitada;
        }

        public void setPoder(Integer poder) {
            this.poder = poder;
        }

        public Integer getPoder() {
            return poder;
        }

        public String getJugadorId() {
            return jugadorId;
        }

        public void setJugadorId(String jugadorId) {
            this.jugadorId = jugadorId;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            Carta carta = (Carta) object;
            return Objects.equals(cartaId, carta.cartaId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(cartaId);
        }
    }
}
