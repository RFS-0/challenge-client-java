package com.zuehlke.jasschallenge.client.websocket.messages.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zuehlke.jasschallenge.game.Trumpf;

public class TrumpfChoice {
    private final Trumpf mode;
    private final RemoteColor trumpfColor;

    public TrumpfChoice(@JsonProperty(value = "mode", required = true) Trumpf trumpf,
                        @JsonProperty(value = "trumpfColor", required = false) RemoteColor trumpfColor) {
        this.mode = trumpf;
        this.trumpfColor = trumpfColor;
    }

    public Trumpf getMode() {
        return mode;
    }

    public RemoteColor getTrumpfColor() {
        return trumpfColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrumpfChoice that = (TrumpfChoice) o;

        if (mode != that.mode) return false;
        return trumpfColor == that.trumpfColor;

    }

    @Override
    public int hashCode() {
        int result = mode != null ? mode.hashCode() : 0;
        result = 31 * result + (trumpfColor != null ? trumpfColor.hashCode() : 0);
        return result;
    }
}
